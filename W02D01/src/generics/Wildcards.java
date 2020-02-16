package generics;

import java.util.ArrayList;
import java.util.List;

public class Wildcards {

    public static void main(String[] args) {

        List<Integer> intList = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            intList.add(i + 7%5);
        }
        List<String> strList = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            strList.add("a" + i);
        }

//        zad3_1(intList);
//        zad3_1(strList);

        System.out.println();

//        zad3_2(intList);
//        zad3_2(strList);

        List<?> resultList = zad4(intList, intList);

        for (int i = 0; i < resultList.size(); i++) {
            System.out.println(resultList.get(i));
        }


    }

    private static List<? extends Number> zad4(List<? extends Number> lista1, List<? extends Number> lista2) {
        List<Number> returnList = new ArrayList<>();

        returnList.addAll(lista1);
        returnList.addAll(lista2);

        return returnList;
    }


    private static <T extends Number> void zad3_2(List<T> list) {
        for (T elem: list){
            System.out.println(elem);
        }
    }

    private static void zad3_1(List<? extends Number> lista) {
        for (int i = 0; i < lista.size(); i++) {
            System.out.println(lista.get(i));
        }
    }




    private static void exampleUsage() {
        List<String> stringi = new ArrayList<>();
        List<Integer> inty = new ArrayList<>();
        List<Double> doubles = new ArrayList<>();


        /* Upper */
        // dla Type Parameters – blad
//        copyType(stringi, inty);

        // Ok
        copyType(inty, inty);

        // blad
//        copyType(stringi, stringi);


        // dla Wildcards:
        // Ok
        copyWildcard(doubles, inty);

        // tylko liczby
//        copyWildcard(stringi, inty);

    }

    private static <T extends Number> void copyType(List<T> form, List<T> to) {
    }

    private static void copyWildcard(List<? extends Number> from, List<? extends Number> to) {
    }

}
