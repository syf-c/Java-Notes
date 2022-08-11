package Day46_Map;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ReusableMethod {
    public static Map<Integer, String> mapOlustur(){
        Map<Integer, String> sinifList = new HashMap<>();
        sinifList.put(101, "Ali, Can, JDev");
        sinifList.put(102, "Enes, Cem, QA");
        sinifList.put(103, "Taha, Emre, Java");
        sinifList.put(104, "Musa, Gurbuz, QA");

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
}
