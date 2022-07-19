package Day23_ArrayList;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Soru_Fibonacci_adetSayi_Bulma {
    /*

        1'den baslayarak istenen kadar Fibonacci sayisini bir liste olarak olusturup yazdirin

     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("bir sayi giriniz");
        int sayi = scan.nextInt();
        List<Integer> fibonacci = new ArrayList<Integer>();

        int a = 0, b = 1;

        for (int i = sayi; i >= 1; i--) {
            int c = a + b;
            a = b;
            b = c;

            fibonacci.add(c);

        }
        fibonacci.add(0, 0);
        fibonacci.add(1, 1);

        System.out.println(fibonacci);

    }

}


