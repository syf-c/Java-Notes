import java.util.Scanner;

public class QA_26_ {
    /*
    SORU 1 : Girilen sayıların toplamı 100'ü geçince daha sayı istemeyecek ve
    o ana kadar kaç sayı girildiği ekrana yazdırılacak.
    bu soruyu hem for-loop hemde while -do döngüsü ile yapınız.
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);


        int toplam = 0;
        int sayac = 0;
        String girilenSayilar = "";
        for (int i =0; toplam <=100; i++) {
            System.out.println(" lutfen sayi giriniz :");
            int sayi = scan.nextInt();

            toplam += sayi;
            sayac++;
            girilenSayilar += sayi + ", ";
        }
        System.out.println("girilen Sayilar = " + girilenSayilar);
        System.out.println("Girilen sayi adedi = " + sayac);
        System.out.println("sayilarin toplami = " + toplam);


    }
}
 /*
            while (toplam<100){
            System.out.println("lutfen sayi giriniz");
            int sayi = scan.nextInt();
            girilenSayilar+=sayi+", ";
            toplam += sayi;
            sayac++;

        }

      */
/*
        do {
         System.out.println("lutfen sayi giriniz");
         int sayi = scan.nextInt();
         girilenSayilar+=sayi+", ";
         toplam += sayi;
         sayac++;

         }while(toplam<100);
 */
