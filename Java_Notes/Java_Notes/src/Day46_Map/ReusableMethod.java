package Day46_Map;

import java.util.*;

public class ReusableMethod {
    public static Map<Integer, String> mapOlustur(){
        Map<Integer, String> sinifList = new HashMap<>();
        sinifList.put(101, "Ali, Can, JDev");
        sinifList.put(102, "Enes, Cem, QA");
        sinifList.put(103, "Taha, Emre, JDev");
        sinifList.put(104, "Musa, Gurbuz, QA");
        sinifList.put(105, "Enes, Cemre, QA");
        sinifList.put(106, "Taha, Emin, Devops");
        sinifList.put(107, "Musa, Baltaci, QA");

        return sinifList;
    }


    public static void tumValueSiraliYazdir(Map<Integer, String> ogrenciMap) {
        int sira = 1;
        for (String each:ogrenciMap.values()){
            System.out.println(sira +"- "+ each);
            sira++;
        }
    }

    public static List<String> isimSoyisimListesiOlustur(Map<Integer, String> ogrenciMap) {
        List<String> methodadkiList = new ArrayList<String>();
        String[] eachArr;
        for (String each:ogrenciMap.values()){
            eachArr = each.split(", ");
            methodadkiList.add(eachArr[0]+" "+eachArr[1]);
        }
        return methodadkiList;
    }

    public static void bransOgrenciSayisiYazdir(Map<Integer, String> sinifListMap) {

        //bransIsmi = branstakiOgrencisayisi
        Map<String,Integer> bransOgrSayiMap = new TreeMap<>();
        Collection<String> valuesCollection = sinifListMap.values();

        String[] valueArr;
        String brans ;
        Integer bransdakiOgrencisayisi ;
        for (String each : valuesCollection) {
            valueArr = each.split(", ");
            brans = valueArr[2];

           //bransin bransOgrSayiMap key olarak daha onceden eklenip eklenmedigini kontrol etmeliyiz
            if (!bransOgrSayiMap.containsKey(brans)){
                bransOgrSayiMap.put(brans,1);
            }else{
               bransdakiOgrencisayisi= bransOgrSayiMap.get(brans);
               bransOgrSayiMap.put(brans,bransdakiOgrencisayisi+1);

            }

        }
        System.out.println(bransOgrSayiMap);

    }
}
