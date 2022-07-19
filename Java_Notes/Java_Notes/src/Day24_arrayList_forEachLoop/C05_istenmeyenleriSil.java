package Day24_arrayList_forEachLoop;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C05_istenmeyenleriSil {
    public static void main(String[] args) {
        // Soru 4) Verilen bir array’de delete words with unwanted lettersip,
        // kalan elementleri yeni bir array yapin

        String[] sehirler = {"Istanbul", "Ankara", "Mersin", "Konya", "Kastamonu"};
        String istenmeyenHarf = "r";
        List<String> kalanlar = new ArrayList<>();

        for (int i = 0; i <sehirler.length ; i++) {
            if (!sehirler[i].contains(istenmeyenHarf)){
                kalanlar.add(sehirler[i]);
            }
        }
        //yeni bir array olusturup listeyi ona aktaralim
        String[] kalanlarArray=new String[kalanlar.size()];
        for (int i = 0; i <kalanlarArray.length ; i++) {
            kalanlarArray[i]=kalanlar.get(i);
        }

        //sehirler arryinin yeni degerini atayalim
        sehirler=kalanlarArray;

        System.out.println(Arrays.toString(sehirler));


    }
}