package Day07_ifStatement;

import java.util.Scanner;

public class C05_IfElseStatements {
    public static void main(String[] args) {
         /*
        Kullanicidan bir karakter girmesini isteyin
        ve girilen karakterin harf olup olmadigini yazdirin

         */

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen bir karakter giriniz");
        char harf = scan.next().charAt(0);

        if ((harf>='A' && harf<='Z')||(harf>='a' && harf<='z')){
            System.out.println("Girdiginiz karakter bir harftir");
        }else {
            System.out.println("Girdiginiz karakter bir harf degildir");
        }

    }
}
