package Day35_inheritanceda_Constructor;

public class E_Muhasebe extends D_Personel{

    E_Muhasebe(){
        System.out.println("E_Muhasebe parametresiz constructor");
    }

    E_Muhasebe(String isim){
        System.out.println("E_Muhasebe parametreli constructor");
    }
}
