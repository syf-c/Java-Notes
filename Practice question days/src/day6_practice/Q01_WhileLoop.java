package day6_practice;

import java.util.Scanner;

public class Q01_WhileLoop {

    // girilen sayının basamaklarındaki rakamların toplamını bulunuz.

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen bir sayi giriniz :");
        int sayi = scan.nextInt();

        System.out.println( basamakTopla(sayi));
    }

    private static int basamakTopla(int sayi) {
        int toplam = 0;
        while(sayi!=0){
            toplam +=sayi%10;
            sayi /=10;
        }return toplam;
    }
}
