package behavior.cor.example;

/**
 * @author duwenlei
 * @version 1.0
 * @ClassName Main
 * @Date 2023/9/5 9:58
 * @Description TODO
 */
public class Main {
    private static AbstractLogger getLoggerChain() {
        ConsoleLogger consoleLogger = new ConsoleLogger(AbstractLogger.INFO);
        FileLogger fileLogger = new FileLogger(AbstractLogger.DEBUG);
        ErrorLogger errorLogger = new ErrorLogger(AbstractLogger.ERROR);

        errorLogger.nextLogger = fileLogger;
        fileLogger.nextLogger = consoleLogger;
        return errorLogger;
    }

    public static void main(String[] args) {
        AbstractLogger logger = getLoggerChain();

        logger.log(AbstractLogger.INFO, "INFO 日志");
        System.out.println();
        logger.log(AbstractLogger.DEBUG, "DEBUG 日志");
        System.out.println();
        logger.log(AbstractLogger.ERROR, "ERROR 日志");
    }
}
