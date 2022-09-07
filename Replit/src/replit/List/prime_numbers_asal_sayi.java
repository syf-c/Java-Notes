package replit.List;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class prime_numbers_asal_sayi {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("bir sayi giriniz");
        int sayi = scan.nextInt();

        List<Integer> numbers = new ArrayList<Integer>();

        while (numbers.size() != 10) {
            for (int i = 1; i > 0; i++) {
                if (i % 2 != 0 && i % 3 != 0) {


                }
            }
            System.out.println(numbers);


        }
    }}
