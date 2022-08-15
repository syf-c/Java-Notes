import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Islemler {
    static List<KisiOrtakBilgileri> ogretmenList = new ArrayList<KisiOrtakBilgileri>();
    static List<KisiOrtakBilgileri> ogrenciList = new ArrayList<KisiOrtakBilgileri>();
    static Scanner scan = new Scanner(System.in);
    static String kisiTuru;

    public static void girisPaneli() {
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
                System.out.println(Renklendirme.ANSI_YELLOW_BACKGROUND + Renklendirme.ANSI_BLACK + "  Hatali giris yaptiniz  " + Renklendirme.ANSI_RESET);
                girisPaneli();
                break;

        }

    }

    private static void cikis() {
        System.out.println(Renklendirme.ANSI_BLUE + "Cikisiniz yapilmistir iyi gunler dileriz :) " + Renklendirme.ANSI_RESET);
    }

    private static void islemMenusu() {
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
                //silme()
                islemMenusu();
                break;
            case "5":
                girisPaneli();
                break;
            case "0":
                cikis();
                break;
            default:
                System.out.println(Renklendirme.ANSI_RED + "       Gecerli bir bolum seciniz    " + Renklendirme.ANSI_RESET);
                System.out.println();
                islemMenusu();
                break;

        }
    }

    private static void arama() {
        System.out.println(Renklendirme.ANSI_GREEN_BACKGROUND + Renklendirme.ANSI_BLACK + "=============  " + kisiTuru + "    ===========" + Renklendirme.ANSI_RESET);
        String kimlik_No = scan.nextLine();
        //if (kimlikNo.equals(kimlik_No))

    }

    private static void listeleme() {
        System.out.println(Renklendirme.ANSI_GREEN_BACKGROUND + Renklendirme.ANSI_BLACK + "=============  " + kisiTuru + "    ===========" + Renklendirme.ANSI_RESET);
        if (kisiTuru.equalsIgnoreCase("OGRENCI")) {
            System.out.println(ogrenciList);
        } else {
            System.out.println(ogretmenList);
        }
    }

    private static void ekle() {
        System.out.println(Renklendirme.ANSI_GREEN_BACKGROUND + Renklendirme.ANSI_BLACK + "=============  " + kisiTuru + "    ===========" + Renklendirme.ANSI_RESET);

        System.out.println("Ad ve Soyad giriniz :");
        scan.nextLine();//dummy
        String adSoyad = scan.nextLine();

        System.out.println("Kimlik numarasi giriniz :");
        String kimlikNo = scan.nextLine().replaceAll(" ", "");

        System.out.println("Yas giriniz :");
        int yas = scan.nextInt();

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
