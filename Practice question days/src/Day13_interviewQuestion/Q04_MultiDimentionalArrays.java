package Day13_interviewQuestion;

import java.util.Arrays;

public class Q04_MultiDimentionalArrays {
      /*
int arr [][]={{7,12,97,23},{543,23,675},{2},{2,33,6,3,7}};
verilen Array icinde
--> kac tane eleman oldugunu return eden methodu yazdiriniz
//cevap : 13 donsun
*/
      public static void main(String[] args) {

          int arr [][]={{7,12,97,23},{543,23,675},{2},{2,33,6,3,7}};
          elemansayisi(arr);

      }

    private static void elemansayisi(int[][] arr) {
        int sayac=0;
        for (int i = 0; i <arr.length ; i++) {
            for (int j = 0; j <arr[i].length; j++) {
                sayac++;

            }  System.out.println(Arrays.toString(arr[i]));
        }
        System.out.println(sayac);
    }
}
