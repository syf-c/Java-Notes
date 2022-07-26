package Day31_timeFormatter_varrags;

public class C03_VarragsToplama {
    public static void main(String[] args) {
        //verilen kac int olursa olsun
        // hepsini topmayip sonucu yazdiran bir method olusturunuez

        int sayi1 = 10;
        int sayi2 = 20;
        int sayi3 =30;
        int sayi4 =40;
        int sayi5 =50;

        toplaYazdir(sayi1,sayi2,sayi3,sayi4,sayi5);
        toplaYazdir(sayi1,sayi2,sayi3,sayi4);
        toplaYazdir(sayi1,sayi2,sayi3);
        toplaYazdir(sayi1,sayi2);
    }

    private static void toplaYazdir(int...sayi) {
        /*
        int...sayi bu gosterim integer variable'lardan olusan bir varargs demektir
        varargs array alt yapisi kullanir
         */
        int toplam =0;
        int sayiAdedi= sayi.length;
        for (int each:sayi){
            toplam+=each;
        }
        System.out.println("Girilen " + sayiAdedi + " adet sayinin toplami :"+ toplam);
    }
}
