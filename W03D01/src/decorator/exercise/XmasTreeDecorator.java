package decorator.exercise;

public abstract class XmasTreeDecorator implements XmasTree {
    XmasTree tree;

    public XmasTreeDecorator(XmasTree tree) {
        this.tree = tree;
    }

    @Override
    public void decorate() {
        this.tree.decorate();
    }
}
