package files;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class FileTheory {
    public static void main(String[] args) throws IOException {

        getIfnoAboutNewFile();
        ex7();
        ex8();
    }

    private static void ex8() {
        System.out.println("8. Podaj sciezke do pliku: ");
        System.out.println("~$ ");

        Scanner scanner = new Scanner(System.in);
        String path = scanner.nextLine();
        try (Scanner fileScanner = new Scanner(new File(path))){
            int lineCounter = 0;
            while (fileScanner.hasNext()){
                lineCounter++;
                System.out.println(fileScanner.nextLine());
            }
            System.out.println("Ilosc lini w pliku: " + lineCounter);
        } catch (IOException e) {
            System.out.println("Error!");
            e.printStackTrace();
        }
    }

    private static void ex7(){
        System.out.println("7. Podaj sciezke do pliku: ");
        System.out.println("~$ ");
        String path;
        Scanner scanner = new Scanner(System.in);
        path = scanner.nextLine();

        try(FileOutputStream file = new FileOutputStream(path)) {
            while (true){
                System.out.println("Podaj linie do wpisania do pliku: ");
                System.out.println("~$ ");
                String buf = scanner.nextLine();
                if (buf.equals("-"))
                    break;

                byte[] byteArr = buf.getBytes();

                file.write(byteArr);
                file.write("\n".getBytes());
            }


        } catch (NullPointerException | IOException e){
            System.out.println("Nie udalo sie!");
        }
    }


    private static void getIfnoAboutNewFile() throws IOException {
        File file = new File("text.txt");

        System.out.println("Name: " + file.getName());
        System.out.println("Path: " + file.getPath());
        System.out.println("Is directory: " + file.isDirectory());
        System.out.println("IsFile: " + file.isFile());
        System.out.println("Exists: " + file.exists());

        try {
            if (file.createNewFile()) {
                System.out.println("Utworzono plik!");
            } else {
                System.out.println("Plik już istnieje!");
            }
        } catch (IOException e) {
            System.out.println("ERROR");
        }

        System.out.println("Name: " + file.getName());
        System.out.println("Path: " + file.getPath());
        System.out.println("Is directory: " + file.isDirectory());
        System.out.println("IsFile: " + file.isFile());
        System.out.println("Exists: " + file.exists());

    }
}
