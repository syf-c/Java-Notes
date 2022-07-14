package Day21_Arrays;

import java.util.Arrays;

public class C05_ArrayeElemanEkleyenMehhod {
    public static void main(String[] args) {
        /*
        Soru 5- Verilen bir array’e yeni bir element ekleyen method olusturun
         */
        String[] sinifList={"Ali Can","Nida yucedal","Musa yaman"};
        String eklenecekIsim = "Murat Babayigit";

        sinifList = elemanEkle(sinifList,eklenecekIsim);
        System.out.println(Arrays.toString(sinifList));
    }

    public static String[] elemanEkle(String[] sinifList, String eklenecekIsim) {
        String[] yeniSinifList = new String[sinifList.length+1];

        for (int i = 0; i <sinifList.length ; i++) {
            yeniSinifList[i] =sinifList[i];
        }

        yeniSinifList[yeniSinifList.length-1] =eklenecekIsim;

        return yeniSinifList;
    }
}
