package behavior.visitor.example;

/**
 * @author duwenlei
 * @version 1.0
 * @ClassName Circle
 * @Date 2023/9/4 14:33
 * @Description TODO
 */
public class Rectangle implements Shape {
    @Override
    public void draw() {
        System.out.println("Drawing a Rectangle");
    }

    @Override
    public void resize() {
        System.out.println("Resizing a Rectangle");
    }
}
