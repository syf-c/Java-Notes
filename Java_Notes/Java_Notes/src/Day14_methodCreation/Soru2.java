package Day14_methodCreation;

import java.util.Scanner;

public class Soru2 {
    //kullaniciya kac sayi toplamak istedigini sorun
    //kullanici 2,3 veya 4 degerini girerse kullanicidan bu sayilari girmesini isteyin
    //ve sayilarin toplamini yazdirin kullanici toplamak istedigi sayi adedini 4 den buyuk girerse
    //"cok sayi girdiniz ben toplayamam "yazdirin
    public static void main(String[] args) {

        toplamiHesapla();

    }

    private static void toplamiHesapla() {
        Scanner scan = new Scanner(System.in);
        System.out.println("kac tane sayi girmek istiyorsunuz");
        int adet=scan.nextInt();
        switch (adet) {
        case 1:
        case 2:
        case 3:
        case 4:
            int toplam =0;
            for (int i =adet; i >0 ; i--) {
                System.out.println("sayi giriniz :");
                int sayi=scan.nextInt();
                toplam =toplam +sayi;
            }
            System.out.println("sayilarin toplami :" +toplam);
            break;
        default:
            System.out.println(adet + " adet sayi ben toplayamam");
    }
    }
}
