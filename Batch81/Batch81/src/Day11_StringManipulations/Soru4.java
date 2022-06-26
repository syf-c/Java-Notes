package Day11_StringManipulations;

public class Soru4 {
    public static void main(String[] args) {
        /*
        Kullanicidan bir cumle isteyin cimle 'buyuk' kelimesi iceriyorsa tum cumleyi buyuk harf olarak "kucuk" kelimesi
        iceriyorsa tum cumleyi kucuk harf olarak yazdirin iki kelimeyi de icermiyorsa "cumle kucuk yada buyuk kelime icermiyor"
        her ikisini de iceriyorsa "birini secin" yazdirin
         */

        String cumle = "Bugun bahce cocuklarla dolu";

        if (cumle.contains("buyuk") && cumle.contains("kucuk")) {
            System.out.println("lutfen birini secin");
        } else if (cumle.contains("kucuk")) {
            System.out.println(cumle.toLowerCase());
        } else if (cumle.contains("buyuk")) {
            System.out.println(cumle.toUpperCase());
        } else {
            System.out.println("cumlede 'buyuk' yada 'kucuk' kelimesi yoktur");
        }
    }
}
