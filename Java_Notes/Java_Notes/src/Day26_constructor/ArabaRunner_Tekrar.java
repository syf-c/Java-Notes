package Day26_constructor;

public class ArabaRunner_Tekrar {
    public static void main(String[] args) {


        Araba_Tekrar araba3= new Araba_Tekrar("Bmw","5.20",2011,15000);

        System.out.println("Araba3 bilgileri"
                +"\nMarka :"+ araba3.marka
                +"\nModel :"+araba3.model
                +"\nYil   :"+araba3.yil
                +"\nFiyat :"+araba3.fiyat);


        Araba_Tekrar araba4= new Araba_Tekrar();
        System.out.println("Araba4 bilgileri"
                +"\nMarka :"+araba4.marka
                +"\nModel :"+araba4.model
                +"\nYil   :"+araba4.yil
                +"\nFiyat :"+araba4.fiyat);


        Araba_Tekrar araba5= new Araba_Tekrar("Audi","A5",2022);
        System.out.println("Araba5 bilgileri"
                +"\nMarka :"+araba5.marka
                +"\nModel :"+araba5.model
                +"\nYil   :"+araba5.yil
                +"\nFiyat :"+araba5.fiyat);

    }
}
