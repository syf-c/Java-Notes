package Day14_methodCreation;

public class C02_MethodCreation {
    public static void main(String[] args) {
    //verilen 3 basamakli bir sayinin rakamlari toplamini yazdiran bir method olusturalim
        int input = 423;
        rakamlarToplami(input);
    }
    public static void rakamlarToplami(int input){
        int birlerBasamagi =0;
        int rakamlarToplami = 0;

        birlerBasamagi = input%10;
        rakamlarToplami += birlerBasamagi;
        input /=10;

        birlerBasamagi = input%10;
        rakamlarToplami += birlerBasamagi;
        input /=10;

        birlerBasamagi = input%10;
        rakamlarToplami += birlerBasamagi;
        input /=10;

        System.out.println("girdiginiz input sayisinin rakamlar toplami : "+rakamlarToplami);

    }

}
