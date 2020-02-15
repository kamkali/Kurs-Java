import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class FileHistogram {
    public static void main(String[] args) {
        // punkt1 - zaladuj dane z pliku
        String fileName = "dane.txt";

        String loadedText = loadDataFromFile(fileName);

        Map<Character,Integer> histogram = makeHistogram(loadedText);

        System.out.println(histogram);

        try(FileWriter file = new FileWriter("savedHistogram.txt")) {
            for (Map.Entry<Character,Integer> entry: histogram.entrySet()){
                file.write(entry.getKey() + " : " + entry.getValue() + "\n");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static Map<Character,Integer> makeHistogram(String loadedText) {
        Map<Character,Integer> histogram = new HashMap<>();
        int initValue = 1;

        for (int i = 0; i < loadedText.length() - 1; i++) {
            if (!histogram.containsKey(loadedText.charAt(i))){
                histogram.put(loadedText.charAt(i), initValue);
            } else {
                int newVal = histogram.get(loadedText.charAt(i));
                histogram.replace(loadedText.charAt(i), ++newVal);
            }
        }
        return histogram;
    }

    private static String loadDataFromFile(String fileName) {

        File file = new File(fileName);
        StringBuilder sb = new StringBuilder();

        try (Scanner scanner = new Scanner(file)){
            while (scanner.hasNextLine()) {
                sb.append(scanner.nextLine());
                sb.append("\n");
            }
        }catch (Exception e){
            System.out.println("Exception thrown! " + e.getMessage());
        }
        return sb.toString();
    }
}
