package Day35_inheritanceda_Constructor;

public class F_Memur extends E_Muhasebe {
    /*
    extends keyword kullanilan classlarda ister default cons. bulunsun
    istersekte biz yeni constructorlar olusturalim
    Java constructorun ilk satirina super(); constructor call yazar

    super constructor call default constructora benzer gorunmesede orada vardir ve calisir
    ancak biz ilk satira farkli bir constructor yazarsak java super(); i siler
     */
    F_Memur(){
        System.out.println("F_Memur parametresiz constructor");
    }

    F_Memur(String isim){
        System.out.println("F_Memur parametreli constructor");
    }

    public static void main(String[] args) {
        F_Memur mmr1= new F_Memur();
    }
}
