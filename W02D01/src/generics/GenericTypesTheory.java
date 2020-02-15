package generics;

public class GenericTypesTheory {
    public static void main(String[] args) {
        GenericType<String, Integer> generic1 = new GenericType<>("haha", 2);

        System.out.println(generic1.getDaneT());
        System.out.println(generic1.getDaneS());

        System.out.println();
        System.out.println("Zadanie 2");

        String[] tab = new String[5];

        ImArray<String> intArr = new ImArray<>(tab);

        intArr.setAt(0, "haha0");
        intArr.setAt(1, "haha1");
        intArr.setAt(2, "hehe2");
        intArr.setAt(3, "hihi3");

        System.out.println(intArr.getSize());
        System.out.println(intArr.at(0));

    }
}
