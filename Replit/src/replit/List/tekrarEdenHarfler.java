package replit.List;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class tekrarEdenHarfler {
    public static void main(String[] args) {
        String input = "Learning java is easy";
        input = input.replaceAll(" ", "");
        String[] arr = input.split("");

        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));

        List<String> repeated = new ArrayList<String>();
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {

                if (arr[i].equalsIgnoreCase(arr[j]) && !repeated.contains(arr[i])) {
                    repeated.add(arr[i]);
                }
            }
        }
        System.out.println(repeated);
    }
}