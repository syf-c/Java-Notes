package Day12_StringManipulations;

import java.util.Scanner;

public class Soru7 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("adinizi giriniz :");
        String ad = scan.nextLine();
        System.out.println("soyAdinizi giriniz :");
        String soyAd = scan.nextLine();
        System.out.println("kredi kart no girinizi :");
        String kartNo = scan.nextLine();


       ad =ad.substring(0,1)+ad.replaceAll("\\w","*");
       soyAd = soyAd.substring(0,1)+soyAd.replaceAll("\\w","*");

        kartNo =kartNo.substring(0,15).replaceAll("\\d","*")+kartNo.substring(15,19);

        System.out.println(ad +" "+soyAd );
        System.out.println("kartNo : "+kartNo);
    }
}
