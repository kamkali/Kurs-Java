package adapter.theory;

public class FerrariAdapter {
    // potrzeba nam zwrocic wartosc w km/h
    public static void main(String[] args) {
        Parameters ferrariMph = new Ferrari();
        System.out.println(ferrariMph.getMaxSpeed());  // blad! wynik w MPH

        ParametersConverted ferrariKph = new FerrariConverter(ferrariMph);

        System.out.println(ferrariKph.getMaxSpeed());
    }
}
