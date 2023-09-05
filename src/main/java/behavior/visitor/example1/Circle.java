package behavior.visitor.example1;

/**
 * @author duwenlei
 * @version 1.0
 * @ClassName Circle
 * @Date 2023/9/4 15:16
 * @Description TODO
 */
public class Circle implements Shape {


    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
