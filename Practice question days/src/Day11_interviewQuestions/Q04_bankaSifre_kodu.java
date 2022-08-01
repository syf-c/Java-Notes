package Day11_interviewQuestions;

import java.util.Scanner;

public class Q04_bankaSifre_kodu {
    // STRING OLAN PIN kodunuzu kontrol eden bir kod yazınız.
//bunu kart sifre kontrol de de kullabilirinisz
    public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    String sifre ="erdal.1234";
    int girisSayisi = 3;

        while(true){
            System.out.println("sifre giriniz :");
            String girilenSifre = scan.nextLine();
            if (sifre.equals(girilenSifre)){
                System.out.println("sifre basarili");
                break;
            }else {
                System.out.println("sifre yanlis tekrar deneyiniz");
                girisSayisi--;
                System.out.println("kalan giris hakkiniz " + girisSayisi);
            }
            if (girisSayisi==0){
                System.out.println("Giris hakkiniz bitti kart blok oldu");
                break;
            }
        }
    }
}
