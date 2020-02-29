package adapter.exercise;

public class DeskaAdapter implements DrewnoConverter {
    Drewno drewno;

    public DeskaAdapter(Drewno drewno) {
        this.drewno = drewno;
    }

    @Override
    public double getLength() {
        return drewno.getLength() * 0.0328084;
    }

    @Override
    public double getMass() {
        return drewno.getMass() * 2.204623;
    }


}
