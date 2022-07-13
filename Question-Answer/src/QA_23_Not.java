import java.util.Scanner;

public class QA_23_Not {
    /*
    Kullanıcıdan notunu alın ve aşağıdaki kurallara göre ekrana A, B, C veya D yazdırın.
        // 1. 0()dahil ile 50 arasi - D   2. 50(dahil) ile 60 arası - C   3. 60(dahil) ile 80 arası - B  4. 80(dahil) ustu- A
        // Yanlis not girilirse ekrana "Gecerli not giriniz" yazdirin
        // switch() kullanarak yapiniz.

        // switch() de long kullanilmaz, float kullanilmaz, double kullanilmaz, boolean kullanilmaz.
        // switch() de int, byte, short, char, String kullanilir.
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Bir not giriniz : ");

/*
        " 1 = 0 ile 50 arasi," +
        " 2 = 50 ile 60 arasi," +
        " 3 = 60 ile 80 arasi," +
        " 4 = 80 ve ustu ");

 */
        int not = scan.nextInt();
        not=not<50 ? 1: not<60 ? 2: not<80 ?3:not<100 ? 4:5;


        switch (not) {
            case 1 -> System.out.println("notunuz D");
            case 2 -> System.out.println("notunuz C");
            case 3 -> System.out.println("notunuz B");
            case 4 -> System.out.println("notunuz A");
            default -> System.out.println("Gecerli not giriniz");
        }


    }


}


/*
        Scanner scan = new Scanner(System.in);
        System.out.println("not araligini seciniz : " +
                " 1 = 0 ile 50 arasi," +
                " 2 = 50 ile 60 arasi," +
                " 3 = 60 ile 80 arasi," +
                " 4 = 80 ve ustu ");
        int not = scan.nextInt();



        switch (not) {
            case 1:
                System.out.println("notunuz D");
                break;
            case 2:
                System.out.println("notunuz C");
                break;
            case 3:
                System.out.println("notunuz B");
                break;
            case 4:
                System.out.println("notunuz A");
                break;
            default:
                System.out.println("Gecerli not araligi seciniz giriniz");


        }

 */