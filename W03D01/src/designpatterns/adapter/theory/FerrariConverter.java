package designpatterns.adapter.theory;

public class FerrariConverter implements ParametersConverted{
    private Parameters data;

    public FerrariConverter(Parameters data) {
        this.data = data;
    }

    @Override
    public double getMaxSpeed() {
        return data.getMaxSpeed() * 1.6;
    }
}
