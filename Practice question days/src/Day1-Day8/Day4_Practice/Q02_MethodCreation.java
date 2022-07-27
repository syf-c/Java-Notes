package Day4_Practice;

import java.util.Scanner;

public class Q02_MethodCreation {
    /*
   cm olarak verilen bir sayiyi, metre ve kilometreye donusturen bir method yaziniz
    */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("lutfen istediginiz cm yi giriniz");
        double sayi = scan.nextDouble();
        convertCm(sayi);


    }

    public static void convertCm(double sayi) {

        double mtr = sayi / 100;
        double km = sayi / 100000;
        System.out.printf(" %.0fcm= %.6fkm\n ", sayi, km);
        System.out.printf("%.0fcm = %.2fm", sayi, mtr);
    }
}
