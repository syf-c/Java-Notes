package Day12_StringManipulations;

public class Soru1 {
    public static void main(String[] args) {
        /*
        String Metodlarini kullanarak "Java ogrenmek123 Cok guzel@" Stringini
        "Java ogrenmek cok guzel." sekline ceviriniz
         */

        String str = "Java ogrenmek123 Cok guzel@";
        String str2 =str.replaceAll("\\d","").replace("@",".").replace("C","c");

        System.out.println(str2);

    }
}
