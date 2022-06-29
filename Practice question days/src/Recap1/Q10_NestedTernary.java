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
         Scanner scan = new Scanner(System.in);
          System.out.println("lutfen notunuzu giriniz :");
          String
          Sonuc= Sonuc.equals("A")? "Gayet basarili":(Sonuc.equals("B")? "Basarili":
                 Sonuc.equals("C")?"Ha gayret":"Cok calismalisin");
          System.out.println("finalSonuc = " + Sonuc);
      }
    
}
