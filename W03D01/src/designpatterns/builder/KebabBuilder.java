package designpatterns.builder;

import java.util.ArrayList;
import java.util.List;

public class KebabBuilder implements Builder {
    private Meat meatType;
    private Bun bun;
    private Sauce sauce;
    List<Toppings> toppings = new ArrayList<>();


    @Override
    public void setMeat(Meat meat) {
        this.meatType = meat;
    }

    @Override
    public void setBun(Bun bun) {
        this.bun = bun;
    }

    @Override
    public void setSauce(Sauce sauce) {
        this.sauce = sauce;
    }

    @Override
    public void setTopping(Toppings topping) {
        this.toppings.add(topping);
    }

    public Kebab build(){
        return new Kebab(meatType, bun, sauce, toppings);
    }
}
