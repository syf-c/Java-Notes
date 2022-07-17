package Day23_ArrayList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class C07_sort {
    public static void main(String[] args) {
        List<String> urunler = new ArrayList<>();
        urunler.add("Nutella");
        urunler.add("Ikram");
        urunler.add("Cekirdek");
        urunler.add("Cay");

        System.out.println(urunler); //[Nutella, Ikram, Cekirdek, Cay]

        Collections.sort(urunler);      //sort yaptiktan sonra
        System.out.println(urunler); // [Cay, Cekirdek, Ikram, Nutella]

        /*
        List ile gelen sort method 'unda siralama ozelligini girmek gerekiyor
        bunun yerine Collections class' indan sort method unu kullaniyoruz
        bu method listemizi natural order'a gore siralar
        */
    }

}
