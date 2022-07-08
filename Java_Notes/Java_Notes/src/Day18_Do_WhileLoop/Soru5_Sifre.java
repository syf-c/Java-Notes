package Day18_Do_WhileLoop;

import java.util.Scanner;

public class Soru5_Sifre {
    /*
    Kullanicidan bir sifre girmesini isteyin. Girilen sifreyi asagidaki sartlara gore kontrol
edin ve sifredeki hatalari yazdirin.
Kullanici gecerli bir sifre girinceye kadar bu islemi tekrar edin ve gecerli sifre
girdiginde "Sifreniz Kabul edilmistir" yazdirin.

- Sifre kucuk harf icermelidir
- Sifre buyuk harf icermelidir
- Sifre ozel karakter icermelidir
- Sifre en az 8 karakter olmalidir.

     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen bir sifre giriniz");
        String sifre = scan.nextLine();
        int kontrol = 0;
        boolean basari=false;
        // ilk harf kontrolu
        do {



            for (int i =1; i >= sifre.length(); i++) {

                String sonuc = "";
                sonuc = sifre.substring(i-1, i);
                if (sonuc.indexOf(0,sonuc.length()-1) >= 'A' && sonuc.indexOf(0,sonuc.length()-1) <= 'Z') {
                    kontrol++;

                } else {
                    System.out.println("buyuk karakter icermeli");

                    break;
                }
            }



      /*  if (sifre.charAt(0) >= 'A' && sifre.charAt(0) <= 'Z') {

            kontrol++;
        } else {
            System.out.println("Ilk harf buyuk harf olmali");
        }

       *//*
            for (int i = 0; i <sifre.length() ; i++) {
                String sonuc = "";
                sonuc=sifre.substring(i,i+1)+"";
                if(sonuc.charAt(0)>='A'&& sonuc.charAt(0)<='Z'){
                    kontrol++;
                    break;
                }

                System.out.println("gerekli");
                break;
            }

            for (int i = sifre.length()-1; i >=0 ; i++) {
                String sonuc = "";
                sonuc=sifre.substring(i,i+1);
                if(sonuc.charAt(sonuc.length()-1)>='a'&& sonuc.charAt(sonuc.length()-1)<='z'){
                    kontrol++;
                    break;
                }
                System.out.println("gerekli");
                break;

            }
            */

            // son harf kontrolu

            for (int i =1; i >=sifre.length() ; i++) {
                String sonuc1 = "";
                sonuc1 = sifre.substring(i-1, i);
                if (sonuc1.indexOf(0,sonuc1.length()-1) >= 'a' && sonuc1.indexOf(0,sonuc1.length()-1) <= 'z') {
                    kontrol++;
                    break;
                } else {
                    System.out.println("kucuk karakter icermeli");

                    break;
                }

            }


       /* if (sifre.charAt(sifre.length() - 1) >= 'a' && sifre.charAt(sifre.length() - 1) <= 'z') {
            kontrol++;
        } else {
            System.out.println("Son harf kucuk harf olmali");
        }

        */
            // bosluk kontrolu

            if (sifre.contains(" ")) {
                kontrol++;
            } else {
              System.out.println("Sifre bosluk icermeli");


            }
            // sifre uzunluk kontrolu
            if (sifre.length() >= 8) {
                kontrol++;
            } else {
                System.out.println("Sifre en az 8 karakter olmali");


            }
            if (kontrol == 4) {
                System.out.println("Sifre basari ile tanimlandi");


            } else {
                System.out.println("Islem basarisiz,Lutfen yeni bir sifre girin");
                kontrol=0;




            }

        } while (kontrol!=4);
    }
}


