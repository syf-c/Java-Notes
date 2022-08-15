public class KisiOrtakBilgileri {
    private String adSoyad;
    private String kimlikNo;
    private int yas;

    public KisiOrtakBilgileri(String adSoyad, String kimlikNo, int yas) {
        this.adSoyad = adSoyad;
        this.kimlikNo = kimlikNo;
        this.yas = yas;
    }

    public KisiOrtakBilgileri() {
    }

    public String getAdSoyad() {
        return adSoyad;
    }

    public void setAdSoyad(String adSoyad) {
        this.adSoyad = adSoyad;
    }

    public String getKimlikNo() {
        return kimlikNo;
    }

    public void setKimlikNo(String kimlikNo) {
        this.kimlikNo = kimlikNo;
    }

    public int getYas() {
        return yas;
    }

    public void setYas(int yas) {
        this.yas = yas;
    }

    @Override
    public String toString() {
        return
                "\nAd Soyad     = " + adSoyad +
                "\nKimlik No    = " + kimlikNo +
                "\nYas          = " + yas ;

    }
}
