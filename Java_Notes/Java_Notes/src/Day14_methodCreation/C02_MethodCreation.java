package Day14_methodCreation;

import Day13_MethodCreation.C04_MethodCreation;

public class C02_MethodCreation {
    public static void main(String[] args) {
    //verilen 3 basamakli bir sayinin rakamlari toplamini yazdiran bir method olusturalim
        int input = 423;
        rakamlarToplami(input);
        C04_MethodCreation.topla(4,5);
    }
    public static void rakamlarToplami(int input){
        int birlerBasamagi =0;
        int rakamlarToplami = 0;
        int temp = input;

        birlerBasamagi = input%10;
        rakamlarToplami += birlerBasamagi;
        input /=10;

        birlerBasamagi = input%10;
        rakamlarToplami += birlerBasamagi;
        input /=10;

        birlerBasamagi = input%10;
        rakamlarToplami += birlerBasamagi;
        input /=10;

        System.out.println("girdiginiz " + temp + " sayisinin rakamlar toplami : "+rakamlarToplami);

    }

}
