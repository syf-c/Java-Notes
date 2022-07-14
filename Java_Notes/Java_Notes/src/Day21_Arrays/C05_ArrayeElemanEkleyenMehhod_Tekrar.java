package Day21_Arrays;

import java.util.Arrays;

public class C05_ArrayeElemanEkleyenMehhod_Tekrar {
/*
        Soru 5- Verilen bir array’e yeni bir element ekleyen method olusturun
         */
public static void main(String[] args) {
    String[] sinifList={"Ali Can","Nida yucedal","Musa yaman"};
    String eklenecekIsim="Musa Gurbuz";

    String[] sonuc=ArrayElemanEkle(sinifList,eklenecekIsim);
    System.out.println(Arrays.toString(sonuc));
}

    private static String[] ArrayElemanEkle(String[] sinifList, String eklenecekIsim) {
        String[] yeniSinifListesi =new String[sinifList.length+1];
        for (int i = 0; i <sinifList.length ; i++) {
           yeniSinifListesi[i]=sinifList[i];
        }
        yeniSinifListesi[yeniSinifListesi.length-1]=eklenecekIsim;

        return yeniSinifListesi;



    }

}

