package Day31_timeFormatter_varrags;

public class C02_Varargs {
    public static void main(String[] args) {


        //verilen 2 int'i topmayip smonucu yazdiran bir method olusturunuez

        int sayi1 = 10;
        int sayi2 = 20;
        int sayi3 =30;

        toplaYazdir(sayi1,sayi2,sayi3);

    }

    private static void toplaYazdir(int sayi1, int sayi2, int sayi3) {
        System.out.println("verilen 3 sayinin toplami :" +(sayi1 + sayi2 + sayi3));
    }

    private static void toplaYazdir(int sayi1, int sayi2) {
        System.out.println("verilen iki sayinin toplami"+(sayi1+sayi2));
    }
}