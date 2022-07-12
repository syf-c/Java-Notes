package replit;

import java.util.Scanner;

public class Soru_18_Repeat {
    /*
    Ask user for a string and print a new string made of 3 copies of the last 2 letters

    The strings length will be at least 2.

    Sample:

    INPUT : Mustafa OUTPUT : fafafa
     */
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter an input");
        String input = scan.nextLine();

        String output = input.substring(input.length()-2).repeat(3);
        System.out.println(output);


    }

}
