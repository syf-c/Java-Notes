package Day12_Okul_Project;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Islemler {

    static List<Kisi> ogretmenList= new ArrayList<Kisi>();
    static List<Kisi> ogrenciList= new ArrayList<Kisi>();
    static Scanner scan=new Scanner(System.in);
    // static yazma sebebimi butun metodlardan ulasabilmek gokteki ay gibi heryerden ulasabilirsin
    static String kisiTuru;

   public static void girisPaneli(){
       System.out.println("====================================");
       System.out.println("OGRENCI VE OGRETMEN YONETIM PANELI");
       System.out.println("====================================");
       System.out.println("1- OGRENCI ISLEMLERI");
       System.out.println("2- OGRETMEN ISLEMLERI");
       System.out.println("Q- CIKIS");

       String secim=scan.next().toUpperCase();
       switch(secim){
           case "1":
               kisiTuru ="OGRENCI";
               islemMenusu();
               break;
           case "2":
               kisiTuru ="OGRETMEN";
               islemMenusu();
               break;
           case "Q":

               break;
           default:
               System.out.println("Hatali giris yaptiniz :( ");
               girisPaneli();
               break;
       }

   }

    private static void islemMenusu() {
        System.out.println("Sectiginiz kisi turu " + kisiTuru+ " Lutfen asagidaki islermleri seciniz");
        System.out.println("============= ISLEMLER =============\n" +
                "         1-EKLEME\n" +
                "         2-ARAMA\n" +
                "         3-LISTELEME\n" +
                "         4-SILME\n" +
                "         5-ANA MENU\n" +
                "         0-CIKIS");

        System.out.println("islem tercihinizi giriniz :");
        int secilenIslem = scan.nextInt();
        switch (secilenIslem){
            case 1:
                ekle();
                islemMenusu();
                break;
            case 2:
              //  arama();
                islemMenusu();
                break;
            case 3:
              //  listeleme();
                islemMenusu();
                break;
            case 4:
             //   silme();
                girisPaneli();
                break;
            case 5:
             //   anaMenu();
                islemMenusu();
                break;
            case 0:
                //cikis();
                break;
           default :
               System.out.println("gecerli bir bolum seciniz");
               islemMenusu();
                break;

        }

    }

    private static void ekle() { //Bu metod hem ogrenci hemde ogretmen eklemek icin tasarlandi
        System.out.println("***** " +kisiTuru + " Ekleme Sayfasina Hosgeldiniz *****");
        System.out.println("isim ve soyisim giriniz :");
        scan.nextLine();
        String adSoyad = scan.nextLine();


        System.out.println("kimlik No giriniz :");
        String kimlikNo = scan.nextLine();

        System.out.println("Yasinizi giriniz :");
        int yas= scan.nextInt();

        if (kisiTuru.equals("OGRENCI")){ //TODO SONRA DOLDUR

        }else{
            scan.nextLine();
            System.out.println("Bolum giriniz");
            String bolum = scan.nextLine();

            System.out.println("SicilNo giriniz");
            String sicilNo = scan.nextLine();
            Ogretmen ogretmen= new Ogretmen(adSoyad,kimlikNo,yas,bolum,sicilNo);
            ogretmenList.add(ogretmen);
            System.out.println(ogretmenList);

        }






    }
}
