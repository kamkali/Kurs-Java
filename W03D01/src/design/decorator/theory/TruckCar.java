package design.decorator.theory;

public class TruckCar extends CarDecorator {
    @Override
    public void assembly() {
        super.assembly();
        System.out.println("I am a truck!");
    }

    public TruckCar(Car car) {
        super(car);
    }
}
