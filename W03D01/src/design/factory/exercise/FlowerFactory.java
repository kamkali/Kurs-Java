package design.factory.exercise;

import java.util.concurrent.ThreadLocalRandom;

public class FlowerFactory {
    public Flower createFlower(FlowerType flower) {
        switch (flower) {
            case ROSE:
                return new Rose();
            case TULIP:
                return new Tulip();
            case ORCHID:
                return new Orchid();
            default:
                return null;
        }
    }

    public Flower createFlower() {
        int random = ThreadLocalRandom.current().nextInt(0, 3);
        FlowerType[] flowerTab = FlowerType.values();
        return createFlower(flowerTab[random]);
    }
}
