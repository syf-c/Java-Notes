public class QA15_bul {
    /*
    Grilen String değer içinde istenen sıradaki karakteri bulan Java kodunu yazınız.
​
    Test Data:
    Java is fun
​
​
    Beklenen Çıktı
    0. pozisyondaki karakter : J
​
    5. pozisyondaki karakter : i
     */
    public static void main(String[] args) {
        String str = "Musa Musasa saas";
        int istenen = 15;
        char sonuc = ' ';


        if (istenen > str.length() - 1) {
            System.out.println("istenen sayiyaya ait index bulunamiyor");
        }
        if (istenen < str.length()) {
            sonuc = str.charAt(istenen);
            if (sonuc == (' ')) {
                System.out.println(istenen + " pozisyondaki karakter \' Space \'");
            } else {
                System.out.print(istenen + " pozisyondaki karakter :" +"\'"+ sonuc+"\'");
            }

        }

    }
}
