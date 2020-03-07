
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static int ConvertBinaryArrayToInt(List<Integer> binary) {
        binary.stream()
                .

        int result = 0;
        int index = binary.size();
        for (int i : binary) {
            if (i == 1) {
                result += Math.pow(2, index - 1);
            }
            index--;
        }
        return result;
    }


    public static void main(String[] args) {
        List<Integer> arr = new ArrayList<>();
        arr.add(1);
        arr.add(1);
        arr.add(0);
        System.out.println(arr);
        System.out.println(ConvertBinaryArrayToInt(arr));
    }
}
