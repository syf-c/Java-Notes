package Day18_Do_WhileLoop;

import java.util.Scanner;

public class C04_Do_WhileLoop {
    public static void main(String[] args) {


    /*
    kullanicidan tam sayilar alin kullanici cift sayi girdigi muddetce sasayimari yazdirin
    tek sayi girdiginde islemi bitirin
     */

        Scanner scan = new Scanner(System.in);
        int sayi = 0;

        //while ile yapalim

        while (sayi % 2 == 0) {
            System.out.println("Lutfen bir sayi giriniz :");
            sayi = scan.nextInt();
            if (sayi%2 == 0){
                System.out.println("Girilen sayi cift "+ sayi);
            }else{
                System.out.println("Grilen sayi tek , benden bu kadar");
            }

        }

        // do while ile yapalim
        // do while loopda onceden olusturulan variable'a
        // hangi deger atandiginin hic bir onemi yok kodumuz her durumda caklisir

        /*
        do while'in dezavantaji ilk calistirma kontrol yapilmadan oldugu icin loopun bodysinde yanlis
        bir islem yapilmamasina dikkat etmek gerekir
         */

        do {
            if (sayi%2 == 0){
                System.out.println("Girilen sayi cift "+ sayi);
            }else{
                System.out.println("Grilen sayi tek , benden bu kadar");
            }

        }while(sayi%2 == 0);
    }
}