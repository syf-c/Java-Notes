package Day12_StringManipulations;

import java.util.Scanner;

public class Soru5 {
    public static void main(String[] args) {
        /*
        kullanicidan 4 harfli bir kelime isteyin ve girilen kelimeyi tersten yazdirin
         */

        Scanner scan = new Scanner(System.in);
        System.out.println("4 hafli bir kelime giriniz");
        String kelime = scan.next();

        if (kelime.length() ==4 ) {
            System.out.println(kelime.substring(3)+kelime.substring(2,3)+kelime.substring(1,2)+kelime.substring(0,1));

        }else{
            System.out.println("lutfen 4 harfli bir kelime giriniz");
        }

    }
}
