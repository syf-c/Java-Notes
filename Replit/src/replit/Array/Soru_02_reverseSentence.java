package replit.Array;

import java.util.Arrays;

public class Soru_02_reverseSentence {
    /*
    Write a Java program that reverse a sentence by using Array (with all spaces and special characters).

    Input : Coding is greate.
    Output : .etaerg si gnidoC
    */
    public static void main(String[] args) {
        String input = "Coding is greate.";
        String sonuc = "";
        for (int i = input.length() - 1; i >= 0; i--) {
            sonuc += input.charAt(i);
        }
        System.out.println(sonuc);

        String[] arr = sonuc.split(" ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

        System.out.println();
        System.out.println(Arrays.toString(arr));


    }
}


