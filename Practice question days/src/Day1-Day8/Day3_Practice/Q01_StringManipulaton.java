package Day3_Practice;

import java.util.Scanner;

public class Q01_StringManipulaton {
    /*
     * Kullanicidan 4 kelime isteyin ve cumle olarak yazdirip sonuna . koyun
     *
     * Ornek : Inputs : cesaret, insana, sinirlarini, ogretir
     *         Output : Cesaret insana sinirlarini ogretir.
     *
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen birinci kelimeyi giriniz :");
        String str1 = scan.next();
        System.out.println("Lutfen ikinci kelimeyi giriniz :");
        String str2 = scan.next();
        System.out.println("Lutfen ucuncu kelimeyi giriniz :");
        String str3 = scan.next();
        System.out.println("Lutfen dorduncu kelimeyi giriniz :");
        String str4 = scan.next();

        System.out.println(str1.substring(0,1).toUpperCase()+str1.substring(1)+" "+str2+" "+str3+" "+str4+".");

    }

}
