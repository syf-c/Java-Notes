public class Ogrenci extends KisiOrtakBilgileri {

    private String ogrenciNo;
    private String sinif;

    public Ogrenci(String adSoyad, String kimlikNo, int yas, String ogrenciNo, String sinif) {
        super(adSoyad, kimlikNo, yas);
        this.ogrenciNo = ogrenciNo;
        this.sinif = sinif;
    }


    public Ogrenci() {
    }

    public String getOgrenciNo() {
        return ogrenciNo;
    }

    public void setOgrenciNo(String ogrenciNo) {
        this.ogrenciNo = ogrenciNo;
    }

    public String getSinif() {
        return sinif;
    }

    public void setSinif(String sinif) {
        this.sinif = sinif;
    }

    @Override
    public String toString() {
        return  "OGRENCI BILGILERI"
                +super.toString()+
                "\nOgrenci No   = " + ogrenciNo +
                "\nSinif        = " + sinif ;
    }
}
