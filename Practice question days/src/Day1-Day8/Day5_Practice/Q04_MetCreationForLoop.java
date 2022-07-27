package Day5_Practice;

import java.util.Scanner;

public class Q04_MetCreationForLoop {


		/* Interview Question
		 Write a Java program to reverse a string. Use for loop and create a method called
		  reverseString */

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Bir string giriniz :");
        String str = scan.nextLine();
        reverseString(str);
        System.out.println(reverseString(str));
    }

    public static String reverseString(String str) {
        String reversed="";
        for (int i = str.length()-1; i >=0 ; i--) {
            reversed+=str.charAt(i);
            // reversed+=str.substring(i,i+1);
        }

        return reversed;
    }

}
