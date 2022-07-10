import java.util.Scanner;

public class QA16_ToUpperCase {
    /*
    Girilen stringdeki tüm karakterleri büyük harfe dönüştürmek için bir Java programı yazın.
​
    Test Data:
    java is fun
​
    Beklenen Çıktı:
    JAVA IS FUN
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen istediginiz cumleyi giriniz :");
        String cumle=scan.nextLine();

        System.out.println(cumle.toUpperCase());
    }
}
