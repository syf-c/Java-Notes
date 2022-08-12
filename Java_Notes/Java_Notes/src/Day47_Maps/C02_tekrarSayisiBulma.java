package Day47_Maps;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class C02_tekrarSayisiBulma {
    public static void main(String[] args) {
        /*
        verilen bir Stringdeki kullanilan harfleri ve
        kullanilan harflerin tekrar sayisini
        h=20 seklinde yazdirin
         */
        String str = "Heeeeeeeeeeellllooooo Wooorrrrlddddd.";
        str = str.replaceAll("\\W","");

        String[] harflerArr = str.split("");

        System.out.println(Arrays.toString(harflerArr));
        //[H, e, e, e, e, e, e, e, e, e, e, e, l, l, l, l, o, o, o, o, o, W, o, o, o, r, r, r, r, l, d, d, d, d, d]

        //harfleri key kullanim adedini value yapalim bir map olusturalim
        Map<String, Integer> harfkullanimsayilariMap = new HashMap<>(); //TreeMap yaparsak sirali getirir

        Integer harfkullanimsayisi;

        for (String each: harflerArr){
            if ( !harfkullanimsayilariMap.containsKey(each)){
                harfkullanimsayilariMap.put(each,1);
            }else {
               harfkullanimsayisi=harfkullanimsayilariMap.get(each);
               harfkullanimsayilariMap.put(each,harfkullanimsayisi+1);

            }

        }
        System.out.println(harfkullanimsayilariMap);

    }
}
