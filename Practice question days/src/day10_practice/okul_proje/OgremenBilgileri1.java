package day10_practice.okul_proje;

public class OgremenBilgileri1 {
    String isim ="Isim belirtilmedi";
    String soyisim = "Soyisim belirtilmedi";
    int yas;
    String brans = "Brans belirtilmedi";
    String tel = "Telefon numarasi belirtilmedi";


    public OgremenBilgileri1() {
    }

    public OgremenBilgileri1(String isim, String soyisim, int yas, String brans, String tel) {
        this.isim = isim;
        this.soyisim = soyisim;
        this.yas = yas;
        this.brans = brans;
        this.tel = tel;
    }



    @Override
    public String toString() {
        return "\nOgremen Bilgileri :\n" +
                "\nisim     = " + isim  +
                "\nsoyisim  = " + soyisim +
                "\nyas      = " + yas +
                "\nbrans    = " + brans  +
                "\ntel      = " + tel ;

    }
}

