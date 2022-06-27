package Day1;

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
        String secim = scan.next().toLowerCase();

        if (secim.equals("y")){
            System.out.println("Yes");
        }else if (secim.equals("n")){
            System.out.println("No");
        }else {
            System.out.println("lutfen Y veya N seciniz");
        }


    }

}
