package Day26_constructor;

public class OgretmenRunner01 {
    public static void main(String[] args) {
        Ogretmen01 ogretmen1 = new Ogretmen01();
        System.out.println("Ogretmen1 bilgileri" + ogretmen1);

        Ogretmen01 ogretmen2 = new Ogretmen01("Emre", "Akdogan", "1/1/2001", "Matematik", "Fizik");
        System.out.println("Ogretmen 2 " + ogretmen2);

        Ogretmen01 ogretmen3 = new Ogretmen01("Cavidan", "Kabinkara", "1/1/1991");
        System.out.println("Ogretmen 3 " + ogretmen3);

    }
}