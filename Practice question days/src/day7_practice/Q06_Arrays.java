package day7_practice;

import java.util.Arrays;
import java.util.Scanner;

public class Q06_Arrays {

       /*
    kullanıcının girdigi bir array'in en buyuk elemani ile
    en kucuk elemanının  farkını bulan bir method create ediniz.
    */
       public static void main(String[] args) {
           Scanner scanner = new Scanner(System.in);
           System.out.println("kac adet sayi girmek istersiniz :");
           int sayi = scanner.nextInt();

           int[] sayilar= new int[sayi];
           for (int i = 0; i <sayilar.length ; i++) {
               System.out.print(i+1+". sayi giriniz : ");
               int sayi1=scanner.nextInt();
               sayilar[i]=sayi1;
           }
           int enbuyuk=sayilar[0];
           int enkucuk=sayilar[0];
           for (int i = 0; i <sayilar.length ; i++) {
               if(sayilar[i]<enkucuk){
                   enkucuk=sayilar[i];
               }
               if (sayilar[i]>enbuyuk){
                   enbuyuk=sayilar[i];
               }

           }
           System.out.println("Girilen Sayilar :" + Arrays.toString(sayilar));
           System.out.println("girilen sayilar icindeki enbuyuk sayi ile en kucun sayinin farki : "+(enbuyuk-enkucuk));

       }

}
