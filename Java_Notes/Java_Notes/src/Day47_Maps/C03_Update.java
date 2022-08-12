package Day47_Maps;

import Day46_Map.ReusableMethod;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class C03_Update {
    public static void main(String[] args) {

        /*
        map.contains(Key) ==> verdigimiz key in mapte olup olmadigini boolean olarak doner
        map.contains(Value) ==> Bir butun olarak value'nun mapte olup olmadigini doner

        ONEMLI NOT : map.contains(Value) valunue'nun icindeki bir parcayi bulmada ise yaramaz
                    Eger value icindeki bir parcayi aratmak istiyorsak
                    map uzerinde manipulation yapmamiz lazim

        map.get(Key) ==> verilen key'e ait degeri dondurur
         */

        Map<Integer, String> sinifListMap = ReusableMethod.mapOlustur();

        System.out.println(sinifListMap);
        System.out.println(sinifListMap.containsKey(104));  //true
        System.out.println(sinifListMap.containsKey(114));  //false

        System.out.println(sinifListMap.containsValue("Ali, Can, JDev"));  //true "tamamini yazdik"

        System.out.println(sinifListMap.containsValue("JDev"));  //false

        //Verilen map de "JDev" degerlerini "JavaDeveloper" olarak degistirelim
        //Map'lerde replace tum value yu degistirmek istersek kullanilabilir
        // kismi degisikliklerde kullanamayiz

        Collection<String> valuesCollection = sinifListMap.values();
        for (String each : valuesCollection) {
            each = each.replaceAll("JDev", "JavaDeveloper");
            System.out.println(each); //burda sadece Colllection degisti ama atama yapilmadi !!!!!!!
        }

        // Map'i guncelleme yapmak icin key, yenideger'i maple eklemeliyiz
// ornegin key 101 icin value Ali, Can, JDev
// guncelleme icin siniflistMap. put (101, Ali, Can, JavaDeveloper)

// bunu yapabitmek icin herbir key'e ve ona ait value'ye intiyacim var
        Set<Integer> keySeti = sinifListMap.keySet();

        String eachValue;
        for (Integer each: keySeti){
           eachValue= sinifListMap.get(each);
           eachValue = eachValue.replace("JDev","JavaDeveper");
           sinifListMap.put(each, eachValue);
        }

        System.out.println(sinifListMap);


    }
}
