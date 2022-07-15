package Day22_MultiDimensionals_Arrays;

public class C02MdA_tumElementlereUlasma {
    public static void main(String[] args) {
        /*
        verilen bir multidimensional arrayin
        tum elementleri yazdiran bir metod olusturun
         */

        int[][] sayilar = {{1,5,6,9},{2,5},{3,1,6}};

        elementleriYazdir(sayilar);

    }

    private static void elementleriYazdir(int[][] sayilar) {
       int toplam=0;
        for (int i = 0; i <sayilar.length ; i++) { //
            for (int j = 0; j <sayilar[i].length ; j++) { //inner arraylarin uzunluguna baglidik
                System.out.print(sayilar[i][j]+ " ");   //1 5 6 9 2 5 3 1 6 butun elemanlara ulastik
                toplam+=sayilar[i][j];
            }

        }
        System.out.println(toplam);

    }
}
