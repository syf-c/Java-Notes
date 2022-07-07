package Day18_Do_WhileLoop;

public class Soru1_TumTamSayilar {
    /*
    9 dan 190 a kadar 7nin kati olan tum tamsayilari yazdiriniz
     */

    public static void main(String[] args) {
        int bas =9;
        int son=190;
        System.out.print(bas+" ile "+son+" Arasindaki 7'nin kati olan tamsayilar : ");
        do {
            if(bas%7==0){
                System.out.print(bas + " ");
            }
            bas++;
        }while(bas<=son);

    }
}
