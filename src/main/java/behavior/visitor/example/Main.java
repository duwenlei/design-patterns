package behavior.visitor.example;

/**
 * @author duwenlei
 * @version 1.0
 * @ClassName Main
 * @Date 2023/9/4 14:36
 * @Description TODO
 */
public class Main {
    /**
     * 没有使用访问者模式
     * 如果后续需要增加其他的操作，比如旋转，修改字体等操作，那么每个 Shape 的实现都需要进行修改
     *
     * @param args
     */
    public static void main(String[] args) {
        Circle circle = new Circle();
        Rectangle rectangle = new Rectangle();

        circle.draw();
        circle.resize();

        rectangle.draw();
        rectangle.resize();
    }
}
