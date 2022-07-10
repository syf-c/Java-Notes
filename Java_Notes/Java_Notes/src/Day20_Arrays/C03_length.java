package Day20_Arrays;

import java.util.Arrays;

public class C03_length {
    public static void main(String[] args) {

        // iki sekilde array olusturabiliriz
        int sayilar[] = {1, 2, 3, 4, 5};

        String harfler[] = new String[4];
        System.out.println(Arrays.toString(harfler)); // [null, null, null, null] Stringlere defaul null atar

        System.out.println("sayilar arrayinin uzunlugu :" + sayilar.length); //3
        System.out.println("harfler arrayinin uzunlugu :" + harfler.length); //4


        //harfler arrayinin son elemanini yazdiralmim

        System.out.println(harfler[harfler.length-1]); //null

      // System.out.println(harfler[5]); 5'inci index olmadigi icin  ArrayIndexOutOfBoundsException hatasi verir


    }
}
