package designpatterns.decorator.theory;

public class BasicCar implements Car {

    @Override
    public void assembly() {
        System.out.println("A basic car has been assembled.");
    }
}
