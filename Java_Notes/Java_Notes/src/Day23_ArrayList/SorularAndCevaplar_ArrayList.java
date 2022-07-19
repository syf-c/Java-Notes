package Day23_ArrayList;

import java.util.*;

public class SorularAndCevaplar_ArrayList {

    /*
    1) Elemanlari A, C, E, ve F olan bir String ArrayList olusturup ekrana yazdiriniz.

    2) indexsiz add( ) methodunu kullanarak, B'yi ekleyiniz.
    index'li add( ) methodunu kullanarak, L'yi 1 numarali index'e ekleyiniz.
    ArrayList'i ekrana yazdiriniz, list goyle olmali; A, L, C, E, F, B.

    3) set( ) methodu kullanarak, E'yi D yapiniz.
    ArrayList'i ekrana yazdiriniz, list goyle olmali; A, L, C, D, F, B

    4) remove( ) methodu kullanarak, F'yi siliniz.
    ArrayList'i ekrana yazdiriniz, list goyle olmali; A, L, C, D, B.

    5) sort( ) methodu kullanarak, elemanlari alfabetik siraya diziniz.
    ArrayList'i ekrana yazdiriniz, list goyle olmali; A, B, C, D, L.

    6) contains( ) methodu kullanarak, L'nin list'de var oldugunu ve M'nin list'de var
    olmadigini dogrulayiniz.

    7) size( ) methodu kullanarak, list'in kag eleman oldugunu ekrana yazdiriniz.

    8) clear( ) methodu kullanarak, list'deki tum elemanlari siliniz.

    9) isEmpty( ) methodu kullanarak, list'deki tum elemanlarin silindigini dogrulayiniz

     */

    public static void main(String[] args) {
        String[] arr = {"A", "C", "E", "F"};
        elemanEkle(arr);
        //Soru_1 System.out.println(Arrays.toString(arr));// [A, C, E, F]
        //Soru_2 System.out.println(elemanEkle(arr)); //[A, L, C, D, E, F, B]
        //Soru_3 System.out.println(elemanEkle(arr)); //[A, L, C, D, F, B]
        //Soru_4 System.out.println(elemanEkle(arr)); //[A, L, C, D, B]
        //Soru_5 System.out.println(elemanEkle(arr)); //[A, B, C, D, L]
        //Soru_6
        // elemanEkle(arr).contains("L");
        // System.out.println("'L' listede var mi?  " + elemanEkle(arr).contains("L"));//'L' listede var mi?  true
        // elemanEkle(arr).contains("L");
        // System.out.println("'M' listede var mi?  " + elemanEkle(arr).contains("M"));//'M' listede var mi?  false
        //soru_7 System.out.println(elemanEkle(arr).size()); // 5
        //Soru_8 System.out.println(elemanEkle(arr)); //[]
        //Soru_9
        System.out.println(elemanEkle(arr).isEmpty()); //true
    }

    private static List<String> elemanEkle(String[] arr) {
        List<String> ekleList = new ArrayList<>();
        for (String each : arr) {
            ekleList.add(each);
        }
        ekleList.add("B");
        ekleList.add(1, "L");
        ekleList.set(3, "D");
        ekleList.remove("F");
        Collections.sort(ekleList);
        ekleList.size();
        ekleList.clear();

        return ekleList;
    }
}

