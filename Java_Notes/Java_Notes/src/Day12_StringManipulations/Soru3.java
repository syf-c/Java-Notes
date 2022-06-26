package Day12_StringManipulations;

import java.util.Scanner;

public class Soru3 {
    /*
    kullanicidan isim isteyin. Eger
    -isim "a" harfi iceriyorsa "Girdiginiz isim a harfi iceriyor"
    -isim "Z" harfi iceriyorsa "Girdiginiz isim z harfi iceriyor"
    -ikiside yoksa "Girdiginiz isim a veya Z harfi icermiyor" yazdirin
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen bir isim giriniz :");
        String isim = scan.nextLine();


        if (isim.contains("a") && isim.contains("Z")) {
            System.out.println("Girdiginiz isim ikisini de iceriyor");
        } else if (isim.contains("a")) {
            System.out.println("Girdiginiz isim a harfi iceriyor");
        } else if (isim.contains("Z")) {
            System.out.println("Girdiginiz isim Z harfi iceriyor");
        } else {
            System.out.println("Girdiginiz isim a veya Z harfi icermiyor");
        }
    }
}
