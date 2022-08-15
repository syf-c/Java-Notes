package otomat;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Urunler {
    static List<String> urunIsimlerListesi = new ArrayList<>();
    static List<Integer> urunFiyatlarListesi = new ArrayList<>();
    static List<Integer> urunNoListesi = new ArrayList<>();
    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) throws InterruptedException {
        System.out.println("===================================");
        System.out.println("==== Welcome to Yiyecek Otomat ====");
        System.out.println("===================================");
        Urunler.urunlisteleme();
        Urunler.urunSec();

    }

    public static void urunlisteleme() {
        System.out.println("    ===========================");
        System.out.println("    = No     Urun      Fiyat  =");
        System.out.println("    ===========================");

        String[] urunIsimler = {"Lahmacun", "Pizza", "Pide", "Kebab","Hamburger","Omlet","Pogca","Acma","Simit","Gozleme"};
        int[] urunFiyatlar = {5, 6, 7, 10,5,6,4,8,12,15};
        int[] urunNo = {0, 1, 2, 3,4,5,6,7,8,9};

        for (int i = 0; i < urunIsimler.length; i++) {
            System.out.printf("    %3d     %-10s   %2d$\n", urunNo[i], urunIsimler[i], urunFiyatlar[i]);
        }
        System.out.println("===================================");

        for (int i = 0; i < urunIsimler.length; i++) {
            urunIsimlerListesi.add(urunIsimler[i]);
        }
        for (int i = 0; i < urunFiyatlar.length; i++) {
            urunFiyatlarListesi.add(urunFiyatlar[i]);
        }
        for (int i = 0; i < urunNo.length; i++) {
            urunNoListesi.add(urunNo[i]);
        }
    }

    public static void urunSec() throws InterruptedException {

        System.out.println("Lutfen istediginiz urun numarasini giriniz :");
        int No = scan.nextInt();
        int para;
        int odenecekPara = 0;
        int paraUstu = 0;
        int ekstraPara;

        if ((No < 0 || No > urunNoListesi.size()-1) ) {


            System.out.println("Lutfen gecerli bir numara giriniz...");
            urunSec();


        } else {   for (int i =No; i < urunNoListesi.size();) {

                odenecekPara += urunFiyatlarListesi.get(i);
                System.out.println("\"" + urunIsimlerListesi.get(i) + "\" sectiniz");
                System.out.println(urunIsimlerListesi.get(i) + " icin odeyeceginiz para " + odenecekPara + "$");
                System.out.println("Lutfen Para girisi yapiniz!");
                para = scan.nextInt();
                /*
                if(para>20 || para<1){
                    System.out.println("lutfen 1$ 5$ 10$ veya 20$ giriniz");
                }else if(!(para==20 || para==10 || para==5 || para==1)){
                    System.out.println("lutfen 1$ 5$ 10$ veya 20$ giriniz");

                }else{

                 */

                boolean cikis = false;
                do {
                    if (para < urunFiyatlarListesi.get(i)) {
                        System.out.println("Girdiginiz Miktar odemeyi karsilamiyor lutfen para girisi yapiniz");
                        ekstraPara = scan.nextInt();
                        para = ekstraPara + para;


                        if (para >= urunFiyatlarListesi.get(i)) {
                            System.out.println("Lutfen bekleyiniz Siparisiniz hazirlaniyor ...");
                            Thread.sleep(3000);
                            paraUstu = para - urunFiyatlarListesi.get(i);
                            System.out.println("Para ustu = " + paraUstu + "$");
                           cikis = true;
                        }

                    } else {
                        System.out.println("Lutfen bekleyini Siparisiniz hazirlaniyor ...");
                        Thread.sleep(3000);
                        paraUstu = para - urunFiyatlarListesi.get(i);
                        System.out.println("Para ustu = " + paraUstu + "$");
                        cikis = true;

                    }

                } while (!cikis);
                break;
      }
        }
        String secim;
        do{
        System.out.println("Baska birsey almak ister misiniz?  Y / N");
        secim = scan.next();

            if (secim.equalsIgnoreCase("y")) {
                urunlisteleme();
                urunSec();

            }
           else if(secim.equalsIgnoreCase("n")) {
                System.out.println("================================================");
                System.out.println("=  Bizi Tercih ettiginiz icin tesekkur ederiz  =");
                System.out.println("================================================");
            }else{
                System.out.println("Lutfen Devam etmek isyiyorsaniz 'Y' istemiyorsaniz 'N' seciniz");
            }
        } while(!(secim.equalsIgnoreCase("y")||secim.equalsIgnoreCase("n")));



    }
}