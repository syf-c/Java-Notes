package Recap2;

import java.util.Scanner;

public class Q06_StringManipulation {
    public static void main(String[] args) {
        //Scanner kullanarak iki ayri deger giriniz ve bu iki kelimeyi method kullanarak birlestiriniz.

        //yukardaki ornekte verilen ilk ve ikinci degiskenlerinin ilk harflerini atip birlestiriniz.
        Scanner scan = new Scanner(System.in);
        System.out.println("lutfen bir kelime giriniz giriniz");
        String a = scan.nextLine();
        System.out.println("lutfen bir kelime giriniz giriniz");
        String b = scan.nextLine();



                birlestir(a,b);


    }

    public static void birlestir(String x, String y) {
        String sonuc = x.substring(1) + y.substring(1);
        System.out.println(x + " " + y);
        System.out.println(sonuc);
    }

}
