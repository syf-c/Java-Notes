package Day12_Okul_Project;

public class Ogrenci extends Kisi {
    private String OgrenciNo;
    private String sinif;

    public Ogrenci(String adSoyad, String kimlikNo, int yas, String ogrenciNo, String sinif) {
        super(adSoyad, kimlikNo, yas);
        this.OgrenciNo = ogrenciNo;
        this.sinif = sinif;
    }
    public Ogrenci(){

    }

    public String getOgrenciNo() {
        return OgrenciNo;
    }

    public void setOgrenciNo(String ogrenciNo) {
        OgrenciNo = ogrenciNo;
    }

    public String getSinif() {
        return sinif;
    }

    public void setSinif(String sinif) {
        this.sinif = sinif;
    }

    @Override
    public String toString() {
        return "Ogrenci{" +
                "OgrenciNo='" + OgrenciNo + '\'' +
                ", sinif='" + sinif + '\'' +
                '}'+super.toString();
    }
}
