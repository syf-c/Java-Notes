package Day21_Arrays;

import java.util.Arrays;

public class C08_binarySearch {
    /*
    Java'da eleman aramaanin kisa yoludur
    Ancak binary search 'un calismasi icin once
    Array'in sirali hale(sort) getirilmesi gerekir
    Eger siralama yapmadan binarSearch yaparsaniz
    sonucu bulamayabilir veya yanlis bulabilir
     */
    public static void main(String[] args) {


        String[] harfler = {"Y", "B", "D", "G", "O"};
        String aranaHarf = "z";

        System.out.println(Arrays.binarySearch(harfler, aranaHarf)); //-6 sort kullanilmadigi icin bulamadi
        //binarySearch bize aradigimiz elemanin indeexini dondurur
        //array sirali olmadigi icin arama sonucu dogru olmayabilir
        //emin olmak icin once sort yapmaliyiz

        Arrays.sort(harfler);
        System.out.println(Arrays.binarySearch(harfler,aranaHarf)); // 4 uncu indexte oldugunu soyluyor

        //binarySearch listede olmayan elemanlari sira numarasi kac olmali ise onu negatif olarak verir
        //ork :"Z" besinci indextedir ama olmadigi icin listedeki olsaydi hangi sirada olur diye bakiyor
        //ve 6 sirada olurdu olmadigi icin -6 donduruyor


    }
}