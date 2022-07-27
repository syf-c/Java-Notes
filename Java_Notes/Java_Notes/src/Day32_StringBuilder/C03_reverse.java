package Day32_StringBuilder;

import java.util.Scanner;

public class C03_reverse {
    public static void main(String[] args) {

        //verilen bir inputu tersine cevirip bize donduren bir metod olusturunuz


        String input = "Hey gidi For loop gunleri";

        String tersInput = tersineCevir(input);
        System.out.println("tersInput = " + tersInput);


    }

    public static String tersineCevir(String input) {
        StringBuilder sb = new StringBuilder(input);
       ;
        return sb.reverse().toString();
    }
}
