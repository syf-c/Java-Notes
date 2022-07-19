package Day24_arrayList_forEachLoop;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C03_TekrarEdenSayilar {
    public static void main(String[] args) {
        // Soru 1) Repeating elements in a given arrayi yazdirin.
        int[] arr = {2, 3, 5, 6, 3, 5, 4, 1, 9, 6, 3, 5, 5,9};

        List<Integer> tekraredenler= new ArrayList<>();
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));

        for (int i = 0; i <arr.length ; i++) {
            for (int j = i+1; j <arr.length ; j++) {
                if(arr[i]==arr[j] && !tekraredenler.contains(arr[i])) {
                    System.out.print(arr[i]+ " ");
                    tekraredenler.add(arr[i]);
                }
            }
        }
        System.out.println(tekraredenler);




    }
}