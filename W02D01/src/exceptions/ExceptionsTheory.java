package exceptions;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionsTheory {
    public static void main(String[] args) throws DivideByZeroException {

//        catchCrash();
//        zad1();
//        zad2();
        zad3();
    }

    private static void zad3() {
        boolean success = false;
        double val;
        double result = 0;
        Scanner scanner = new Scanner(System.in);
        do {
            try{
                System.out.println("Podaj liczbę: ");
                String input = scanner.next();
                val = Double.parseDouble(input);

                if (val < 0)
                    throw new IllegalArgumentException("Liczba mniejsza niz 0!");

                result = Math.sqrt(val);
                success = true;

            }catch (NumberFormatException e){
                System.out.println("NumberFormatException " + e.getMessage());
            }
            catch(IllegalArgumentException e){
                System.out.println("IllegalArgumentException " + e.getMessage());
            }
            catch(InputMismatchException e){
                System.out.println("InputMismatchException " + e.getMessage());
            }
        } while (!success);
        System.out.println("Wynik to: " + result);
    }


    private static void zad2() {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Podaj odleglosc w nie wieksza niz 100");
            int distance = scanner.nextInt();
            if (distance > 100)
                throw new TooFarException("Jesteś za daleko!");
        } catch (TooFarException e){
            System.out.println(e.getMessage());
        }
    }

    private static void zad1() {
        try (Scanner scanner = new Scanner(System.in)){
            System.out.println("Witaj! podaj godzine w zakresie 0-24");
            int hour = scanner.nextInt();
            if (hour > 24 || hour < 0)
                throw new IllegalArgumentException("Błędna godzina!");
            System.out.println("Podales godzine: " + hour);
        } catch (IllegalArgumentException e){
            System.out.println(e.getMessage());
        } finally {
            System.out.println("Do zobaczenia jutro!");
        }
    }

    private static void catchCrash() throws DivideByZeroException {
        Scanner scanner = new Scanner(System.in);
        int value = scanner.nextInt();
        if (value == 0)
            throw new DivideByZeroException("Dzielenie przez zero!!!");
        else
            System.out.println(20/0);
    }
}
