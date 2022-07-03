package Day16_Forloop;

import java.util.Scanner;

public class Soru9 {
        // Kullanicidan bir string isteyin, Kullanicinin girdigi Stringin
        // palinrome olup olmadigini kontrol eden bir program yaziniz
        //Palindrom: tersten okunuşu da aynı olan cümle, sözcük ve sayılara denilmektedir.

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen bir kelime giriniz :");
        String str = scan.nextLine();

        String tersten ="";
        for (int i = str.length()-1;i>=0;i--){
            tersten +=str.substring(i,i+1);
        }

        if(tersten.equals(str)){
            System.out.println("bu kelime Palindrom dur");
        }else {
            System.out.println("degil");
        }

    }
}
