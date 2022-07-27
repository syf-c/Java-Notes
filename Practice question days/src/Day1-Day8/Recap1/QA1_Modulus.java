package Recap1;

import java.util.Scanner;

public class QA1_Modulus {
    /*
     *  Kullanicidanalacaginiz 5 basamakli sayinin ilk 2 ve son iki basamagindaki rakamlari toplamini bulunuz
     *
     *   Ex :
     *   input  : 12345
     *   output : 12
     */

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("bes basmakli bir sayi giriniz : ");
        int sayi = scan.nextInt();

        int ilksayi = sayi / 1000;
         int sonRakam = sayi % 100;
         int ilksayiToplm=(ilksayi /10) + (ilksayi %10) ;
         int sonRakamToplam=(sonRakam/10)+(sonRakam%10);
         int toplam =sonRakamToplam + ilksayiToplm ;
        System.out.println(toplam);
    }
}
