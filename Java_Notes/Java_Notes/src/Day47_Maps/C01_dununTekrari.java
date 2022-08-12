package Day47_Maps;

import Day46_Map.ReusableMethod;

import java.util.Map;

public class C01_dununTekrari {
    public static void main(String[] args) {
        Map<Integer, String> sinifListMap = ReusableMethod.mapOlustur();
        System.out.println(sinifListMap);

        //ogrenci listesini isim soyisim olarak yazdirin

        ReusableMethod.tumValueSiraliYazdir(sinifListMap);


        //kac farkli brans varsa bransIsmi = branstakiOgrencisayisi seklinde yazdirin

        ReusableMethod.bransOgrenciSayisiYazdir(sinifListMap);


    }
}
