package factory.exercise;

public class Tulip implements Flower {
    @Override
    public String color() {
        return "Yellow";
    }

    @Override
    public String name() {
        return "Tulip";
    }
}
