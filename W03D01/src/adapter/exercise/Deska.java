package adapter.exercise;

public class Deska implements Drewno {
    private double len;
    private double mass;

    public Deska(double len, double mass) {
        this.len = len;
        this.mass = mass;
    }

    @Override
    public double getLength() {
        return this.len;
    }

    @Override
    public double getMass() {
        return this.mass;
    }

    @Override
    public String toString() {
        return "Deska{" +
                "len=" + len +
                ", mass=" + mass +
                '}';
    }
}
