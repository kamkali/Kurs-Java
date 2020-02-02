package files;

import java.io.File;
import java.io.IOException;

public class FIleTheory {
    public static void main(String[] args) throws IOException {

        getIfnoAboutNewFile();
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
