package Day09_ternary;

import java.util.Scanner;

public class C03_Ternary {

    // kullanicidan bir sayi isteyin,
    // sayi pozitifse sayiyi yazdirin
    // sayi negatifse , bir sayi daha isteyin ve ikisinin carpimini isteyin

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen bir sayi giriniz");
        double sayi = scan.nextDouble();

        if (sayi <= 0) {
            System.out.println("tekrar sayi giriniz");
            int sayi2 =scan.nextInt();
            System.out.println(sayi*sayi2);
        } else {
            System.out.println(sayi);
        }
        /*
        eger if else icerisinde yeni kodlar varya mesela yeni bir sayi giriniz gibi,
        ternary ile bunu yapmamiz mumkun degil
         */
    }
}
