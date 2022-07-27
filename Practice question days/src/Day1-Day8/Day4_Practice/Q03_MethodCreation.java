package Day4_Practice;

import java.util.Scanner;

public class Q03_MethodCreation {
    /*
Kullanicidan alinan bir tamsayi kadar(47 den kucuk) FIBONACCI dizisi olusturun.
  0-1-1-2-3-5-8-13-21-34....
*/
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("47 den kucun bir sayi giriniz");
        int sayi = scan.nextInt();

        if (sayi < 47) {
            int a = 0, b = 1;
            System.out.print(a + " " + b + " ");
            for (int i = 2; i < sayi; i++) {
                int c = a + b;
                a = b;
                b = c;
                System.out.print(c + " ");
            }
        }else{
            System.out.println("47 den kucuk bir sayi girmelisiniz.");
        }
    }
}
