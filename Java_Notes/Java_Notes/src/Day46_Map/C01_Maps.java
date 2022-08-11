package Day46_Map;

import java.util.*;

public class C01_Maps {
    public static void main(String[] args) {

        Map<Integer, String> sinifList = new HashMap<Integer, String>();
        sinifList.put(101, "Ali, Can, JDev");
        sinifList.put(102, "Enes, Cem, QA");
        sinifList.put(103, "Taha, Emre, Java");
        sinifList.put(104, "Musa, Gurbuz, QA");

        System.out.println(sinifList);
        System.out.println(sinifList.keySet());
        System.out.println(sinifList.values());
        System.out.println(sinifList.values().size());

        // tum ogrzencilerin isim  ve soy isimlerini sira no ile alt alta yazdirin

        Collection<String> tumValueColl = sinifList.values();
        String[] eachArr;
        int sira = 1;
        for (String each : tumValueColl) {
            // buradaki each bize herbir ogrenciye ait
            // ayni yapidaki isim,soyisim,brans bilgilerini iceren stringler getiriyor
            eachArr = each.split(", ");

            System.out.println(sira + "- " + eachArr[0] + " "+ eachArr[1]);
            sira ++;
        }

        // Map'de bulunan ogrencilerin, isi ve soyisimlerini birlestirerek
        // bir sinif listesi olusturun

        List<String> sinifIsimSoyisimList = new ArrayList<>();

        for (String each: tumValueColl){

            eachArr = each.split(", ");
            sinifIsimSoyisimList.add(eachArr[0]+ " "+ eachArr[1]);
        }
        System.out.println(sinifIsimSoyisimList);



    }
}
