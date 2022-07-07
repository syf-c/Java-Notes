package Day18_WhileLoop;

import java.util.Scanner;

public class Soru5_CarpimTablosu {
    /*
   Soru 5) Kullanicidan bir rakam alin ve bu rakam icin carpim tablosunu ekrana
   yazdirin. Kullanicinin hata yapmadigini farz edin.
   Ornegin kullanici 3 girerse;
   3x1=3 3x2=6 3x3=9 3x4=12 3x5=15 3x6=18 3x7=21 3x8=24 3x9=27 3x10=30
 */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen bir sayi giriniz");
        int sayi =scan.nextInt();
        int carpan = 1;
        int sonuc =0;

        while (carpan<=10){
                sonuc = carpan*sayi;
                System.out.println(sayi + "*"+carpan + "=" +sonuc);
            carpan++;
            }
        }
    }
