import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class FileHistogram {
    public static void main(String[] args) {
        // punkt1 - zaladuj dane z pliku
        String fileName = "dane.txt";

        String loadedText = loadDataFromFile(fileName);

        Map<Character,Integer> histogram = makeHistogram(loadedText);

        saveHistogramToFile(histogram, "savedHistogram.txt");

        reverseText(loadedText, "wspak.txt");

        replaceMostCommon(loadedText, histogram, "replaced.txt");

    }

    private static void replaceMostCommon(String loadedText, Map<Character, Integer> histogram, String fileName) {
        int prevVal = 0;
        char prevKey = '0';
        int maxVal = 0;
        char maxKey = '0';

        for(Map.Entry<Character,Integer> entry: histogram.entrySet()){
            if(maxVal < entry.getValue()){
                maxVal = entry.getValue();
                maxKey = entry.getKey();
            }
        }
        for(Map.Entry<Character,Integer> entry: histogram.entrySet()){
            if(prevVal < entry.getValue() && entry.getKey() != maxKey){
                prevVal = entry.getValue();
                prevKey = entry.getKey();
            }
        }

        char[] charArray = loadedText.toCharArray();

        for (int i = 0; i < charArray.length; i++) {
            if (charArray[i] == maxKey){
                charArray[i] = prevKey;
            } else if (charArray[i] == prevKey){
                charArray[i] = maxKey;
            }
        }

        try(FileWriter file = new FileWriter(fileName)) {

            for (char c: charArray) {
                file.write(c);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }



    private static void reverseText(String loadedText, String fileName) {
        try(FileWriter file = new FileWriter(fileName)) {

            for (int i = loadedText.length() - 1; i >= 0 ; i--) {
                file.write(loadedText.charAt(i));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void saveHistogramToFile(Map<Character, Integer> histogram, String fileName) {
        try(FileWriter file = new FileWriter(fileName)) {
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
