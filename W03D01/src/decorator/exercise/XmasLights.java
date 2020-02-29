package decorator.exercise;

public class XmasLights extends XmasTreeDecorator {
    public XmasLights(XmasTree tree) {
        super(tree);
    }

    @Override
    public void decorate() {
        super.decorate();
        System.out.println("Adding lights...");
    }
}
