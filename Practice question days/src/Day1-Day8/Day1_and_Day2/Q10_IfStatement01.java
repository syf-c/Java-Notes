package Day1_and_Day2;

import java.util.Scanner;

public class Q10_IfStatement01 {
    /*
     * KullanicidanY/N ikilisinden birisini girdiginde girdigi degeri
     * ekrana yazdiran java kodunu yaziniz.
     * INPUT : Y ,  N
     * OUTPUT : YES ; NO
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println(" yes icin Y no icin N e tiklayiniz : " );
        char secim = scan.next().charAt(0);

        if (secim==('Y')||secim==('y')){
            System.out.println("Yes");
        }else if (secim==('n')||secim==('N')){
            System.out.println("No");
        }else {
            System.out.println("lutfen Y veya N seciniz");
        }


    }

}
