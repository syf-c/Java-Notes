import java.util.Scanner;

public class QA14_Stringlerin_Karsilastirma {
    /*
    Girilen iki String veriyi karşılaştıran Java kodu yazınız.

    Test data:
    1. String : techproed.com
    2. String : Techproed.com

    Beklenen Çıktı:
    False

    Test data:
    1. String : techproed.com
    2. String : techproed.com

    Beklenen Çıktı:
    true
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Birinci kelimeyi giriniz :");
        String str1 = scan.nextLine();
        System.out.println("Ikinci kelimeyi giriniz :");
        String str2 = scan.nextLine();

        System.out.println(str1.equals(str2)?"True":"False");
    }
}
