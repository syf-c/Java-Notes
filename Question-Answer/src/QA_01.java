public class QA_01 {
    /*
    1---Sayının Rakamlar toplaminı bulan Java kodu yazınız.

    Test Data
    34
    Beklenen Çıktı
    7
     */
    public static void main(String[] args) {
        int sayi = 2580;
        int rakamlarToplami=0;
        int birlerBasamagi=0;

        while(sayi>0){
            birlerBasamagi=sayi%10;
            rakamlarToplami +=birlerBasamagi;
            sayi /=10;

        }
        System.out.println("Rakamlar Toplami : " + rakamlarToplami);
    }
}
