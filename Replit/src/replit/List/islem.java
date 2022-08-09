package replit.List;

import java.util.Scanner;

public class islem {
    /* İki sayiyi islem isareti ile giriniz
   Input : 12+36
   Output :48 */
    public static void main(String[] args) {

        double sayi3 = 250/50;



        Scanner scan = new Scanner(System.in);
        System.out.print("birinci sayiyi giriniz :");
        int sayi1 =scan.nextInt();
        System.out.print("yapmak istediginiz islemi seciniz");
        String islem = scan.next();
        System.out.print("ikinci sayiyi giriniz :");
        int sayi2 =scan.nextInt();
        switch(islem){
            case "+":
                int sonuc = sayi1+sayi2;
                System.out.println(sayi1+"+"+sayi2+"="+sonuc);
                break;
            case "*":
                double sonuc1 = sayi1*sayi2;
                System.out.println(sayi1+"+"+sayi2+"="+sonuc1);
                break;
            case "/":
                double sonuc2 = sayi1+sayi2;
                System.out.println(sayi1+"+"+sayi2+"="+sonuc2);
                break;
        }
    }
}
