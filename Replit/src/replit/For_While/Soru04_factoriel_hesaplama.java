package replit.For_While;

public class Soru04_factoriel_hesaplama {
    public static void main(String[] args) {
        /*
        Girdi olarak bir tamsayı kabul eden ve faktöriyel hesaplayan ve çıktı gibi yazdıran bir dönüş yöntemi yazın.

        Giriş : 6

        Çıktı: 6!=6 5 4 3 2*1=720
         */
        int sayi= 6;
        int factoriel = 1;

        for (int i = 1; i <=sayi ; i++) {
            factoriel *=i;

        }System.out.print(sayi+"!"+"=");
        for (int i = 0; i <=sayi ; i++) {
            if (i != 0){
                if (sayi==1){
                    System.out.print(sayi);
                }else {
                    System.out.print(sayi + "*");
                    sayi--;
                    i--;
                }
            }

        }System.out.println("="+factoriel);

    }
}
