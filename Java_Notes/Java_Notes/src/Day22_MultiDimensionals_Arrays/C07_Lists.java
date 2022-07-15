package Day22_MultiDimensionals_Arrays;

import java.util.ArrayList;
import java.util.List;

public class C07_Lists {
    public static void main(String[] args) {

        List<Integer> sayilar = new ArrayList<>();
        /*
        listler primitive data turlerini kabul etmez(wrapper kilas kullanmak zorundayiz int yerinz Integer
         */

        sayilar.add(5);
        sayilar.add(6);
        sayilar.add(7);
        System.out.println(sayilar);//[5, 6, 7] eklenenler herzaman sona eklenir

        sayilar.add(2,10); //indexi 2 olan element yerine 10 yazar dikkat updaye degil ekleme yapiyor
                                        //yani 2inci indexteki eleman yerine 10 yazar eski 2 inci index 3uncu indexe kayar
        System.out.println(sayilar);//[5, 6, 7]bu hale giliyor [5, 6, 10, 7]

    }
}
