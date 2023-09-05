package behavior.visitor.example1;

/**
 * @author duwenlei
 * @version 1.0
 * @ClassName Main
 * @Date 2023/9/4 15:24
 * @Description TODO
 */
public class Main {
    public static void main(String[] args) {
        Shape circle = new Circle();
        Shape rectangle = new Rectangle();

        DrawVisitor drawVisitor = new DrawVisitor();
        ResizeVisitor resizeVisitor = new ResizeVisitor();

        circle.accept(drawVisitor);
        circle.accept(resizeVisitor);

        rectangle.accept(drawVisitor);
        rectangle.accept(resizeVisitor);
    }
}
