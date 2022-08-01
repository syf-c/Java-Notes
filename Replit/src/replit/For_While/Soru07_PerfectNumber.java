package replit.For_While;

import java.util.Scanner;

public class Soru07_PerfectNumber {
    /*
    Numaranın Mükemmel sayı olup olmadığını kontrol eden Java kodunu yazın.

    Sayının kendisi hariç pozitif bölenlerinin toplamı o sayıya eşitse, herhangi bir sayı Java Mükemmel Sayısı olabilir.
    Girdi :6 Çıktı:6 Mükemmel Sayıdır Girdi :7 Çıktı:7 Mükemmel Sayı değildir

     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen bir sayi giriniz :");
        int sayi = scan.nextInt();

        int toplam = 0;
        for (int i = 1; i < sayi; i++) {
            if (sayi % i == 0) {
                toplam += i;
            }
        }
        if (toplam == sayi) {
            System.out.println(sayi + " sayisi Perfect number");

        } else {
            System.out.println(sayi + " sayisi Perfect number degil");

        }


    }
}
