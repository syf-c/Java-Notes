package Day30_immutable_Date;

import java.time.LocalTime;

public class C05_StringVsStringBuilder {
    public static void main(String[] args) {


    /*
    String mi yoksa String Builder mi daha hizlidir
    bunun icin bir String olusturup 1000 kere sonuna nokta ekleyelim
    oncesinde ve sonrasinda zamani alip
    aradaki farki bulalim

    ayni islemi String builder icinde yapalim
     */

    String str ="Ah java";
        LocalTime baslangic= LocalTime.now();
        for (int i = 0; i <1000 ; i++) {
            str += ".";
        }
        LocalTime bitis= LocalTime.now();

        System.out.println(baslangic);
        System.out.println(bitis);

        System.out.println("String zamni : " + (bitis.getNano()-baslangic.getNano()));

        baslangic=LocalTime.now();
        StringBuilder sb=new StringBuilder("Ahhhh Java");
        for (int i = 0; i <10000 ; i++) {
            sb.append(".");
        }
        bitis=LocalTime.now();
        System.out.println(baslangic);
        System.out.println(bitis);
        System.out.println("String Builder zaman : "+ (bitis.getNano()-baslangic.getNano()));


    }}
