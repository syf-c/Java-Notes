package Day26_constructor;

public class Ogretmen {

    String isim = "Isim Belirtilmedi";
    String soyIsim = "soyIsim Belirtilmedi";
    String dogumTarihi = "Tarih Belirtilmedi";
    String brans = "Brans Belirtilmedi";
    String yanBrans = "YanBrans Belirtilmedi";

    public Ogretmen() {
    }

    public Ogretmen(String isim, String soyIsim, String dogumTarihi, String brans, String yanBrans) {
        this.isim = isim;
        this.soyIsim = soyIsim;
        this.dogumTarihi = dogumTarihi;
        this.brans = brans;
        this.yanBrans = yanBrans;
    }

    public Ogretmen(String isim, String soyIsim, String dogumTarihi) {
        this.isim = isim;
        this.soyIsim = soyIsim;
        this.dogumTarihi = dogumTarihi;
    }

    @Override
    public String toString() {
        return "ogretmen{" +
                "\nisim  :" + isim +
                "\nsoyIsim  :" + soyIsim +
                "\ndogumTarihi  :" + dogumTarihi +
                "\nbrans  :" + brans +
                "\nyanBrans  :" + yanBrans +
                '}';
    }
}
