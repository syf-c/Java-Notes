package replit.For_While;

public class Soru09_SayiyiTersCevirme {
    public static void main(String[] args) {
        /*
        Write a java program to reverse the number which user entered.

        Input :1238
        Output :Reverse Of The Number: 8321
         */

        int sayi = 1238;
        int birlerBas=0;
        String rakam="";
        while (sayi!=0){
            birlerBas=sayi%10;
            rakam+=birlerBas;
            sayi/=10;
        }
        System.out.println("Reverse Of The Number:"+rakam);

    }
}
