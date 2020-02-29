package factory;

public class Fiat implements Car {
    @Override
    public String productionCountry() {
        return "Italy";
    }
}
