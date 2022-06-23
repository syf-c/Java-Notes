package Day07_ifStatement;

public class C03_Ifstatement {
    public static void main(String[] args) {
        /*
        Bir if statement'da { kullanilmazsa
        Java ilk satiri sart ile baglar, sonraki satirlar bagimsiz olur
         */

        int sayi = -23;

        if (sayi > 0)
            System.out.println("sayi pozitif"); //degere basli
            System.out.println("pozitif kalacaktir");//her zaman calisir

        if (sayi % 2 == 0)
            System.out.println("sayi cift");//degere basli
            System.out.println("cift kalacaktir");//her zaman calisir

        if (sayi % 5 == 0)
            System.out.println("Sayi 5'in tam kati");
    }
}
