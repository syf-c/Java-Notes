package day03;

import java.util.Scanner;

public class C05_Scanner {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("adinizi giriniz :");
        String adiniz = scan.nextLine();
        System.out.println("soyadinizi giriniz: ");
        String soyadiniz = scan.nextLine();
        System.out.println("yasinizi giriniz: ");
        int yas = scan.nextInt();
        System.out.println("Girilen Bilgiler : "+adiniz +" "+soyadiniz + " " + yas );

    }
}
