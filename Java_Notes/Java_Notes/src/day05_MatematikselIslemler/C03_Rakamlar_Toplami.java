package day05_MatematikselIslemler;

import java.awt.*;
import java.util.Scanner;

public class C03_Rakamlar_Toplami {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("lutfen 4 basamakli pozitif bir tam sayi giriniz :");
        int sayi = scan.nextInt();

        int birlerBas= 0;
        int rakamlarToplami = 0;
        int ilkgirlenSayi = sayi;

        //suanda sayi 5267 bb=0 rt=0

        birlerBas = sayi%10; //7
        rakamlarToplami += birlerBas; //7
        sayi /=10; //526

        // suanda sayi=526 bb=7 rt=7
        birlerBas = sayi%10; //6
        rakamlarToplami += birlerBas; //7+6 = 13
        sayi /=10;  //52

        //suanda sayi 52 bb=6 rt=13
        birlerBas = sayi%10;
        rakamlarToplami  +=birlerBas; //13+2 =15
        sayi /=10;

        //suanda sayi=5 bb=2 rt=15
        birlerBas = sayi%10; //5
        rakamlarToplami +=birlerBas; // 15+5 =20
        sayi /=10; // sayi = 0

        System.out.println(ilkgirlenSayi +" sayisinin rakamlar Toplami = " + rakamlarToplami);
        //suanda rakamlar TOplami = 20








    }
}
