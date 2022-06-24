package Day11_StringManipulations;

import java.util.Locale;

public class C04_Contains {
    public static void main(String[] args) {
        /*
        Soru 2) Kullanicidan bir cumle isteyin. Cumle “buyuk” kelimesi iceriyorsa tum cumleyi buyuk harf olarak,
         “kucuk” kelimesi iceriyorsa tum cumleyi kucuk harf olarak yazdirin,
        iki kelimeyi de icermiyorsa “Cumle kucuk yada buyuk kelimesi icermiyor” yazdirin.
         */


        String cumle ="Java buyulu dunya kucuk";
        cumle =cumle.toLowerCase();

        if(cumle.contains("kucuk")&&cumle.contains("buyuk")){
            System.out.println("karar ver buyuk mu kucuk mu olsun");
        }else if (cumle.contains("buyuk")){
            System.out.println(cumle.toUpperCase());
        }else if(cumle.contains("kucuk")){
            System.out.println(cumle.toLowerCase());
        } else{
            System.out.println("cumle kucuk yada buyuk icermiyor");
        }

    }
}
