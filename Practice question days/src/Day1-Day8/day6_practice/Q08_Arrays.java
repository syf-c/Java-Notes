package day6_practice;

import java.util.Arrays;
import java.util.Scanner;

public class Q08_Arrays {

     /*
         Kullanicidan aldigimiz 8 elemanli arrayin icinde
         kac tane 3 e bolunebilen sayi vardir ?(negatif sayilar da dahil olsun)
        */

    public static void main(String[] args) {
        int[] array = new int[8];
        Scanner scan = new Scanner(System.in);
        int sayac = 0;
        for (int i = 0; i < array.length; i++) {
            System.out.print(i + ". indexteki sayiyi giriniz :");
            array[i] = scan.nextInt();
            System.out.println(array[i]);
            if (array[i] % 3 == 0) {
                sayac++;
            }
        }
        System.out.println("3'e tam bolunebilen sayi : " + sayac);

    }

}
