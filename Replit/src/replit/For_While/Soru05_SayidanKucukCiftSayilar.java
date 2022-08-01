package replit.For_While;

public class Soru05_SayidanKucukCiftSayilar {
    public static void main(String[] args) {
        //Print even numbers from 20 to 0 but do not use decrement (i--).
        int sayi=20;
        System.out.print("Even Numbers from 20 to 0 are: ");
        for (int i = sayi; i >=0 ; i-=2) {
            System.out.print(i+" ");
        }
    }
}
