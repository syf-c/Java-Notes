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
                arama();
                islemMenusu();
                break;
            case 3:
                listeleme();
                islemMenusu();
                break;
            case 4:
                silme();
                islemMenusu();
                break;
            case 5:
             //   anaMenu();
                girisPaneli();
                break;
            case 0:
                cikis();
                break;
           default :
               System.out.println("gecerli bir bolum seciniz");
               islemMenusu();
                break;

        }

    }

    private static void cikis() {
        System.out.println("Yine bekleriz Hoscakalin");
    }

    private static void silme() {
        System.out.println("***** " +kisiTuru + " Listeleme Sayfasina Hosgeldiniz *****");
        boolean flag = true;

        if (kisiTuru.equalsIgnoreCase("OGRENCI")){
            System.out.println("Silmek icin Kimlik No giriniz :");
            String silinecekKimlikNo = scan.next().replaceAll(" ","");
            for (Kisi each:ogrenciList) {
                if (each.getKimlikNo().equals(silinecekKimlikNo)){
                    System.out.println("Silininen Ogrenci"+ each.getAdSoyad());
                    ogrenciList.remove(each);
                    flag = false;
                    break;
                }
            }
            if (flag){
                System.out.println("Aragiginiz TC numarali ogrenci yok");
            }
        }else{
                System.out.println("Silinecek ogretmnenin Kimlik No giriniz :");
                String silinecekKimlikNo = scan.next().replaceAll(" ","");
                for (Kisi each:ogretmenList) {
                    if (each.getKimlikNo().equals(silinecekKimlikNo)){
                        System.out.println("Silininen Ogretmen "+ each.getAdSoyad());
                        ogretmenList.remove(each);
                        flag = false;
                        break;
                    }
                }
                if (flag){
                    System.out.println("Aragiginiz TC numarali Ogretmen yok ve silinemedi");
                }
        }
    }

    private static void listeleme() {
        System.out.println("***** " +kisiTuru + " Listeleme Sayfasina Hosgeldiniz *****");
        if (kisiTuru.equalsIgnoreCase("OGRENCI")){
            System.out.println(ogretmenList);
        }else{
            for (Kisi w:ogretmenList){
                System.out.println(w.toString());
            }
        }
    }

    private static void arama() {
        System.out.println("***** " +kisiTuru + " Arama Sayfasina Hosgeldiniz *****");
        boolean flag = true;

        if (kisiTuru.equalsIgnoreCase("OGRENCI")){ //Bu satirda ogrenci araniyor
            System.out.println("Kimlik no giriniz : ");
           String aranankimlikNo = scan.next().replaceAll(" ","");
            for (Kisi w : ogrenciList) {
                if (w.getKimlikNo().equals(aranankimlikNo)){
                    System.out.println("Aradiginiz ogrenci : "+ w.getAdSoyad());
                    flag = false;
                    break;
                }
            }
            if (flag){
                System.out.println("Aragiginiz TC numarali ogrenci yok");

            }

        }else{

            System.out.println("Kimlik no giriniz : ");
            String aranankimlikNo = scan.next().replaceAll(" ","");
            for (Kisi w : ogretmenList) {
                if (w.getKimlikNo().equals(aranankimlikNo)){
                    System.out.println("Aradiginiz ogretmen : "+ w.getAdSoyad());
                    flag = false;
                    break;
                }
            }
            if (flag){
                System.out.println("Aragiginiz TC numarali ogretmen yok");

            }

        }

    }

    private static void ekle() { //Bu metod hem ogrenci hemde ogretmen eklemek icin tasarlandi
        System.out.println("***** " +kisiTuru + " Ekleme Sayfasina Hosgeldiniz *****");
        System.out.println("Isim ve Soyisim giriniz : ");
        scan.nextLine();
        String adSoyad = scan.nextLine();

        System.out.println("Kimlik No giriniz :");
        String kimlikNo = scan.nextLine();

        System.out.println("Yasinizi giriniz :");
        int yas= scan.nextInt();

        if (kisiTuru.equals("OGRENCI")){ //TODO SONRA DOLDUR
            System.out.println("ogrenci No giriniz");
            String ogrenciNo = scan.next().replaceAll(" ","");

            System.out.println("Sinifi giriniz :");
            String sinif = scan.next().replaceAll(" ","");

            Ogrenci ogrenci = new Ogrenci(adSoyad,kimlikNo,yas,ogrenciNo,sinif);
            ogretmenList.add(ogrenci);


        }else{
            scan.nextLine(); //dummy kod hata almamak icin
            System.out.println("Bolum giriniz : ");
            String bolum = scan.nextLine();

            System.out.println("SicilNo giriniz : ");
            String sicilNo = scan.nextLine();

            Ogretmen ogretmen= new Ogretmen(adSoyad,kimlikNo,yas,bolum,sicilNo);
            ogretmenList.add(ogretmen);

        }
    }


}
