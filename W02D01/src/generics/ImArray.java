package generics;

public class ImArray<T> {
    private T[] arr;

    public ImArray(T[] tab) {
        this.arr = tab;
    }

    public void setAt(int index, T dane){
        this.arr[index] = dane;
    }


    public T at(int index){
        return arr[index];
    }

    public int getSize(){
        return this.arr.length;
    }

}
