import java.util.Scanner;

public class QA06_SesliHarf_SessizHarf {
    /*
    6----     Kullanıcıdan bir harf girmesini isteyiniz. Girilen harf sesli ise Sesli harf olduğunu,
           değilse sessiz harf olduğunu ekrana yazdırsın. Girdiği değer harf değilse yada
            1 karakterden fazla ise hata mesajı göstersin. (Test girilen harfi büyük yada küçüklüğüne duyarlıdır.)

    Sesli harfler: a,e,i,o,u

    Test Data:
    a

    Beklenen Çıktı:
    a harfi sesli harfdir.

    Test Data:
    d

    Beklenen Çıktı:
    d harfi sesiz harftir.

    Test Data:
    we  yada %

    Beklenen Çıktı:
    Yanlis karakter girdiniz!
     */
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("harf giriniz");
        String harf= scan.next();
        if(harf.length()==1) {
            if (harf.equals("a") || harf.equals("e") || harf.equals("i") || harf.equals("o") || harf.equals("u")) {
                System.out.println(harf + " sesli harf");
            } else {
                System.out.println(harf + " sessiz harf");
            }
        }else {
                System.out.println("yanlis karakter girdiniz");
            }






    }
}
