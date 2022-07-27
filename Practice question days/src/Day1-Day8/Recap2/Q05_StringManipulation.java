package Recap2;

import java.util.Scanner;

public class Q05_StringManipulation {
    //Kullanicidan ismini ve soyisimi girmesini isteyin, sonrasinda konsola tam ismini buyuk harfler ile yazdirin

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("lutfen isminizi giriniz");
        String  isim = scan.nextLine().toUpperCase();
        System.out.println("lutfen soy isminizi giriniz");
        String soyIsim = scan.nextLine().toUpperCase();

        System.out.println("adiniz ve soy adiniz : " + isim+ " "+soyIsim);
    }
}
