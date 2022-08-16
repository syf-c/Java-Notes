public class Ogretmen extends KisiOrtakBilgileri{
    private String bolum;
    private String sicilNo;

    public Ogretmen(String adSoyad, String kimlikNo, int yas, String bolum, String sicilNo) {
        super(adSoyad, kimlikNo, yas);
        this.bolum = bolum;
        this.sicilNo = sicilNo;
    }

    public Ogretmen() {
    }

    public String getBolum() {
        return bolum;
    }

    public void setBolum(String bolum) {
        this.bolum = bolum;
    }

    public String getSicilNo() {
        return sicilNo;
    }

    public void setSicilNo(String sicilNo) {
        this.sicilNo = sicilNo;
    }

    @Override
    public String toString() {
        return  "\nOGRETMEN BILGILERI"
                +super.toString()+
                "\n  Bolum    = " + bolum +
                "\n  Sicil No = " + sicilNo ;
    }
}
