package design.factory.exercise;

public enum FlowerType {
    TULIP(0), ORCHID(1), ROSE(2);

    private final int index;

    FlowerType(int i) {
        this.index = i;
    }

    public int getIndex() {
        return index;
    }
}
