package Recap1;

import java.util.Scanner;

public class Q04_NotHesaplama {
    /*
     * Kullanicidan alacaginiz vize1 vize2 ve final notlarini
     * vize ortalamasinin %30'u final notunun %70 alarak gecme notunu hesaplayiniz
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("vize1 notunuzu giriniz :");
        int vize1 = scan.nextInt();
        System.out.println("vize2 notunuzu giriniz :");
        int vize2 = scan.nextInt();
        System.out.println("final notunuzu giriniz :");
        int finalNote = scan.nextInt();
        
       double gecmeNotu = ((vize1+vize2)/2)*0.3 + finalNote*0.7;

        System.out.println("gecmeNotu = " + gecmeNotu);
        
        
        
        
    }
}
