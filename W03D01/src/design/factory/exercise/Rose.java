package design.factory.exercise;

public class Rose implements Flower {
    @Override
    public String name() {
        return "Rose";
    }

    @Override
    public String color() {
        return "Red";
    }
}
