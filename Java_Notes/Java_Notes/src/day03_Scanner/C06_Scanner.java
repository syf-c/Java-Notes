package day03;

import java.util.Scanner;

public class C06_Scanner {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("lutfen adinizi soyadinizi ve yasinizi giriniz ve aralarda entera basiniz");
        String isim= scan.nextLine();
        String soyIsim=scan.nextLine();
        int yas=scan.nextInt();
        System.out.println("girilen bilgiler : "+isim+", "+soyIsim+", "+yas);
    }


}
