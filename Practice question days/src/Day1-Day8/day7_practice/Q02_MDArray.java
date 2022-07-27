package day7_practice;

import java.util.Arrays;

public class Q02_MDArray {

    /*
     *  String 2D array olustur
     *  {{"$12" , "$22" , "0$"},   {"€9" , "€40" , "$1" },  {"€12", "$2","$0"}}
     *  String de $ varsa 3.2 ile carp
     *  String de € varsa 4.2 ile carp
     *  elemanlarin toplamini double olarak yazdir
     */
    public static void main(String[] args) {
        String[][] hesap = {{"$12", "$22", "0$"}, {"€9", "€40", "$1"}, {"€12", "$2", "$0"}};
        //  Arrays.sort(hesap);
        //  System.out.println(Arrays.binarySearch(hesap,"$"));

        double sonuc1 = 0;
        double sonuc2 = 0;

        for (int i = 0; i < hesap.length; i++) {
            for (int j = 0; j < hesap[i].length; j++) {
                if (hesap[i][j].contains("$")) {
                    sonuc1 += Double.parseDouble(hesap[i][j].replaceAll("\\W", "")) * 3.2;
                }
                if (hesap[i][j].contains("€")) {
                    sonuc2 += Double.parseDouble(hesap[i][j].replaceAll("\\W", "")) * 4.2;
                }
            }
        }
        System.out.println(Arrays.deepToString(hesap));
        System.out.printf("sonuc1 = %.02f \n", sonuc1);
        System.out.printf("sonuc2 = %.02f \n", sonuc2);
        System.out.printf("elemanlar toplami : %.02f \n ",(sonuc1+sonuc2));

    }
}

