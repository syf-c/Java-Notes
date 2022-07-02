package Day15_Overloading_Forloop;

import java.util.Scanner;

public class C06_stringiTersCevirme {
    public static void main(String[] args) {
        //input olarak verilen stringi ters cevirip yazdiran bir method olusturun

       String input = "Java gun gectikce guzellesiyor";

       tersten_Yazdir(input);
    }

    public static void tersten_Yazdir(String input) {
        String tersInput = input.substring(input.length()-1);
        for (int i =input.length()-2; i>=0; i--) {
            tersInput +=input.substring(i,i+1);
            
        }
        System.out.println(tersInput);
    }
}
