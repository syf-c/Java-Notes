package W3resouce;

import java.util.Scanner;

public class Array_Contains {
    /*
    Write a Java program to test if an array contains a specific value.
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("lutfen bir sayi giriniz");
        int sayi = scan.nextInt();
        int[] my_array1 = {
                1789, 2035, 1899, 1456, 2013,
                1458, 2458, 1254, 1472, 2365,
                1456, 2265, 1457, 2456};

        System.out.println(containsMethod(my_array1, sayi));
    }

    private static boolean containsMethod(int[] my_array1, int sayi) {


        for (int i = 0; i < my_array1.length; i++) {
            if (my_array1[i] == sayi) {
                return true;
            }
        }
        return false;

    }
}
