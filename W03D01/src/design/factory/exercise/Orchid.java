package design.factory.exercise;

public class Orchid implements Flower {
    @Override
    public String name() {
        return "Orchid";
    }

    @Override
    public String color() {
        return "Purple";
    }
}
