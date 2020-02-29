package factory.builder;

public class KebabNested {
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
        private KebabNested kebabNested;

        public Builder() {
            this.kebabNested = new KebabNested();
        }

        public Builder setMeat(Meat meat){
            kebabNested.meatType = meat;
            return this;
        }

        public Builder setBun(Bun bun){
            kebabNested.bun = bun;
            return this;
        }

        public Builder setSauce(Sauce sauce){
            kebabNested.sauce = sauce;
            return this;
        }

        public Builder setTomato(){
            kebabNested.tomato = true;
            return this;
        }

        public Builder setOnion(){
            kebabNested.onion = true;
            return this;
        }

        public Builder setLettuce(){
            kebabNested.lettuce = true;
            return this;
        }

        public KebabNested build(){
            return kebabNested;
        }
    }

    @Override
    public String toString() {
        return "KebabNested{" +
                "meatType=" + meatType +
                ", bun=" + bun +
                ", sauce=" + sauce +
                ", tomato=" + tomato +
                ", onion=" + onion +
                ", lettuce=" + lettuce +
                '}';
    }
}
