package Day17_NestedForLoop;

import java.util.Scanner;

public class C08_WhileLoop {
    /*
    kullanicidan toplamak uzere sayilar alin
    sayilarin toplami 500 u gecince sayilarin toplamini ve kac sayi taoplandigini su sekilde yazdierin
    13 sayi giridiniz ve toplami 567
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int toplam = 0;
        int sayi = 0;
        int sayac = 0;

        while (toplam <= 500) {
            System.out.println("lutfen toplamak icin sayi giriniz");
            sayi = scan.nextInt();
            toplam += sayi;
            sayac++;

        }System.out.println(sayac + " Sayi girdiniz ve toplamlari " + toplam);


    }

}

