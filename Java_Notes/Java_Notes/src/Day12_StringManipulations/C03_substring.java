package Day12_StringManipulations;

public class C03_substring {
    public static void main(String[] args) {

        String isim = "Suleyman";
        String soyIsim ="Karanfil";
        String kartNo  = "1125 5858 9699 9946";

        System.out.println(isim.substring(3)); //eyman
        System.out.println(soyIsim.substring(soyIsim.length()-3)); //fil
        System.out.println(isim.substring(2,4)); //le
        
        //isim ve soyisimin ilk harfi buyuk harf geri kalanlar  * olsun
        //kredi kartinin ilk 4 rakami gorunsun geriye kalanlar * olsun
        
        String isimilkHarf = isim.substring(0,1).toUpperCase();
        String isimGeriyeKalanlar = isim.substring(1).replaceAll("\\w","*");

        String soyIsimilk = soyIsim.substring(0,1).toUpperCase();
        String soyIsimGeriyeKalanlar = soyIsim.substring(1).replaceAll("\\w" , "*");

        String kkilk4 = kartNo.substring(0,4);
        String kkGeriyeKalanlar = " **** **** ****";


        System.out.println(isimilkHarf +isimGeriyeKalanlar +" " +
                soyIsimilk + soyIsimGeriyeKalanlar +" \n"+ kkilk4+kkGeriyeKalanlar);

    }
}
