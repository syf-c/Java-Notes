package Day14_methodCreation;

import java.util.Scanner;

public class Soru3 {
    /*
    Email kontrolu yapan bir program yazin.Kullanicinin girdigi sifre
- @ isareti icermiyorsa gecersiz email yazdirin
- @gmail.com icermiyorsa “lutfen gmail adresinizi girin” yazdirin
- @gmail.com ile bitmiyorsa “Yazimda bir sorun var, maili kontrol ediniz”
     */
    public static void main(String[] args) {
        emailKontrol("musa@gmail.com");
    }

    private static void emailKontrol(String email) {
        if (!email.contains("@")) {
            System.out.println("gecersiz email adresi");
        } else if (!email.contains("@gmail.com")) {
            System.out.println("lutfen gmail adresinizi girin");
        } else if (!email.endsWith("@gmail.com")) {
            System.out.println("Yazimda bir sorun var, maili kontrol ediniz");

        }else{
            System.out.println("isleminiz basari ile kayit edildi");
        }
    }
}
