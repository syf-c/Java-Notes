package Day33_encapsulations;

public class Ogretmen {

    String isim;
    String soyIsiml;
    String brans;
       /*
      Bazen de yetkileri sinirlamak degil de
      yapilan isi daha iyi tanimlamak icin
      encapsulation kullanilir
      Bu yaklasimi kullanan class'larda
      tum variable'lar private yapilip
      hepsi icin getter ve setter olusturulur
     */

    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }

    public String getSoyIsiml() {
        return soyIsiml;
    }

    public void setSoyIsiml(String soyIsiml) {
        this.soyIsiml = soyIsiml;
    }

    public String getBrans() {
        return brans;
    }

    public void setBrans(String brans) {
        this.brans = brans;
    }
}
