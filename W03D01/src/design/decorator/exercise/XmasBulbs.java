package design.decorator.exercise;

public class XmasBulbs extends XmasTreeDecorator {
    public XmasBulbs(XmasTree tree) {
        super(tree);
    }

    @Override
    public void decorate() {
        super.decorate();
        System.out.println("Adding christmas bulbs...");
    }
}
