package mediatheque;

public interface ItemVisitor {
    void visit(Book item);
    void visit(CD item);
}
