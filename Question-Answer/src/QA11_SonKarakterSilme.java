import java.util.Scanner;

public class QA11_SonKarakterSilme {
    /*
    Kullanıcıdan alınan Stringin son karakteirini silep ekrana yazan Java kodunu yazınız.

    Test Data:
    good

    Beklenen Çıktı:
    goo

     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen bir kelime giriniz :");
        String kelime =scan.nextLine();

        System.out.println(kelime.substring(0,kelime.length()-1));
    }

}
