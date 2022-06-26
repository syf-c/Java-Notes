package Day10_StringManipulations;

import java.util.Scanner;

public class Soru1 {
    public static void main(String[] args) {
        /*
        Soru1: Kullanicidan bir cumle vebir harf isteyin harfin vumlede var olup olmadigini yazdirin
         */

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen bir cumle giriniz :");
        String cumle = scan.nextLine();

        String kelime = "Java";

        if (cumle.indexOf(kelime) == -1) {
            System.out.println("No");
        } else {
            System.out.println("Yes");
        }
    }
}
