package Day14_methodCreation;

import java.util.Scanner;

public class Soru2iki {
    public static void main(String[] args) {
        SayilarToplami();
    }

    public static int SayilarToplami() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Kac tane sayi girmek istiyorsunuz");
        int adet1=scan.nextInt();
        int toplam = 0;
        if(adet1==2 || adet1==3 || adet1==4 ){
            for (int i =adet1; i >0 ; i--) {
                System.out.println("sayi giriniz :");
                int sayi=scan.nextInt();
                toplam +=sayi;
            }
            System.out.println("Sayilarin toplami :" +toplam);
        }else if(adet1>=5){
            System.out.println("Ben "+adet1+" sayiyi toplayamam" );
        }
        return toplam;
    }
}
