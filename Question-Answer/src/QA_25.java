import java.util.Scanner;

public class QA_25 {
    /*
     * Problem tanimi :
     *
     * Kullanicidan aldigi urunun adedini ve liste fiyatini alin, kullaniciya
     * musteri karti olup olmadigini sorun
     *
     * Musteri karti varsa ve 10 urunden fazla alirsa %20, yoksa %15 indirim yapin
     * Musteri karti yoksa ve 10 urunden fazla alirsa %15, 10 urunden az alirsa %10
     * indirim yapin
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("kac adet urun aldiniz :");
        int adet = scan.nextInt();

        System.out.println("fiyatini giriniz :");
        int fiyat = scan.nextInt();

        double toplamFiyat = (adet * fiyat);

        System.out.println("musteri kartiniz var mi?");
        System.out.println("varsa 1 yoksa 2 yi tuslayin");
        int cevap = scan.nextInt();
        switch (cevap) {
            case 1:
                if (adet > 10) {
                    System.out.println("Toplam odencek tutar :"+(toplamFiyat - (toplamFiyat / 5)));
                } else {
                    System.out.println("Toplam odencek tutar :"+(toplamFiyat - ((toplamFiyat * 15) / 100)));
                }
                break;


            case 2:

                if (adet > 10) {
                    System.out.println("Toplam odencek tutar :"+(toplamFiyat - ((toplamFiyat * 15) / 100)));
                } else {
                    System.out.println("Toplam odencek tutar :"+(toplamFiyat - ((toplamFiyat * 10) / 100)));
                }
                break;

            default:
                System.out.println("lutfen gecerli bir numara griniz");


        }
    }
}