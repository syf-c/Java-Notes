package Day18_WhileLoop;

public class Soru6_TamBolenler {
    /*
    Soru 6) Kullanicidan bir sayi alin ve bu sayiyi tam bolen sayilari
    ve toplam kac tane olduklarini ekranda yazdirin
     */
    public static void main(String[] args) {
        int sayi = 125;
        int bolenlerAdet = 0;
        System.out.print("tam bolen sayilar : ");
        //-------For loop---------------------------------------------------
        for (int i = 1; i <= sayi; i++) {
            if (sayi % i == 0) {
                System.out.print(i + " ");
                bolenlerAdet += 1;
            }
        }
        System.out.println("");
        System.out.println(bolenlerAdet + " Adet boleni vardir");


        //-------------While loop-------------------------------------------
        int bas = 1;
        bolenlerAdet = 0;
        System.out.print("tam bolen sayilar : ");
        while (bas <= sayi) {
            if (sayi % bas == 0) {
                System.out.print(bas + " ");
                bolenlerAdet += 1;

            }
            bas++;
        }
        System.out.println("");
        System.out.println(bolenlerAdet + " Adet boleni vardir");
    }
}
