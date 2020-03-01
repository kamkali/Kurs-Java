package datetime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneOffset;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DateMain {
    public static void main(String[] args) {
//        theory();
//        ex1();
//        ex2();
//        ex3();
//        ex4();
//        ex5(3, 15);
//        ex6("2020-03-01T09:50:01");
//        ex7();
    }

    private static void ex7() {
        LocalDate now = LocalDate.now();
        int result = now.lengthOfYear() -  now.getDayOfYear();
        System.out.println(result);
    }

    private static void ex6(String input) {
        LocalDateTime time = LocalDateTime.parse(input);
        LocalDateTime yearBeginningTime = LocalDateTime.of(2020, 1,1,0,0,0);
        long hoursResult = time.toEpochSecond(ZoneOffset.UTC) - yearBeginningTime.toEpochSecond(ZoneOffset.UTC);
        System.out.println(hoursResult / 3600);
    }

    private static void ex5(int nHours, int mMinutes) {
        LocalDateTime datetime = LocalDateTime.now();
        LocalDateTime resultDate = datetime.minusHours(nHours).plusMinutes(mMinutes);

        System.out.println(resultDate);

    }

    private static void ex4() {
        LocalTime time = LocalTime.now();
        int seconds = time.toSecondOfDay();
        System.out.println(String.format("%d:%d", seconds / 3600, (seconds % 3600) / 60));
    }

    private static void ex3() {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Podaj rok: ");
            String year = scanner.nextLine();
            int yearNum = Integer.parseInt(year);

            int day;
            do {
                System.out.println("Zgadnij dzien ");
                day = Integer.parseInt(scanner.nextLine());
            } while (1 != LocalDate.ofYearDay(yearNum, day).getDayOfMonth());
            
            System.out.println("Zgadłeś!");
            
        }catch (Exception e){
            System.out.println(e);
        }
    }

    private static void ex2() {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Podaj rok: ");
            String year = scanner.nextLine();
            int yearNum = Integer.parseInt(year);

            List<Integer> dayList = new ArrayList<>();

            for (int i = 0; i < 3; i++) {
                System.out.println("Podaj dzien w roku: ");
                dayList.add(Integer.parseInt(scanner.nextLine()));
            }

            for (int i : dayList){
                System.out.println(LocalDate.ofYearDay(yearNum, i));
            }

        } catch (Exception e){
            System.out.println(e);
        }
    }

    private static void ex1() {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Podaj date w formie (year-month-day): ");

            LocalDate date = LocalDate.parse(scanner.nextLine());

            System.out.println(date.minusYears(22).minusDays(10) + " : " + date.plusYears(22).plusDays(10));
        }catch (Exception e){
            System.out.println(e);
        }
    }

    private static void theory() {
        LocalDate date = LocalDate.now();
        System.out.println(date);

        LocalDate future = LocalDate.of(2020, 5, 7);
        System.out.println(future.getDayOfYear());

        LocalDate dayBefore = future.minusDays(1);
        System.out.println(dayBefore);

        LocalTime czas = LocalTime.now();
        System.out.println(czas);
    }
}
