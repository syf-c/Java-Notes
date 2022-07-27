package Recap2;

import java.util.Scanner;

public class Q04_NestedIfandTernary {
    public static void main(String[] args) {
        /*
    0 ~ 9 arasındaki sayilari cevirebilen bir java programi yazin
   kelimelere, sayı 9'dan buyuk veya sifirdan kucukse,
   cikis "Gecersiz" olmalidir
   NestedIf ve Ternary kullanarak 2 yolla da cozunuz
 */
        Scanner scan = new Scanner(System.in);
        System.out.println("lutfen 0 ile 10arasinda  bir sayi giriniz");
        int sayi = scan.nextInt();

        String sonuc = sayi==9 ? "dokuz":sayi==8?"sekiz":sayi==7?"yedi":sayi==6?"alti":sayi==5?"bes":sayi==4?"dort"
                :sayi==3?"uc":sayi==2?"iki":sayi==1?"bir":sayi==0?"sifir":"lutfen 0 ile 10 arasinda rakam giriniz";
        System.out.println(sonuc);

    }
}
