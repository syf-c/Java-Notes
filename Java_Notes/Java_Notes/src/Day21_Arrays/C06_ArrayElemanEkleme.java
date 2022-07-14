package Day21_Arrays;

import java.util.Arrays;

public class C06_ArrayElemanEkleme {
    //C05 deki methodu kullarak array'e eleman ekleyelim

    public static void main(String[] args) {
        String[] takimListesi = {"Hakki","kadir","Tarik"};
        String eklenecekeleman = "Musa";

        takimListesi=C05_ArrayeElemanEkleyenMehhod_Tekrar.ArrayElemanEkle(takimListesi,eklenecekeleman);
        System.out.println(Arrays.toString(takimListesi));
    }
}
