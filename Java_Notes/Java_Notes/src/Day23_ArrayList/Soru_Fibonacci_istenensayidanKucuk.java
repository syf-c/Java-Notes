package Day23_ArrayList;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Soru_Fibonacci_istenensayidanKucuk {
    /*
    all Fibonacci numbers less than a given numberini bir liste olarak olusturup yazdirin
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("bir sayi giriniz");
        int sayi = scan.nextInt();
        List<Integer> fibonacci = new ArrayList<Integer>();


            int a = 0, b = 1;

            for (int i = 2; i < sayi; i--) {
                int c = a + b;
                a = b;
                b = c;
                //System.out.println(c);
                if(c<sayi){
                    fibonacci.add(c);
                }else {
                    break;
                }


            }
            fibonacci.add(0,1);


        System.out.println(fibonacci);

    }
}
