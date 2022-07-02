package Day15_Overloading_Forloop;

public class C01_ReturnMethod {
    //verilen iki sayiyi carpip sonucu bize donduren bir method olusturun
    public static void main(String[] args) {

        int sayi1 =10;
        int sayi2 =5;

        int sonuc = carpGetir(sayi1,sayi2);
       // System.out.println("Sayilarin carpimi :" +carpGetir(sayi1,sayi2));
        System.out.println("Sayilarin carpimi : " + sonuc);

    }

    public static int carpGetir(int sayi1, int sayi2) {
        return sayi1 * sayi2;
    }
}
