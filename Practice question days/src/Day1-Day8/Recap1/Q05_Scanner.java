package Recap1;

import java.util.Scanner;

public class Q05_Scanner {

    /*  Problem Tanımı
        Kullanıcıdan a,b ve c sayılarını okuyarak aşağıdaki işlemi yapan kodu yazınız
        a'nın karesinden b'nin karesini cikarip c nin 3 katina bolunuz
        Örnek Ekran Çıktısı
        a sayısını giriniz: 5
        b sayısını giriniz: 3
        c sayısını giriniz: 1
        sonuç : 5.333333333333333
        */

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("birinci sayiyi giriniz :");
        int sayi1 = scan.nextInt();
        System.out.println("ikinci sayiyi giriniz :");
        int sayi2 = scan.nextInt();
        System.out.println("ucuncu sayiyi giriniz :");
        int sayi3 = scan.nextInt();

        double sonuc = (((sayi1*sayi1) -(sayi2*sayi2)))/(sayi3*3);
        System.out.println("sonuc = " + sonuc);
    }

}
