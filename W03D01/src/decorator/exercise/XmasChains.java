package decorator.exercise;

public class XmasChains extends XmasTreeDecorator {
    public XmasChains(XmasTree tree) {
        super(tree);
    }

    @Override
    public void decorate() {
        super.decorate();
        System.out.println("Adding chains...");
    }
}
