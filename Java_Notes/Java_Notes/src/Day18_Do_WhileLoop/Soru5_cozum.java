package Day18_Do_WhileLoop;

import java.util.Scanner;

public class Soru5_cozum {
    public static void main(String[] args) {
        Scanner al = new Scanner(System.in);
        String sifre = "";

        int kard = 0;
        int kucd = 0;
        int buyd = 0;
        int ozkd = 0;
        int dog=0;
        do {

            System.out.print("Sifrenizi Girin : ");
            sifre = al.nextLine();
           int karuz = sifre.length();
            for (int i = 0; i < karuz; i++) {
                if (sifre.charAt(i) >= 'a' && sifre.charAt(i) <= 'z') kucd = 1;
                if (sifre.charAt(i) >= 'A' && sifre.charAt(i) <= 'Z') buyd = 1;
                if (sifre.charAt(i) < 65 || sifre.charAt(i) > 122) ozkd = 1;
            } // döngü sonu
            if (karuz >= 8) kard = 1;
            if (kucd == 0) System.out.println(" Kucuk Harf olmalı");
            if (buyd == 0) System.out.println(" Buyuk Harf olmalı");
            if (ozkd == 0) System.out.println(" Ozel Karakter  olmalı");
            if (kard == 0) System.out.println(" Sifre en az 8 karakter olmalidir");
            dog = kard + buyd + ozkd + kucd;
            if (dog == 4) System.out.println(" Sifre Dogru");
        } while (dog != 4);
    }
}
