package Day48_Maps;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class C01_NestedMaps {
    public static void main(String[] args) {
        /*
          eger bir elementle ile ilgili tutacagimiz bilgiler coksa veya kompleks ise
          bu defa ic ice map kullanmayi tercih edebiliriz
          ic ice map kullandigimizda daha fazla datayi,
          daha duzenli olarak tutma imkanimiz olur
          Ancak, bilgiye ulasmak ve manipule etmek zorlasacaktir.
          Ornek olarak dunku map'imizi map'lerden olusan bir map olarak olusturalim
          sinifMap.put(no=102,isim=Enes,soyisim= Cem,brans= Tester);
          sinifMap.put(103,"Taha, Emre, JDev");
          sinifMap.put(104,"Derya, Deniz, Devops");
         */
        Map<String,String> ogr1 = new HashMap<>();
        ogr1.put("isim","Musa");
        ogr1.put("soyisim","Gurbuz");
        ogr1.put("brans","QA");

        Map<String,String> ogr2 = new HashMap<>();
        ogr2.put("isim","Enes");
        ogr2.put("soyisim","Can");
        ogr2.put("brans","JDev");

        Map<String,String> ogr3 = new HashMap<>();
        ogr3.put("isim","Ali");
        ogr3.put("soyisim","Gurbuz");
        ogr3.put("brans","Tester");

        Map<Integer,Map<String,String>> ogrenciMap = new HashMap<>();
        ogrenciMap.put(101,ogr1);
        ogrenciMap.put(102,ogr2);
        ogrenciMap.put(103,ogr3);

        System.out.println(ogrenciMap);
        //{101={soyisim=Gurbuz, brans=QA, isim=Musa}, 102={soyisim=Can, brans=JDev, isim=Enes}, 103={soyisim=Gurbuz, brans=Tester, isim=Ali}}

        // Alt alta duzenli yazdirmak icin set olusturmak gerekiyor
        Set<Map.Entry<Integer, Map<String, String>>> ogrenciEntrySeti = ogrenciMap.entrySet();

        for(Map.Entry<Integer, Map<String, String>>  each : ogrenciEntrySeti){
            System.out.println(each);
        }

        System.out.println(ogrenciMap.get(102).get("isim")); //102 nolu kisinin ismine ulasiriz
    }
}
