package Recap1;

import java.util.Scanner;

public class QA03_BMI {

    /*
     Kullanicidan kilosunu ve boyunu alip
     Vucut kitle indeksini hesaplayan bir program yaziniz.
     Ipucu : Vucut
     Kitle Indeksi (VKI) = Vucut Agirligi(kg.) / Boy uzunlugunun karesi (m.)
     ORNEK:
     INPUT      : Kilo: 71
                  Boy: 1,72
     OUTPUT  : Vucut Kitle Indeksiniz : 23
          */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("lutfen kilonuzu giriniz :");
        double kilo = scan.nextDouble();
        System.out.println("lutfen boyunuzu giriniz : ");
        double boy = scan.nextDouble();

        boy = boy / 100;
        double vucut_kitle_index = kilo / (boy * boy);
        System.out.println(vucut_kitle_index);


    }
}
