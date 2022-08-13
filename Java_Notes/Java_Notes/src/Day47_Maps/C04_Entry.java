package Day47_Maps;

import Day46_Map.ReusableMethod;

import java.util.Map;
import java.util.Set;

public class C04_Entry {
    public static void main(String[] args) {

        Map<Integer,String> sinifListMap = ReusableMethod.mapOlustur();
        System.out.println(sinifListMap);

        //Map'in herbir elemani alt alta yazdirin

       Set<Map.Entry<Integer,String>> sinifEntrySet=sinifListMap.entrySet();

       for (Map.Entry<Integer,String> each: sinifEntrySet){
           System.out.println(each);
       }

       //Map'in tum elemanlarinda varsa Tester bransini QA olarak degistirelim
        String eachValue;
        for (Map.Entry<Integer,String> each: sinifEntrySet){
            eachValue=each.getValue();
            eachValue = eachValue.replace("Tester","QA");
            each.setValue(eachValue);
        }
        System.out.println(sinifListMap);
    }
}
