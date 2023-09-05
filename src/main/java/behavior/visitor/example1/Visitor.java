package behavior.visitor.example1;

public interface Visitor {
    void visit(Circle circle);

    void visit(Rectangle rectangle);
}
