package day03;

import java.util.Scanner;

public class C03_Scanner {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("isminizi giniriniz : ");
        String isim = scan.nextLine();
        System.out.println("Hosgeldin " + isim);
    }
}
