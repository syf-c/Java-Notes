package day6_practice;

import java.util.Scanner;

public class Q02_WhileLoop {

     /*
         Girilen bir sayıya kadar olan sayılardan sadece tek olanlarını ekrana yazdırınız.
         girilen sayı dahil
        */
     public static void main(String[] args) {
         Scanner scan = new Scanner(System.in);
         System.out.println("Lutfen bir sayi giriniz :");
         int sayi = scan.nextInt();

         int count = 0;
         while(sayi>0){
             if(sayi%2==1){
                 System.out.println(sayi);
                 count++;
             }  sayi--;

         }
         System.out.println("count ="+count);


         /*
         for (int i = 1; i <sayi ; i+=2) {
             System.out.println(i);
         }

          */
     }
}
