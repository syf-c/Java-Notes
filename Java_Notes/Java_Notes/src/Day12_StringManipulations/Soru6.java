package Day12_StringManipulations;

import java.util.Scanner;

public class Soru6 {
    public static void main(String[] args) {
        /*
        kullanicidan bir sifre girmesini isteyin. Asagidaki sartlar sagliniyorsa "Sifre basari ile tanimlandi",
        sartlari saglamaz ise "islem basarisiz, Lutfen yeni bir sifre girin" yazdirin.

        -ilk harf buyuk harf ile olmali
        -son harf kucuk harf olmali
        -sifre bosluk icermemeli
        -sifre uzunlugu en az 8 karakter olmali
       */

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen bir sifre giriniz");
        String sifre =scan.next();

        if((sifre.substring(0,1)!=sifre.substring(0,1).toUpperCase())){

            System.out.println("ok1");
        }
       if (sifre.substring(sifre.length()-1)!=
                sifre.substring(sifre.length()-1).toLowerCase()){
            System.out.println("ok2");
        }

        if (sifre.contains(" ") !=sifre.contains("")){
            System.out.println("ok3");
        }



        if (sifre.length() >8){
            System.out.println("ok4");
        }




        if ((sifre.substring(0,1)!=sifre.substring(0,1).toUpperCase()&&
                sifre.substring(sifre.length()-1)!=sifre.substring(sifre.length()-1).toLowerCase()&&
                sifre.contains(" ")!=sifre.contains("")&& sifre.length()>8)
        ){
            System.out.println("isleminiz basarili");
        }else {
            System.out.println("islem basarisiz ");
        }

    }
}
