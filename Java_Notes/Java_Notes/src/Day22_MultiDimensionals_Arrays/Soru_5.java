package Day22_MultiDimensionals_Arrays;

import java.util.Arrays;

public class Soru_5 {
    /*
    Soru 5) Kullanicidan bir cumle isteyin ve cumledeki kelime sayisini yazdirin
     */
    public static void main(String[] args) {
        String str="Java Lutfen bana yardimci ol, ki seni ogrenebileyim.";

        str=str.replace(" ","azerty").replaceAll("\\W","").replace("azerty"," ");

        String[] arr =str.split(" ");
        System.out.println(Arrays.toString(arr));
        System.out.println("Cumlenizde "+arr.length+" adet kelime bulunmaktadir");
    }
}
