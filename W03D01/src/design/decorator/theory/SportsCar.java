package design.decorator.theory;

public class SportsCar extends CarDecorator {
    private Car car;

    public SportsCar(Car car) {
        super(car);
    }

    @Override
    public void assembly() {
        super.assembly();
        System.out.println("Spoiler added. I am now sports car.");
    }
}
