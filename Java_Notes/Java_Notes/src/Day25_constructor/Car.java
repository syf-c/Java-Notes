package Day25_constructor;

public class Car {
    /*
    Bu class vizom kaliphanemiz
    bir araba olusturmak icin ihtiyacimiz olan
    variable ve methodlari bu class'da belirleriz

    sonra farkli class 'larda araba olusturmamiz gerekirse
    bu class' dan bir obje olusturup
    burada belirlenen variable ve method'lara gore araba uretir
     */
    String marka ="Marka belirtilmedi";
    String model= "Model belirtilmedi";
    int yil;
    int fiyat;

    public void benzinliArac(){
        System.out.println("Bu arac benzinli motor sahiptir");
    }
    public void maxHiz(int hiz){
        System.out.println("Bu araba max "+ hiz +" km hiz yapar");
    }
}
