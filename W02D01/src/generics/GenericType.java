package generics;

public class GenericType<T, S> {
    private T daneT;
    private S daneS;

    public GenericType(T t, S s) {
        this.daneT = t;
        this.daneS = s;
    }

    public T getDaneT() {
        return daneT;
    }

    public void setDaneT(T dane) {
        this.daneT = dane;
    }

    public S getDaneS() {
        return daneS;
    }

    public void setDaneS(S daneS) {
        this.daneS = daneS;
    }

    @Override
    public String toString() {
        return "GenericType{" +
                "dane=" + daneT +
                '}';
    }
}
