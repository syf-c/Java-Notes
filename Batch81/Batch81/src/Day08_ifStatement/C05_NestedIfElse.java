package Day08_ifStatement;

import java.util.Scanner;

public class C05_NestedIfElse {
    public static void main(String[] args) {
        /*
    Soru 11) Nested If kullanarak asagidaki soruyu cozen kodu yaziniz.
    Kullanicidan bir sifre girmesini isteyin
    Eger ilk harf buyuk harf ise “A” olup olmadigini kontrol edin.
    Ilk harf A ise  “Gecerli Sifre”     degilse “Gecersiz Sifre” yazdirin.
    Eger ilk harf kucuk harf ise “z” olup olmadigini kontrol edin.
    Ilk harf z ise  “Gecerli Sifre” degilse “Gecersiz Sifre” yazdirin.
     */
        Scanner scan =new Scanner(System.in);
        System.out.println("lutfen bir sifre girin :");
        char sifre =scan.next().toUpperCase().charAt(0);

        if ((sifre >='A' && sifre <='Z') || (sifre >='a' && sifre <='z')){
            if (sifre=='A' || sifre=='Z' || sifre=='a' || sifre=='z'){
                System.out.println("Gecerli sifre");

            }else {
                System.out.println("gecersiz sifre");
            }
        }else {
            System.out.println("gecersiz karakter girdiniz");
        }
    }
}
