package behavior.visitor.example1;

/**
 * @author duwenlei
 * @version 1.0
 * @ClassName ResizeVisitor
 * @Date 2023/9/4 15:24
 * @Description TODO
 */
public class ResizeVisitor implements Visitor {
    @Override
    public void visit(Circle circle) {
        System.out.println("resizing a circle");
    }

    @Override
    public void visit(Rectangle rectangle) {
        System.out.println("resizing a rectangle");
    }
}
