package Day08_ifStatement;

import java.util.Scanner;

public class C03_NestedIfElseStatement {
    public static void main(String[] args) {
        /*
          emeklilik kontrolu yapan bir program yaziniz
          cinsiyet olarak E (erkek) veya K(Kadin) degiskenlerini kabul etsin
          farkli bir harf veya sembol girilirse hata mesajji versin
          emeklilik icin kadinlarda yas siniri 60
          erkeklerde 65 olsun
          negatif yas veya 80'den buyuk yas girilirse hata mesaji versin
         */
        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen cinsiyetinizi yaziniz" +
                "\n Kadin icin K Erkek icin E harfini giriniz");
        char cinsiyet = scan.next().toUpperCase().charAt(0);


        if (cinsiyet == 'E') {
            System.out.println("Lutfen yasinizi giriniz");
            double yas = scan.nextDouble();
            if (yas < 0 || yas > 80) {
                System.out.println("lutfen gecerli bir yas giriniz");
            } else if (yas > 65) {
                System.out.println("emakli olabilirsiniz");
            } else {
                System.out.println("emekli olamazsiniz");
            }


        } else if (cinsiyet == 'K') {
            System.out.println("Lutfen yasinizi giriniz");
            double yas = scan.nextDouble();
            if (yas < 0 || yas > 80) {
                System.out.println("lutfen gecerli bir yas giriniz");
            }else if (yas > 60) {
                System.out.println("emekli olabilirsiniz");
            } else {
                System.out.println("emekli olamazsiniz");
            }

        } else {
            System.out.println("gecerli bir karakter giriniz giriniz");
        }


    }
}
