package Day09_ternary;

import java.util.Scanner;

public class C06_SwitchCase {
    public static void main(String[] args) {
        /*
        kullanicidan gun ismini alin ve hafta ici veya hafta sonu oldugunu yazdirin
         */
        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen kacinci gun oldugunu giriniz");
        String gun = scan.nextLine().toLowerCase();

        switch (gun){
            case "pazartesi" :
            case "sali" :
            case "carsamba":
            case "persembe":
            case "cuma" :
                System.out.println("Hafta ici");
                break;
            case "cumartesi":
            case "pazar" :
                System.out.println("Hafta Sonu");
                break;
            default :
                System.out.println("gecerli bir gun giriniz ...");

        }
    }
}
