package designpatterns.adapter.theory;

public class Ferrari implements Parameters {

    @Override
    public double getMaxSpeed() {
        return 200;     //MPH
    }
}
