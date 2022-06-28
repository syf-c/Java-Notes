package day03;

import java.util.Scanner;

public class C07_Scanner {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("isminizi giriniz");
        char ilkharf = scan.next().toUpperCase().charAt(0);
        System.out.println("isminizin ilk harfi : " + ilkharf);
    }
}

