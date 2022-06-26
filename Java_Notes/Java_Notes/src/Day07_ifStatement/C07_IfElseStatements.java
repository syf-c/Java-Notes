package Day07_ifStatement;

import java.util.Scanner;

public class C07_IfElseStatements {
    public static void main(String[] args) {
        /*
        Soru 3) Kullaniciya yasini sorun,
        eger yas 65’den kucuk ise “emekli olamazsin, calismalisin”,
        65’e esit veya buyukse “Emekli olabilirsin” yazdirin
        eger negatif deger girerse uyaralim
     */


        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen yasinizi giriniz :");
        int age = scan.nextInt();

        if(age<0){
            System.out.println("lutfen gecerli bir yas giriniz");
        }else if (age < 65) {
            System.out.println("emekli olamazsin, " + (65 - age) + " yil daha calismalisin");
        } else {
            System.out.println("Emekli olabilirsin");
        }

    }
}