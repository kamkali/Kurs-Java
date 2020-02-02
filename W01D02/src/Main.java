import java.lang.reflect.Array;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("Zadanie1");
        ex1();
        System.out.println("Zadanie2");
        ex2();
        System.out.println("Zadanie3");
        ex3();
        System.out.println("Zadanie4");
        ex4();
        System.out.println("Zadanie5");
        ex5();
    }

    private static void ex1(){
        for (int i = 30; i >= 20; i--){
            System.out.print(i+ " ");
        }
    }

    private static void ex2(){
        for (int i = -5 ; i < 15; i++){
            if (i%2 == 1 || i%2 == -1)
                System.out.print(i + " ");
        }
    }

    private static void ex3(){
        int[] arr = new int[]{1,2,3,4,5};

        int arrSum = suma(arr);

        System.out.println("Sum of array elements: " + arrSum);
    }

    private static int suma(int[] tablica){
        int arrSum = 0;
        for (int a : tablica){
            arrSum += a;
        }
        return arrSum;
    }

    private static void ex4(){
        System.out.println("Wprowadz państwo: ");
        Set<String> cities = new HashSet<>();
        Scanner scanner = new Scanner(System.in);

        while (true){
            String inputCity = scanner.nextLine();
            if (inputCity.equals("-"))
                break;
            cities.add(inputCity);
        }
    }

    private static void ex5(){
        Map<String, String> countryWithCapital = new HashMap<>();
        Scanner scanner = new Scanner(System.in);

        while (true){
            System.out.println("Wprowadz państwo: ");
            String inputCountry = scanner.nextLine();
            System.out.println("Wprowadz stolice");
            String inputCapital = scanner.nextLine();

            if (inputCapital.equals("-") || inputCountry.equals("-"))
                break;

            countryWithCapital.put(inputCountry, inputCapital);
            }
        System.out.println("Check capital city for country. Please input a Country: ");

        String input = scanner.nextLine();

        System.out.println("Capital city of " + input + " is " + countryWithCapital.get(input));
        }
    }

