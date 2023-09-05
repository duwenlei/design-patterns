package behavior.visitor.example1;

/**
 * @author duwenlei
 * @version 1.0
 * @ClassName Rectangle
 * @Date 2023/9/4 15:17
 * @Description TODO
 */
public class Rectangle implements Shape {

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
