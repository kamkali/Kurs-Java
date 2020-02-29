package factory.builder;

public interface Builder {
//    Kebab build();

    enum Meat {
        CHICKEN, MUTTON, BEEF, NONE
    }
    enum Bun {
        TORTILLA, BREAD_BUN, BOX
    }
    enum Sauce {
        TOMATO, GARLIC, MIXED
    }
    enum Toppings {
        TOMATO, ONION, LETTUCE, CHEESE, FRIES
    }

    void setMeat(Meat meat);

    void setBun(Bun bun);

    void setSauce(Sauce sauce);

    void setTopping(Toppings topping);

}
