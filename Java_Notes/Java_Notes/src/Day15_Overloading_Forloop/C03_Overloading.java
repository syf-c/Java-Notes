package Day15_Overloading_Forloop;

public class C03_Overloading {
    public static void main(String[] args) {
        topla(5,7); //iki integerin toplami :12
        topla(5.2,3); //bir double ve integerin toplami :8.2
        topla(5.2,5.5); // iki double'in toplami :10.7
    }

    public static void topla(int sayi1,int sayi2) {
        System.out.println("iki integerin toplami :" + (sayi1+sayi2));
    }
    /*
    *** Bir class da parametre saysisi ve parametre data tuleri ayni olan 2 method OLUSTURULAMAZ ***

    public static void topla(int sayi3,int sayi4) {
        System.out.println("iki integerin toplami :" + (sayi3+sayi4));
    }
    */
    public static void topla(double sayi1,int sayi2) {
        System.out.println("bir double ve integerin toplami :" + (sayi1+sayi2));
    }
    public static void topla(int sayi1,double sayi2) {
        System.out.println("bir integerin ve bir double'in toplami :" + (sayi1+sayi2));
    }
    public static void topla(double sayi1,double sayi2) {
        System.out.println("iki double'in toplami :" + (sayi1+sayi2));
    }

}
