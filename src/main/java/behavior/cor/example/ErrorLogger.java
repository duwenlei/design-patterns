package behavior.cor.example;

/**
 * @author duwenlei
 * @version 1.0
 * @ClassName ErrorLogger
 * @Date 2023/9/5 9:56
 * @Description TODO
 */
public class ErrorLogger extends AbstractLogger {
    public ErrorLogger(int level) {
        this.level = level;
    }

    @Override
    protected void write(String msg) {
        System.out.println("Error log::" + msg);
    }
}
