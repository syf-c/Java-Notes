package Day18_While_Do_WhileLoop;

public class C01_Do_WhileLoop {
    public static void main(String[] args) {


     /*
        Soru 4 ) Kullanicidan baslangic ve bitis haflerini alin
        ve baslangic harfinden baslayip bitis harfinde biten
        tum harfleri buyuk harf olarak ekrana yazdirin.
        Kullanicinin hata yapmadigini farz edin.
         */

        char bas = 'c';
        char son = 't';

        char temp = bas;
        String harfBuyut ="";

        while (temp <= son) {
            harfBuyut=(temp + "").toUpperCase();
            System.out.print(harfBuyut + " ");
            temp+=1;
        }

    }
}