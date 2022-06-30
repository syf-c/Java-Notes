package Recap1;


import java.util.Scanner;

public class Q10_NestedTernary {
    /*
  Final notu tanimlayin, Nested Ternary ile cozunuz
  'A'  ->  "Gayet Basarili"
  'B'  ->  "Basarili"
  'C'  ->   "Ha gayret"
  bu notlar disindakilere de Digerleri.. yazdiriniz
   */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen notunuzu giriniz");
        String sonuc =scanner.next().toUpperCase().substring(0);
        sonuc = sonuc.equals("A") ? "Gayet Basarili"
                : (sonuc == "B" ? "Basarili"
                :(sonuc == "C" ? "Ha gayret"
                :(sonuc=="D"? "Az daha dikkat"
                :(sonuc=="E" ? "Dikkatli olmalisin":"lutfen gecerli bir note giriniz"))));

        System.out.println("finalNotu = " + sonuc);

    }

}
