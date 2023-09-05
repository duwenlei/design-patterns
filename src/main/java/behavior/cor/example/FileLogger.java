package behavior.cor.example;

/**
 * @author duwenlei
 * @version 1.0
 * @ClassName FileLogger
 * @Date 2023/9/5 9:57
 * @Description TODO
 */
public class FileLogger extends AbstractLogger {
    public FileLogger(int level) {
        this.level = level;
    }

    @Override
    protected void write(String msg) {
        System.out.println("File log::" + msg);
    }
}
