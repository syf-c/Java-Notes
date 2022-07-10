import java.util.Scanner;

public class QA10_ArananKelime {
    /*
    Kullanıcıdan alınan String kümesi içerisinde aranan  String i bulan Java Kodunu yazınız.

    Test Data:
    Java is easy

    Aranan String: is

    Bektenen Çıktı:
    True

    Aranan String: and

    Beklenen Çıktı:False
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen bir cumle giriniz :");
        String cumle = scan.nextLine();
        System.out.println("Lutfen aramak istediginiz kelimeyi giriniz");
        String aranan= scan.nextLine();
        if(cumle.contains(aranan.substring(0))){
            System.out.println("True");
        }else {
            System.out.println("False");
        }
    }
}
