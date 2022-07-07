package Day18_WhileLoop;

public class Soru7_RakamlarToplami {
    public static void main(String[] args) {

        int input = 159254;
        int rakamlarToplami = 0;
        int birlerBasamagi = 0;
        int sayi = input;

        while (sayi != 0) {
            birlerBasamagi = sayi % 10;
            rakamlarToplami += birlerBasamagi;
            sayi/=10;

        }
        System.out.println(input+" Sayisinin rakamlar Toplami = " + rakamlarToplami);
    }
}
