package Day12_StringManipulations;

import java.util.Scanner;

public class Soru4 {
    public static void main(String[] args) {

        //kullanicidan isim ve soyisim isteyin hangisinin daha uzun olduğunu yazdirin

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen Isminizi giriniz :");
        String isim = scan.nextLine();
        System.out.println("Lutfen Soyisminizi giriniz :");
        String soyIsim = scan.nextLine();

        if(isim.length()>soyIsim.length()){
            System.out.println("isminiz daha uzundur");
        }else if(isim.length()<soyIsim.length()){
            System.out.println("Soyisminiz daha uzundur");
        }else {
            System.out.println("isminiz ve soyisminiz esittir");
        }

    }
}
