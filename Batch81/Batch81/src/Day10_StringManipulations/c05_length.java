package Day10_StringManipulations;

public class c05_length {
    public static void main(String[] args) {

        String str ="Java ogren, isi kap";

        System.out.println(str.length());

        System.out.println(str.charAt((str.length())-1)); // son karakter
        System.out.println(str.charAt((str.length())-3)); // sondan 3 uncu karakter

        /*
        java'da null pointer(isaretleyici) bir deger degil ,karsisina yazildigi variable'in
        hic bir deger almadiginin isaretcisidir
          */

        String str2 = ""; //str2 'ye bir deger atanmis midir ? EVET
                            // bu deger hicliktir
        System.out.println(str2.length()); // 0 dir

        String str3 = null; //str2 'ye bir deger atanmis midir ? HAYIR
                            //null bu deger atamamayi isaret etmektedir
        System.out.println(str3.length()); // NullPointerException hatasi verir
    }
}
