package behavior.cor.example;

/**
 * @author duwenlei
 * @version 1.0
 * @ClassName ConsoleLogger
 * @Date 2023/9/5 9:55
 * @Description TODO
 */
public class ConsoleLogger extends AbstractLogger {
    public ConsoleLogger(int level) {
        this.level = level;
    }

    @Override
    protected void write(String msg) {
        System.out.println("Console log::" + msg);
    }
}
