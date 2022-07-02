package Day16_Forloop;

import java.util.Scanner;

public class Soru10 {
    public static void main(String[] args) {
       /* Soru 10 ) Kullanicidan iki sayi isteyin. Girilen sayilar ve aralarindaki tum tamsayilari toplayip,
       sonucu yazdiran bir program yaziniz
               */

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen baslangic ve bitis degerlerini giriniz :");
        int baslangic = scan.nextInt();
        int bitis = scan.nextInt();

        toplam(baslangic, bitis);
    }

    public static void toplam(int baslangic, int bitis) {
        int toplam = 0;
        if (baslangic <= bitis) {
            for (int i = baslangic; i <= bitis; i++) {
                toplam += i;
            }
        } else {
            for (int i = bitis; i <= baslangic; i++) {
                toplam += i;
            }
        }
        System.out.println("Aralarindaki sayilarin toplami :" +toplam);

    }
}


