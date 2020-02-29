package factory.builder;

public class Kebab {
    public enum Meat {
        CHICKEN, MUTTON, BEEF, NONE
    }
    public enum Bun {
        TORTILLA, BREAD_BUN, BOX
    }
    public enum Sauce {
        TOMATO, GARLIC, MIXED
    }

    private Meat meatType;
    private Bun bun;
    private Sauce sauce;
    private boolean tomato;
    private boolean onion;
    private boolean lettuce;

    public static class Builder{
        private Kebab kebab;

        public Builder() {
            this.kebab = new Kebab();
        }

        public Builder setMeat(Meat meat){
            kebab.meatType = meat;
            return this;
        }

        public Builder setBun(Bun bun){
            kebab.bun = bun;
            return this;
        }

        public Builder setSauce(Sauce sauce){
            kebab.sauce = sauce;
            return this;
        }

        public Builder setTomato(){
            kebab.tomato = true;
            return this;
        }

        public Builder setOnion(){
            kebab.onion = true;
            return this;
        }

        public Builder setLettuce(){
            kebab.lettuce = true;
            return this;
        }

        public Kebab build(){
            return kebab;
        }
    }

    @Override
    public String toString() {
        return "Kebab{" +
                "meatType=" + meatType +
                ", bun=" + bun +
                ", sauce=" + sauce +
                ", tomato=" + tomato +
                ", onion=" + onion +
                ", lettuce=" + lettuce +
                '}';
    }
}
