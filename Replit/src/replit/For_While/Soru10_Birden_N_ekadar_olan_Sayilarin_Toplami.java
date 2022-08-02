package replit.For_While;

public class Soru10_Birden_N_ekadar_olan_Sayilarin_Toplami {
    /*

    Write a Program to find the sum of natural numbers from 1 to 100.

    OUTPUT : Sum of Natural Numbers 5050
    */
    public static void main(String[] args) {
        int toplam = 0;
        for (int i = 0; i <=100 ; i++) {
            toplam+=i;
        }
        System.out.println(toplam);
    }
}
