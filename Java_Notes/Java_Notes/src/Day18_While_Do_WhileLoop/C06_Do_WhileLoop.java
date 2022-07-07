package Day18_While_Do_WhileLoop;

import java.util.Scanner;

public class C06_Do_WhileLoop {
    /*
    Soru 4) Kullanicidan toplamak uzere pozitif sayilar isteyin,
     islemi bitirmek icin 0’a basmasini soyleyin.
    Kullanici yanlislikla negative sayi girerse o sayiyi dikkate almayin
    ve “Negatif sayi giremezsiniz” yazdirip basa donun
    Kullanici 0’a bastiginda toplam kac pozitif sayi girdigini,
    yanlislikla kac negative sayi girdigini
     ve girdigi pozitif sayilarin toplaminin kac oldugunu yazdirin.

     */

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int sayi = 0;
        int pozitifSayiAdet = 0;
        int negatifSayiAdet = 0;
        int pozitifSayiToplam = 0;

        do {
            System.out.println("Lutfen toplamak uzere positif tam sayi giriniz");
            sayi = scan.nextInt();
            if (sayi > 0) {
                pozitifSayiToplam += sayi;
                pozitifSayiAdet++;
            } else if (sayi < 0) {
                negatifSayiAdet++;
                System.out.println("Negatif sayi giremezsiniz");
            }

        } while (sayi != 0);
        System.out.println("Pozitif Sayi Adeti = " + pozitifSayiAdet);
        System.out.println("Pozitif Sayilar Toplami = " + pozitifSayiToplam);
        System.out.println(negatifSayiAdet + " Adet negatif Sayi girdiniz ancak onlar toplama ilave edilmez ");
        System.out.println("negatifSayiAdet = " + negatifSayiAdet);
    }

}
