package designpatterns.builder;

import java.util.List;

public class Kebab {
    private Builder.Meat meatType;
    private Builder.Bun bun;
    private Builder.Sauce sauce;
    private List<Builder.Toppings> toppings;

    public Kebab(Builder.Meat meatType, Builder.Bun bun, Builder.Sauce sauce, List<Builder.Toppings> toppings) {
        this.meatType = meatType;
        this.bun = bun;
        this.sauce = sauce;
        this.toppings = toppings;
    }


    @Override
    public String toString() {
        return "Kebab{" +
                "meatType=" + meatType +
                ", bun=" + bun +
                ", sauce=" + sauce +
                ", toppings=" + toppings +
                '}';
    }
}
