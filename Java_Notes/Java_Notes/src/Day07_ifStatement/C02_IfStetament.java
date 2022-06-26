package Day07_ifStatement;

public class C02_IfStetament {
    public static void main(String[] args) {
        int sayi=10;
        if (sayi>0){
            System.out.println("sayi pozitif");
        }
        if (sayi%2==0){
            System.out.println("sayi cift");
        }
        if (sayi%5==0){
            System.out.println("sayi 5'e tam bolunur");
        }
        /*
        basit if cumleleri kodun diger parcalaarindan bagimsizdir
        sadece bir sart kontrol eder, sart saglanirsa , if body calisir yoksa calismaz
        birden fazla basit if cumlesi varsa girilen sarta bagli olarak,
        tumunde if body si calisabilir,kismen if body'leri calisabilir
         */
    }

}
