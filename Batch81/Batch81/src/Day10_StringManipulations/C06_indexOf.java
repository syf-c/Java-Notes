package Day10_StringManipulations;

public class C06_indexOf {
    public static void main(String[] args) {

        String str ="Java ogrenmek cok guzel";

        System.out.println(str.indexOf("o")); // 5
        System.out.println(str.indexOf('g')); // 6 istersek char istersek string yazabiliriz
        System.out.println(str.indexOf("t"));   // bana integer donduruyor
                                                // int'de yok diye bir deger bulunmuyor
                                                // 0 dersek J'nin index'idir
                                                // - bir deger donerse biz aranan string'in str'da olmadigini anlariz
                                                // Java -1 dondurmeyi tercih etmistir
    }
}
