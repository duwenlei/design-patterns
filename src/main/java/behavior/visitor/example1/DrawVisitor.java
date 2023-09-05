package behavior.visitor.example1;

/**
 * @author duwenlei
 * @version 1.0
 * @ClassName CircleVisitor
 * @Date 2023/9/4 15:21
 * @Description TODO
 */
public class DrawVisitor implements Visitor {
    @Override
    public void visit(Circle circle) {
        System.out.println("drawing a circle");
    }

    @Override
    public void visit(Rectangle rectangle) {
        System.out.println("drawing a rectangle");
    }
}
