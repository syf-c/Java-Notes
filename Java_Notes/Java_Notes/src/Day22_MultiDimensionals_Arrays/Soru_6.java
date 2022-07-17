package Day22_MultiDimensionals_Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Soru_6 {
    /*
      Soru 6) Verilen bir Array'den isten degere esit olan elamanlari kaldirip, kalanlari yeni bir
              Array olarak yazdiran bir method yaziniz
     */
    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);
        System.out.println("hangi elemani cikarmak istiyorsunuz");
        int istenen = scan.nextInt();

        int[] sayilar = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        System.out.println(Arrays.toString(sayilar));
        int[] yeniList = new int[sayilar.length];

        for (int i = 0; i < sayilar.length; i++) {
            if (sayilar[i] != istenen) {
                yeniList[i] = sayilar[i];
            }
        }
        System.out.println(Arrays.toString(yeniList));
    }

}