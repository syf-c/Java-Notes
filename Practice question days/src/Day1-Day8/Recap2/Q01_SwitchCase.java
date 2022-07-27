package Recap2;

import java.util.Scanner;

public class Q01_SwitchCase {
      /*
    gunleri gösterebilen bir program yazın
    gun Pazartesi veya Sali ise:
    Java dersi gunleri
    gun Persembe veya Cuma ise:
    Selenyum dersi gunleri
    gun carsamba veya cumartesi ise:
    SQL dersi gunleri
    aksi halde: izin gunu
    (if deyimini KULLANMAYIN)
*/
      public static void main(String[] args) {
          Scanner scan =new Scanner(System.in);
          System.out.println("lutfen gunu giriniz");
          String gun = scan.next().toLowerCase();
          
          switch(gun){
              case "pazartesi":
              case "sali":
                  System.out.println("Java dersi gunu");
                  break;
              case "carsamba":
              case "cumartesi":
                  System.out.println("SQL dersi gunu");
                  break;
              case "persembe":
              case "cuma":
                  System.out.println("Selenium ders gunu");
                  break;
              default:
                  System.out.println("izin gunundesiniz");
                  break;
              
          }
      }
}
