package day06_WrapperClasses;

import java.util.Scanner;

public class Musa {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen bir isim giriniz :");
        String isim =scan.nextLine();
        System.out.println("soyadiniz girin");
        String soyIsim = scan.nextLine();

        System.out.println("isminiz ve soyisminiz : "+isim+soyIsim);


    }
}
