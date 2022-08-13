package Day47_Maps;

import Day46_Map.ReusableMethod;

import java.util.Map;
import java.util.Set;

public class C05_EntryUpdate {
    public static void main(String[] args) {
        /*
        soyismi Can olanlarin bransini DataScience yapalim
         */

        Map<Integer, String> sinifListMap = ReusableMethod.mapOlustur();

        //entryleri alalim

        Set<Map.Entry<Integer, String>> entrySet = sinifListMap.entrySet();
        String entryValue;
        String[] entryArr;
        for (Map.Entry<Integer, String> entry : entrySet) {
            entryValue = entry.getValue();
            entryArr = entryValue.split(", ");
            if (entryArr[1].equals("Can")) {
                entryArr[2] = "DataScience";
                entry.setValue(entryArr[0] + ", " + entryArr[1] + ", " + entryArr[2]);
            }
        }
        System.out.println(sinifListMap);
    }
}
