package Day13_interviewQuestion;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Q03_fibonacci {

    /*
 Kullanıcıdan alınan bir tamsayıya kadar FIBONACCI dizisi oluşturun.
 0-1-1-2-3-5-8-13-21-34....
    */

    public static void main(String[] args) {
       List<Integer> fibonacciList = new ArrayList<>();

        Scanner scanner = new Scanner(System.in);
        System.out.println("Bir sayi giriniz");
        int sayi =scanner.nextInt();

        fibonacciList.add(0);
        fibonacciList.add(1);
        int i =1;
        if (sayi<=1){
            System.out.println("daha buyuk sayi giriniz");
        }else {
            while (fibonacciList.get(i)<sayi){
                fibonacciList.add(fibonacciList.get(i)+fibonacciList.get(i-1));
                i++;
            }
           // System.out.println("fibonacciList = " + fibonacciList); //sayidan buyuk fibonacci sayisini da aliyor
        }
        int sonIndextekiEleman = fibonacciList.size()-1;

        if (fibonacciList.get(sonIndextekiEleman)>sayi){
            fibonacciList.remove(sonIndextekiEleman);
            System.out.println("girdiginiz sayi fibonacci dizisinde bulunmamaktadir \n"
                    + "sizin girdiginiz sayiya kadar olan fibonacci sayilari "+fibonacciList);
        }else{
            System.out.println("Sizin girdiginiz sayi fibonacci listesinde var " + fibonacciList);
        }


    }
}
