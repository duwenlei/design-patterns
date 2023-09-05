package behavior.cor.example;

/**
 * @author duwenlei
 * @version 1.0
 * @ClassName AbstractLogger
 * @Date 2023/9/5 9:47
 * @Description TODO
 */
public abstract class AbstractLogger {
    public static int INFO = 1;
    public static int DEBUG = 2;
    public static int ERROR = 3;


    protected int level;

    protected AbstractLogger nextLogger;

    public void setNextLogger(AbstractLogger nextLogger) {
        this.nextLogger = nextLogger;
    }

    public void log(int level, String msg) {
        if (this.level <= level) {
            write(msg);
        }

        if (nextLogger != null) {
            nextLogger.log(level, msg);
        }
    }

    abstract protected void write(String msg);

}
