package Project_01;

import java.util.Scanner;

public class Market {
    static double toplamOdenecekPara = 0;
    static String alinanUrunler ="";
    public static void urunListesi() {



        System.out.println(" ========================");
        System.out.println("  No    Urun       Fiyat");
        System.out.println(" ========================");

        String urunler[] = {"Domates", "Patates", "Biber", "Sogan", "Havuc", "Elma", "Muz", "Cilek", "Kavun", "Uzum", "Limon"};
        double urunFiyatlari[] = {2.10, 3.20, 1.50, 2.30, 3.10, 1.20, 1.90, 6.10, 4.30, 2.70, 0.50};
        double UrunNo[] = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        for (int i = 0; i < urunler.length; i++) {
            System.out.printf("  0%-3.0f  %-10s %.2f $\n", UrunNo[i], urunler[i], urunFiyatlari[i]);
        }
        System.out.println(" ========================");

        }



    public static void urunSec() {

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen istediginiz urun numarasini giriniz :");
        int No = scan.nextInt();
        double odencekFiyat = 0;

        switch (No) {
            case 0:
                if (No == 0) {
                    System.out.println("Kac kilogram almak istiyorsunuz?");
                    double kilogram = scan.nextDouble();
                    odencekFiyat = (kilogram * 2.10);
                    toplamOdenecekPara += odencekFiyat;
                    alinanUrunler += "Domates" + ",";
                    System.out.printf("%.2fkg Domates %.2f$ tutmaktadir\n",kilogram,odencekFiyat);
                    System.out.println("Baska bir urun almak istermisiniz   Y / N");
                    String secim = scan.next();
                    if (secim.equals("Y")||secim.equals("y")) {
                        urunListesi();
                        Market.urunSec();
                    } else if (secim.equals("N")||secim.equals("n")){
                        Sepet.sepet();

                    }else {
                        System.out.println("Lutfen Y veya N seciniz");
                    }
                }

                break;
            case 1:
                if (No == 1) {
                    System.out.println("Kac kilogram almak istiyorsunuz?");
                    double kilogram = scan.nextDouble();
                    odencekFiyat = (kilogram * 3.20);
                    toplamOdenecekPara += odencekFiyat;
                    alinanUrunler += "Patates" + ",";
                    System.out.printf("%.2fkg Patates %.2f$ tutmaktadir\n",kilogram,odencekFiyat);
                    System.out.println("Baska bir urun almak istermisiniz   Y / N");
                    String secim = scan.next();
                    if (secim.equals("Y")||secim.equals("y")) {
                        urunListesi();
                        Market.urunSec();
                    } else if (secim.equals("N")||secim.equals("n")){
                        Sepet.sepet();

                    }else {
                        System.out.println("Lutfen Y veya N seciniz");
                    }
                }
                break;


            case 2:
                if (No == 2) {
                    System.out.println("Kac kilogram almak istiyorsunuz?");
                    double kilogram = scan.nextDouble();
                    odencekFiyat = (kilogram * 1.50);
                    toplamOdenecekPara += odencekFiyat;
                    alinanUrunler += "Biber" + ",";
                    System.out.printf("%.2fkg Biber %.2f$ tutmaktadir\n",kilogram,odencekFiyat);
                    System.out.println("Baska bir urun almak istermisiniz   Y / N");
                    String secim = scan.next();
                    if (secim.equals("Y")||secim.equals("y")) {
                        urunListesi();
                        Market.urunSec();
                    } else if (secim.equals("N")||secim.equals("n")){
                        Sepet.sepet();

                    }else {
                        System.out.println("Lutfen Y veya N seciniz");
                    }
                }
                break;
            case 3:
                if (No == 3) {
                    System.out.println("Kac kilogram almak istiyorsunuz?");
                    double kilogram = scan.nextDouble();
                    odencekFiyat = (kilogram * 2.30);
                    toplamOdenecekPara += odencekFiyat;
                    alinanUrunler += "Sogan" + ",";
                    System.out.printf("%.2fkg Sogan %.2f$ tutmaktadir\n",kilogram,odencekFiyat);
                    System.out.println("Baska bir urun almak istermisiniz  Y / N");
                    String secim = scan.next();
                    if (secim.equals("Y")||secim.equals("y")) {
                        urunListesi();
                        Market.urunSec();
                    } else if (secim.equals("N")||secim.equals("n")){
                        Sepet.sepet();

                    }else {
                        System.out.println("Lutfen Y veya N seciniz");
                    }
                }

                break;
            case 4:
                if (No == 4) {
                    System.out.println("Kac kilogram almak istiyorsunuz?");
                    double kilogram = scan.nextDouble();
                    odencekFiyat = (kilogram * 3.10);
                    toplamOdenecekPara += odencekFiyat;
                    alinanUrunler += "Havuc" + ",";
                    System.out.printf("%.2fkg Havuc %.2f$ tutmaktadir\n",kilogram,odencekFiyat);
                    System.out.println("Baska bir urun almak istermisiniz  Y / N");
                    String secim = scan.next();
                    if (secim.equals("Y")||secim.equals("y")) {
                        urunListesi();
                        Market.urunSec();
                    } else if (secim.equals("N")||secim.equals("n")){
                        Sepet.sepet();

                    }else {
                        System.out.println("Lutfen Y veya N seciniz");
                    }
                }

                break;
            case 5:
                if (No == 5) {
                    System.out.println("Kac kilogram almak istiyorsunuz?");
                    double kilogram = scan.nextDouble();
                    odencekFiyat = (kilogram * 1.20);
                    toplamOdenecekPara += odencekFiyat;
                    alinanUrunler += "Elma" + ",";
                    System.out.printf("%.2fkg Elma %.2f$ tutmaktadir\n",kilogram,odencekFiyat);
                    System.out.println("Baska bir urun almak istermisiniz etmek Y / N");
                    String secim = scan.next();
                    if (secim.equals("Y")||secim.equals("y")) {
                        urunListesi();
                        Market.urunSec();
                    } else if (secim.equals("N")||secim.equals("n")){
                        Sepet.sepet();

                    }else {
                        System.out.println("Lutfen Y veya N seciniz");
                    }
                }

                break;
            case 6:
                if (No == 6) {
                    System.out.println("Kac kilogram almak istiyorsunuz?");
                    double kilogram = scan.nextDouble();
                    odencekFiyat = (kilogram * 1.90);
                    toplamOdenecekPara += odencekFiyat;
                    alinanUrunler += "Muz" + ",";
                    System.out.printf("%.2fkg Muz %.2f$ tutmaktadir\n",kilogram,odencekFiyat);
                    System.out.println("Baska bir urun almak istermisiniz etmek Y / N");
                    String secim = scan.next();
                    if (secim.equals("Y")||secim.equals("y")) {
                        urunListesi();
                        Market.urunSec();
                    } else if (secim.equals("N")||secim.equals("n")){
                        Sepet.sepet();

                    }else {
                        System.out.println("Lutfen Y veya N seciniz");
                    }
                }

                break;
            case 7:
                if (No == 7) {
                    System.out.println("Kac kilogram almak istiyorsunuz?");
                    double kilogram = scan.nextDouble();
                    odencekFiyat = (kilogram * 6.10);
                    toplamOdenecekPara += odencekFiyat;
                    alinanUrunler += "Cilek" + ",";
                    System.out.printf("%.2fkg Cilek %.2f$ tutmaktadir\n",kilogram,odencekFiyat);
                    System.out.println("Baska bir urun almak istermisiniz etmek Y / N");
                    String secim = scan.next();
                    if (secim.equals("Y")||secim.equals("y")) {
                        urunListesi();
                        Market.urunSec();
                    } else if (secim.equals("N")||secim.equals("n")){
                        Sepet.sepet();

                    }else {
                        System.out.println("Lutfen Y veya N seciniz");
                    }
                }

                break;
            case 8:
                if (No == 8) {
                    System.out.println("Kac kilogram almak istiyorsunuz?");
                    double kilogram = scan.nextDouble();
                    odencekFiyat = (kilogram * 4.30);
                    toplamOdenecekPara += odencekFiyat;
                    alinanUrunler += "Kavun" + ",";
                    System.out.printf("%.2fkg Kavun %.2f$ tutmaktadir\n",kilogram,odencekFiyat);
                    System.out.println("Baska bir urun almak istermisiniz etmek Y / N");
                    String secim = scan.next();
                    if (secim.equals("Y")||secim.equals("y")) {
                        urunListesi();
                        Market.urunSec();
                    } else if (secim.equals("N")||secim.equals("n")){
                        Sepet.sepet();

                    }else {
                        System.out.println("Lutfen Y veya N seciniz");
                    }
                }

                break;
            case 9:
                if (No == 9) {
                    System.out.println("Kac kilogram almak istiyorsunuz?");
                    double kilogram = scan.nextDouble();
                    odencekFiyat = (kilogram * 2.70);
                    toplamOdenecekPara += odencekFiyat;
                    alinanUrunler += "Uzum" + ",";
                    System.out.printf("%.2fkg Uzum %.2f$ tutmaktadir\n",kilogram,odencekFiyat);
                    System.out.println("Baska bir urun almak istermisiniz etmek Y / N");
                    String secim = scan.next();
                    if (secim.equals("Y")||secim.equals("y")) {
                        urunListesi();
                        Market.urunSec();
                    } else if (secim.equals("N")||secim.equals("n")){
                        Sepet.sepet();

                    }else {
                        System.out.println("Lutfen Y veya N seciniz");
                    }
                }

                break;
            case 10:
                if (No == 10) {
                    System.out.println("Kac kilogram almak istiyorsunuz?");
                    double kilogram = scan.nextDouble();
                    odencekFiyat = (kilogram * 0.50);
                    toplamOdenecekPara += odencekFiyat;
                    alinanUrunler += "Limon" + ",";
                    System.out.printf("%.2fkg Limon %.2f$ tutmaktadir\n",kilogram,odencekFiyat);
                    System.out.println("Baska bir urun almak istermisiniz etmek Y / N");
                    String secim = scan.next();
                    if (secim.equals("Y")||secim.equals("y")) {
                        urunListesi();
                        Market.urunSec();
                    } else if (secim.equals("N")||secim.equals("n")){
                        Sepet.sepet();

                    }else {
                        System.out.println("Lutfen Y veya N seciniz");
                    }
                }

                break;
            default:
                System.out.println("Please select a valid number!");
                urunSec();

        }

    }

    public static void alinanUrunler() {

    }


}
