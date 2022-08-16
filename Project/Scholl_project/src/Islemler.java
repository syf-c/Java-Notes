import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class Islemler {
    static List<KisiOrtakBilgileri> ogretmenList = new ArrayList<KisiOrtakBilgileri>();
    static List<KisiOrtakBilgileri> ogrenciList = new ArrayList<KisiOrtakBilgileri>();
    static Scanner scan = new Scanner(System.in);
    static String kisiTuru;
    public static Thread Tread;

    public static void hazirListe(){
        Ogrenci ogr1 = new Ogrenci("Musa Gurbuz","123",25,"10","10A");
        ogrenciList.add(ogr1);
        Ogrenci ogr2 = new Ogrenci("Mualla Gurbuz","456",23,"11","10A");
        ogrenciList.add(ogr2);
        Ogrenci ogr3 = new Ogrenci("Sule Gurbuz","789",24,"12","10A");
        ogrenciList.add(ogr3);


        Ogretmen ogrt1 = new Ogretmen("Musa Gurbuz","123",25,"Bilgisayar","123");
        ogretmenList.add(ogrt1);
        Ogretmen ogrt2 = new Ogretmen("Sule Gurbuz","456",24,"Teknoloji","456");
        ogretmenList.add(ogrt2);
        Ogretmen ogrt3 = new Ogretmen("Mualla Gurbuz","789",23,"Tip","789");
        ogretmenList.add(ogrt3);

    }

    public static void girisPaneli() throws InterruptedException {
        System.out.println(Renklendirme.ANSI_GREEN + "====================================" + Renklendirme.ANSI_RESET);
        System.out.println(Renklendirme.ANSI_GREEN_BACKGROUND + Renklendirme.ANSI_BLACK + " OGRENCI VE OGRETMEN YONETIM PANELI " + Renklendirme.ANSI_RESET);
        System.out.println(Renklendirme.ANSI_GREEN + "====================================" + Renklendirme.ANSI_RESET);
        System.out.println("    1- OGRENCI ISLEMLERI");
        System.out.println("    2- OGRETMEN ISLEMLERI");
        System.out.println("    Q- CIKIS");
        System.out.println(Renklendirme.ANSI_GREEN + "====================================" + Renklendirme.ANSI_RESET);

        System.out.println(Renklendirme.ANSI_GREEN + "Yapmak istediginiz islemi seciniz :" + Renklendirme.ANSI_RESET);
        String secim = scan.next();

        switch (secim) {
            case "1":
                kisiTuru = "OGRENCI";
                islemMenusu();
                break;
            case "2":
                kisiTuru = "OGRETMEN";
                islemMenusu();
                break;
            case "Q":
            case "q":
                cikis();
                break;
            default:
                System.out.println(Renklendirme.ANSI_YELLOW_BACKGROUND + Renklendirme.ANSI_BLACK + "        Hatali giris yaptiniz       " + Renklendirme.ANSI_RESET);
                Tread.sleep(3000);
                girisPaneli();
                break;

        }

    }


    public static void cikis() {
        System.out.println(Renklendirme.ANSI_BLACK +Renklendirme.ANSI_YELLOW_BACKGROUND+ "=================================================" + Renklendirme.ANSI_RESET);
        System.out.println(Renklendirme.ANSI_BLACK +Renklendirme.ANSI_YELLOW_BACKGROUND+ "=  Cikisiniz yapilmistir iyi gunler dileriz :)  =" + Renklendirme.ANSI_RESET);
        System.out.println(Renklendirme.ANSI_BLACK +Renklendirme.ANSI_YELLOW_BACKGROUND+ "=================================================" + Renklendirme.ANSI_RESET);
    }

    public static void islemMenusu() throws InterruptedException {
        System.out.println(Renklendirme.ANSI_GREEN_BACKGROUND + Renklendirme.ANSI_BLACK + "=============  " + kisiTuru + "    ===========" + Renklendirme.ANSI_RESET);
        System.out.println("=============  ISLEMLERI  ===========\n" +
                "      1-EKLEME\n" +
                "      2-ARAMA\n" +
                "      3-LISTELEME\n" +
                "      4-SILME\n" +
                "      5-ANA MENU\n" +
                "      0-CIKIS");

        System.out.println(Renklendirme.ANSI_GREEN + "Yapmak istediginiz islemi seciniz :" + Renklendirme.ANSI_RESET);
        String secilenislem = scan.next();
        switch (secilenislem) {
            case "1":
                ekle();
                islemMenusu();
                break;
            case "2":
                arama();
                break;
            case "3":
                listeleme();
                islemMenusu();
                break;
            case "4":
                silme();
                islemMenusu();
                break;
            case "5":
                girisPaneli();
                break;
            case "0":
                cikis();
                break;
            default:
                System.out.println(Renklendirme.ANSI_YELLOW_BACKGROUND + Renklendirme.ANSI_BLACK + "        Hatali giris yaptiniz       " + Renklendirme.ANSI_RESET);
                Tread.sleep(3000);

                islemMenusu();
                break;

        }
    }

    public static void silme() throws InterruptedException {
        System.out.println(Renklendirme.ANSI_GREEN_BACKGROUND + Renklendirme.ANSI_BLACK + "=============  " + kisiTuru + "    ===========" + Renklendirme.ANSI_RESET);
        boolean flag = true;
        if (kisiTuru.equalsIgnoreCase("OGRENCI")) {
            System.out.println("Silmek istediginiz Ogrencinin Kimlik Numarasini giriniz :");
            String silinecekKimlikNo = scan.next().replaceAll(" ", "");
            for (KisiOrtakBilgileri w : ogrenciList) {
                if (w.getKimlikNo().equals(silinecekKimlikNo)) {
                    System.out.println("Bilgileri Silinen ogrenci : " + w.toString());
                    ogrenciList.remove(w);
                    Tread.sleep(3000);
                    flag = false;
                    islemMenusu();
                    break;
                }
            }
            if (flag){
                System.out.println("Bu kimlik Numarasina ait Ogrenci bulunmamaktadir");
                Tread.sleep(3000);
                islemMenusu();
            }
        }
    }

    public static void arama() throws InterruptedException {
        System.out.println(Renklendirme.ANSI_GREEN_BACKGROUND + Renklendirme.ANSI_BLACK + "=============  " + kisiTuru + "    ===========" + Renklendirme.ANSI_RESET);
        boolean flag = true;
        if (kisiTuru.equalsIgnoreCase("OGRENCI")) {
            System.out.println("Aradiginiz ogrencinin kimlik numarasini giriniz :");
            String kimlik_numarasi = scan.next();
            for (KisiOrtakBilgileri w : ogrenciList) {
                if (w.getKimlikNo().equals(kimlik_numarasi)) {
                    System.out.println("Aradiginiz Ogrenci : "+w.toString());
                    flag = false;
                    islemMenusu();
                    break;

                }
            }
            if (flag) {
                System.out.println("Bu kimlik numarasina ait Ogrenci bulunmamaktadir");
                Tread.sleep(3000);
                islemMenusu();
            }
        } else {

            System.out.println("Aradiginiz ogretmenin Kimlik numarasini giriniz");
            String kimlik_numarasi = scan.next().replaceAll(" ","");
            for (KisiOrtakBilgileri w : ogretmenList) {
                if (w.getKimlikNo().equals(kimlik_numarasi)) {
                    System.out.println("Aradiginiz Ogretmen : " +w.toString());
                    Tread.sleep(3000);
                    flag = false;
                    islemMenusu();
                    break;
                }
            }
            if (flag) {
                System.out.println("Bu kimlik numarasina ait Ogretmen bulunmamaktadir");
                Tread.sleep(3000);
                islemMenusu();
            }
        }
    }

    public static void listeleme() throws InterruptedException {
        System.out.println(Renklendirme.ANSI_GREEN_BACKGROUND + Renklendirme.ANSI_BLACK + "=============  " + kisiTuru + "    ===========" + Renklendirme.ANSI_RESET);
        if (kisiTuru.equalsIgnoreCase("OGRENCI")) {
            System.out.println(ogrenciList);
            Tread.sleep(3000);
        } else {
            System.out.println(ogretmenList);
            Tread.sleep(3000);
        }
    }

    private static void ekle() {
        System.out.println(Renklendirme.ANSI_GREEN_BACKGROUND + Renklendirme.ANSI_BLACK + "=============  " + kisiTuru + "    ===========" + Renklendirme.ANSI_RESET);

        System.out.println("Ad ve Soyad giriniz :");
        scan.nextLine();//dummy
        String adSoyad = scan.nextLine();

        System.out.println("Kimlik numarasi giriniz :");
        String kimlikNo = scan.nextLine().replaceAll(" ", "");


        int yas = 0;
        boolean kontrol = true;
        while (kontrol){
        try {
            scan = new Scanner(System.in);
            System.out.println("Yas giriniz :");
            yas = scan.nextInt();
            kontrol=false;
        } catch (InputMismatchException e) {
            System.out.println("Yasinizi tekrar giriniz");

        }}

        if (kisiTuru.equals("OGRENCI")) {

            System.out.println("Ogrenci Numarasini giriniz :");
            scan.nextLine();//dummy
            String ogrenciNo = scan.nextLine().replaceAll(" ", "");

            System.out.println("Sinif giriniz :");
            String sinif = scan.nextLine().replaceAll(" ", "");

            Ogrenci ogrenci = new Ogrenci(adSoyad, kimlikNo, yas, ogrenciNo, sinif);
            ogrenciList.add(ogrenci);
        } else {

            scan.nextLine();//dummy
            System.out.println("Bolum giriniz : ");
            String bolum = scan.nextLine();

            System.out.println("SicilNo giriniz : ");
            String sicilNo = scan.nextLine();

            Ogretmen ogretmen = new Ogretmen(adSoyad, kimlikNo, yas, bolum, sicilNo);
            ogretmenList.add(ogretmen);

        }

        System.out.println();
    }

}
