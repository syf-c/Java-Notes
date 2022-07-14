package Day21_Arrays;

public class C02_EnuzunVeEnKisaIsim {
    /*
    Soru 2- Verilen String bir array’de en uzun ve en kisa String’leri yazdiran bir method olusturun
     */
    public static void main(String[] args) {
        String[] isimler={"Erdal","Musa","Hayrullah","Halilcan"};

        enuzunVeEnKisaIsim(isimler);
    }

    public static void enuzunVeEnKisaIsim(String[] isimler) {

        String enuzunkelime= isimler[0];
        String enKisakelime= isimler[0];

        for (int i = 1; i <isimler.length ; i++) {
            if(isimler[i].length()>enuzunkelime.length()){
                enuzunkelime=isimler[i];
            }
            if(isimler[i].length()<enKisakelime.length()){
                enKisakelime=isimler[i];
            }
        }
        System.out.println("Arraydeki en Kisa kelime = " + enKisakelime);
        System.out.println("Arraydeki en uzun kelime = " + enuzunkelime);
    }
}
