package Day46_Map;

import java.util.List;
import java.util.Map;

public class C02_MapsMethods {
    public static void main(String[] args) {
        Map<Integer, String> ogrenciMap=ReusableMethod.mapOlustur();
        System.out.println(ogrenciMap);

        // value'lari sira numarali olarak yazdirin
        ReusableMethod.tumValueSiraliYazdir(ogrenciMap);

        //isim ve soyisimlerin birlikte olacagi bir liste olusturun

       List<String> sinifisimSoyisimList =  ReusableMethod.isimSoyisimListesiOlustur(ogrenciMap);
        System.out.println("isim Soyisim Listesi : " + sinifisimSoyisimList);

    }
}
