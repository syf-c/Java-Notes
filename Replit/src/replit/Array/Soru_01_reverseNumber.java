package replit.Array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Soru_01_reverseNumber {
    /*
    Write a return method to reverse number.

    Input : 12345
    Output : 54321
     */
    public static void main(String[] args) {
        int input = 12345;
        reverseNumber(input);

    }

    private static void reverseNumber(int input) {
        int birlerBas = 0;
        String container = "";
        while (input != 0) {
            birlerBas = input % 10;

            container = container+birlerBas;

            input /= 10;
            System.out.print(container);
        }
    }
}

