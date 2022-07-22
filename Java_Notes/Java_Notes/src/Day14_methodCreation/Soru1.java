package Day14_methodCreation;

import java.util.Scanner;

public class Soru1 {
    //  kullanicidan bir sayi alin,
    //  -bu sayinin tekmi ciftmi oldugunu
    //  -sifirdan buyuk mu kucukmu oldugunu
    //  -eger 100 den buyukse rakamlar toplamini
    //  -yuden kucukse sadece birler basamagini yazdiran 3 method olusturun

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen bir sayi giriniz :");
        int sayi = scan.nextInt();

        tekmiCiftmi(sayi);
        sifirdanBuyKuc(sayi);
        System.out.println(yudenBuyKuc(sayi));
        int yuzlerbas= yudenBuyKuc(sayi);
        System.out.println(yuzlerbas);
    }

    private static int yudenBuyKuc(int sayi) {
        int rakamToplami =0;
        int birlerBas =0;

        if(sayi>100){
            while(sayi>0){
                birlerBas = sayi%10;
                rakamToplami += birlerBas;
                sayi /=10;
           }return rakamToplami;

        }else {
            birlerBas = sayi%10;
            return birlerBas;
        }
    }

    private static void sifirdanBuyKuc(int sayi) {
        if(sayi>0){
            System.out.println("Sayi sifirdan buyuktur");
        }else if(sayi==0){
            System.out.println("Sayi sifira esittir");
        }else System.out.println("Sayi sifirdan kucuktur");
    }

    private static void tekmiCiftmi(int sayi) {
        if (sayi%2==0){
            System.out.println("Sayi ciftir");
        }else{
            System.out.println("Sayi tektir");
        }
    }

}
