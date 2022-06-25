package Day10_StringManipulations;

public class Soru2 {
    public static void main(String[] args) {
        /* Kullanicidan bir cumle ve bir kelime isteyin kelimenin cumledeki
        kullanimina bakarak asagidaki 3 cumleden uygun olani yazdirin

        -girilen kelime cumlede kullanilmamis
        -girilen kelime cumlede 1 kere kullanilmis
        -grilen kelime cumlede 1'den fazla kullanilmis

         */

        String cumle = "Java ile hayat ne ne hos";
        String kelime = "i";

        if (cumle.indexOf(kelime) == -1) {
            System.out.println("girilen kelime cumlede kullanilmamis");
        } else if (cumle.indexOf(kelime,cumle.indexOf(kelime)+1) !=-1){
            System.out.println("grilen kelime cumlede 1 den fazla kullanilmis ");
        } else {
            System.out.println("girilen kelime cumlede 1 kere kullanilmis");
        }
        System.out.println(cumle.indexOf(kelime));
        System.out.println(cumle.indexOf(kelime,cumle.indexOf(kelime)+1));

    }
}

