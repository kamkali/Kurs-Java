package design.factory.theory;

public class CarFactory {
    public Car create(Brand brand) {
        switch (brand) {
            case FIAT:
                return new Fiat();
            case FORD:
                return new Ford();
            case HONDA:
                return new Honda();
            default:
                return null;
        }
    }
}
