package Day18_WhileLoop;

public class Soru4_Harf {
    /*
    Soru 4 ) Kullanicidan baslangic ve bitis haflerini alin ve baslangic harfinden baslayip bitis
    harfinde biten tum harfleri buyuk harf olarak ekrana yazdirin. Kullanicinin hata
    yapmadigini farz edin.
     */
    public static void main(String[] args) {
        char bas = 'a';
        char bitis = 'z';
        String temp = "";


        while (bas <= bitis) {
            temp += bas + " ";
            bas++;
        }
        System.out.println(temp.toUpperCase());
    }
}
