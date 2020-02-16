import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Streams {
    public static void main(String[] args) {
        zad1();

        List<Integer> intList = new ArrayList<>();
        for (int i = -10; i < 10 ; i++) {
            intList.add(i);
        }

        System.out.println("\nzad2");
        List<Integer> filteredList = zad2(intList);
        for (Integer i: filteredList){
            System.out.println(filteredList.get(i));
        }

        System.out.println("\nzad3");
        List<String> stringList = new ArrayList<>(Arrays.asList("hey", "yoz", "kuz"));
        System.out.println(stringList);
        List<String> newStrList = zad3(stringList);
        System.out.println(newStrList);

        System.out.println("\nzad4");
        zad4();

        System.out.println("\nzad5");
        List<User> usersList = new ArrayList<>();
        usersList.add(new User("Kamil", 22, 73.5));
        usersList.add(new User("Adam", 32, 73.5));
        usersList.add(new User("Franek", 45, 84.3));
        usersList.add(new User("Ania", 10, 60));
        usersList.add(new User("Agata", 22, 63.8));

        for(User u: usersList){
            System.out.println(u);
        }

        System.out.println();
        zad5(usersList);
    }

    private static void zad5(List<User> list) {
        list.stream()
                .max(Comparator.comparingDouble(User::getWeight))
                .ifPresent(System.out::println);

        System.out.println();
        list.stream()
                .filter(u -> u.getAge() > 18)
                .map(u -> new User("D " + u.getName(), u.getAge(), u.getWeight()))
                .forEach(System.out::println);
    }

    private static void zad4() {
        IntStream.range(0,51)
                .filter(i -> i%2 == 0)
                .map(i -> i/5)
                .asDoubleStream()
                .mapToObj(s -> "Liczba: " + s)
                .forEach(System.out::println);
    }

    private static List<String> zad3(List<String> list) {
        return list.stream().filter(s -> !s.contains("z")).collect(Collectors.toList());
    }

    private static List<Integer> zad2(List<Integer> list) {
        return list.stream().filter(s -> s >= 0).collect(Collectors.toList());
    }

    private static void zad1() {
        IntStream.range(0,21)
                .forEach(System.out::println);
    }
}
