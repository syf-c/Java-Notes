package Day26_constructor;

public class Araba_Tekrar {

    public String marka="Herhangi bir Marka atanmadi";
    public String model="Herhangi bir Model atanmadi";
    public int yil;
    public int fiyat;

    public Araba_Tekrar(String markaR, String modelR, int yilR, int fiyatR) {
        marka=markaR;
        model=modelR;
        yil=yilR;
        fiyat=fiyatR;
    }

    public Araba_Tekrar() {
    }

    public Araba_Tekrar(String marka, String model, int yil) {
        this.marka = marka;
        this.model = model;
        this.yil = yil;
    }

    @Override
    public String toString() {
        return "Araba_Tekrar{" +
                "marka='" + marka + '\'' +
                ", model='" + model + '\'' +
                ", yil=" + yil +
                ", fiyat=" + fiyat +
                '}';
    }


}
