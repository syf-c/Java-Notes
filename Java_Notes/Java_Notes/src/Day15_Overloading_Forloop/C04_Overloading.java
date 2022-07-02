package Day15_Overloading_Forloop;

public class C04_Overloading {
    public static void main(String[] args) {
        topla(5, 7); //iki integerin toplami :12
        topla(5.2, 3); //bir double ve integerin toplami :8.2
        topla(5.2, 5.5); // iki double'in toplami :10.7
        topla(5,6.2); // burda ucuncu method calisiyor ve java data casting(auto widening) otomatik genisletme yapiyor
                        //yani 5 integer double a ceviriliyor dikkat integer double a sigmmaz
    }

    /*
    java hangi method'un calisacagina karar verirken optimizasyon yapar
    -eger hiv cast yapmadan kullanabilecegi bir method varsa onu kullanir
    -eger cast yapmadan bir method yoksa en az cast yaparak kullacabilecegi methodu terceih eder
     */

    public static void topla(int sayi1, int sayi2) {
        System.out.println("iki integerin toplami :" + (sayi1 + sayi2));
    }

    public static void topla(double sayi1, int sayi2) {
        System.out.println("bir double ve integerin toplami :" + (sayi1 + sayi2));
    }

    public static void topla(double sayi1, double sayi2) {
        System.out.println("iki double'in toplami :" + (sayi1 + sayi2));
    }

}
