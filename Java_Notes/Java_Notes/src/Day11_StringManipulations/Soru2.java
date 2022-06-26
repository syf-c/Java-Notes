package Day11_StringManipulations;

public class Soru2 {
    public static void main(String[] args) {
        /* Kullanicidan bir cumle ve bir kelime isteyin kelimenin cumledeki
        kullanimina bakarak asagidaki 3 cumleden uygun olani yazdirin

        -girilen kelime cumlede kullanilmamis
        -girilen kelime cumlede 1 kere kullanilmis
        -grilen kelime cumlede 1'den fazla kullanilmis

         */

        String cumle="java ogrenmek ne ne guzel";
        String kelime = "og";

        if (cumle.lastIndexOf(kelime) == -1){
            System.out.println("girilen kelime cumlede kullanilmamis");
        }else if (cumle.lastIndexOf(kelime,cumle.lastIndexOf(kelime)-1) ==-1){
            System.out.println("girilen kelime cumlede 1 kere kullanilmis");
        }else{
            System.out.println("grilen kelime cumlede 1'den fazla kullanilmis");
        }
    }
}
