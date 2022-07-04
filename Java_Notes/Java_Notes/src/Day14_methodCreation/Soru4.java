package Day14_methodCreation;

import java.util.Scanner;

public class Soru4 {
    /*
    Kullanicidan ismini, soyismini ve bosluk birakmadan 16 hane olarak kredi karti
numarasini alin. Isim ve soyismi ilk harfleri buyuk diger harfler kucuk olacak
sekilde, KK numarasini ise 4 rakamlik 4 blok ve aralarinda bosluk olacak sekilde
duzelten 2 method yazin, ve programda kullanabilmek icin duzenlenmis hallerini
geri dondurun.
     */
    public static void main(String[] args) {
        kullaniciAdSoyad();
        kartNo();
    }

    private static void kartNo() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Kredi kart numaranizi giriniz");
        String kartno = scan.nextLine();
        if (kartno.length() == 16) {
            System.out.println(kartno.substring(0, 4) + " " + kartno.substring(4, 8) + " "
                    + kartno.substring(8, 12) + " " + kartno.substring(12));
        } else {
            System.out.println("Kart numarasi 16 hanelidir Lutfen tekrar deneyin");
        }
    }

    private static void kullaniciAdSoyad() {

        Scanner scan = new Scanner(System.in);
        System.out.println("Adinizi giriniz :");
        String ad = scan.nextLine();
        String isim = ad.substring(0, 1).toUpperCase() + ad.substring(1);
        System.out.println("SoyAdinizi giriniz :");
        String soyAd = scan.nextLine();
        String soyIsim = soyAd.substring(0, 1).toUpperCase() + soyAd.substring(1);
        System.out.println(isim + " " + soyIsim);

    }

}
