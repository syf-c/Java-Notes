package Day21_Arrays;

public class C02_EnuzunVeEnKisaIsim_Tekrar {
     /*
    Soru 2- Verilen String bir array’de en uzun ve en kisa String’leri yazdiran bir method olusturun
     */
     public static void main(String[] args) {
         String[] isimler={"Hasan","Hayrettin","Keriman","Gurbuz","Gunes","Gulumserler"};
         String enkisaIsim=isimler[0];
         String enuzunIsim=isimler[0];

         for (int i = 0; i <isimler.length; i++) {
             if(enkisaIsim.length()>=isimler[i].length()){
                 enkisaIsim=isimler[i];
             }
             if(enuzunIsim.length()<=isimler[i].length()){
                 enuzunIsim=isimler[i];
             }
         }
         System.out.println("En Uzun Isim = " + enuzunIsim);
         System.out.println("En Kisa Isim = " + enkisaIsim);
     }
}
