package Day15_Overloading_Forloop;

import java.util.Scanner;

public class C08_Factoriel {
    public static void main(String[] args) {
        /*
        input olarak verilen bir tam sayi icin factoriel hesaplayip yazdiran bir metod olusturun
        verilen sayi negatif veya 20'den buyuk olursa
        "girilen sayinin factoriyeli hesaplanamaz"
        uyarisi yazdirin
         */
        Scanner scan = new Scanner(System.in);
        System.out.println("lutfen 1 ile 20 arasinda bir sayi giriniz");
        int input = scan.nextInt();

       factoriyeHesapla(input);
    }

    public static void factoriyeHesapla(int input) {
        int factoriyel = 1;
        if (input < 0 || input > 20) {
            System.out.println("girilen sayinin factoriyeli hesaplanamaz");
        } else if (input == 0) {
            System.out.println("0!=1'dir");

        } else {
            for (int i = 1; i <= input; i++) {
                factoriyel *= i;
            }System.out.println(input + " sayisinin factorieli : " + factoriyel);

        }
     //   return factoriyel;

    }
}
