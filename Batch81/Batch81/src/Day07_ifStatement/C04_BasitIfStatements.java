package Day07_ifStatement;

import java.util.Scanner;

public class C04_BasitIfStatements {

    public static void main(String[] args) {
        /*
        Soru 3) Kullanicidan gun ismini alin ve haftaici veya hafta sonu oldugunu yazdirin
        Ornek:      gun=Pazar output = “Hafta sonu”
                    gun=Sali  output = “Hafta ici”
         *** String icin equals method’unu kullanin
         */

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen bir gun ismi giriniz :");
        String gun = scan.next().toLowerCase();

        if (gun.equals("pazar") || gun.equals("cumartesi")) {
            System.out.println("Hafta Sonu");
        }
        if (gun.equals("pazartesi") || gun.equals("sali") || gun.equals("carsamba")
                || gun.equals("persembe") || gun.equals("cuma")){
            System.out.println("Hafta ici");
        }
        if (!(gun.equals("pazartesi") || gun.equals("sali") || gun.equals("carsamba")
                || gun.equals("persembe") || gun.equals("cuma") ||gun.equals("pazar") || gun.equals("cumartesi"))){
            System.out.println("Boyle bir gun yok");
        }


    }
}