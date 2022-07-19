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
        String[][] hesap={{"$12" , "$22" , "0$"},   {"€9" , "€40" , "$1" },  {"€12", "$2","$0"}};
      //  Arrays.sort(hesap);
      //  System.out.println(Arrays.binarySearch(hesap,"$"));

            double sonuc1=0;
            for (int i = 0; i <hesap.length ; i++) {
            for (int j = 0; j <hesap[i].length ; j++) {
                System.out.println(Arrays.toString(hesap[i]));
                if (Arrays.binarySearch(hesap,"$")<0){

                }
                }
            }
        }
    }

