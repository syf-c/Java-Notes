public class QA19_ArtikYil {
    /*
    Kullanıcı tarafından girilen bir yılın  artık yıl olup olmadığını kontrol etmek için bir Java Methodu yazınız.
​
    Test Data:
    2017
​
    Beklenen Çıktı:
    false
     */
    public static void main(String[] args) {
        int year = 2017;

        if ((year % 100 == 0 && year % 400 == 0) || (year % 100 != 0 && year % 4 == 0)) {
            System.out.println("Artik Yil");
        } else {
            System.out.println("Artik Yil Degil..!");
        }
    }
}
