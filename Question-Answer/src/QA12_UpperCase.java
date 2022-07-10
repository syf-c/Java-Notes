import java.util.Scanner;

public class QA12_UpperCase {
    /*
    Kullanıcının girdiği String değerlerini büyük harfe çeviren Java kodunu yazınız.

    Test Data:
    Java is fun

    Beklenen Sonuç:
    JAVA IS FUN

     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen bir kelime giriniz :");
        String kelime = scan.nextLine();

        System.out.println(kelime.toUpperCase());

    }
}
