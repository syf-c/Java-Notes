package Day14_methodCreation;

public class C03_MethodCreation {
    public static void main(String[] args) {
        //input olarak verilen isim ve soy ismi ilk harfi buyuk
        // geriye kalan harflaer yildiz olacak sekilde yazdiran bir method olusturun
        String isim = "Enes";
        String soyIsim = "Bozkurt";

        ismigizle(isim,soyIsim); //E*** B******
        C02_MethodCreation.rakamlarToplami(654); //15 sonucunu dondurur
    }

    public static void ismigizle(String isim, String soyIsim) {
        isim =isim.substring(0,1).toUpperCase()+isim.substring(1).replaceAll("\\w","*");
        soyIsim =soyIsim.substring(0,1).toUpperCase()+soyIsim.substring(1).replaceAll("\\w","*");
        System.out.println(isim + " " + soyIsim);
    }

}
