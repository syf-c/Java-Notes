package Day33_encapsulations;

public class Tasit {

    private String tasitTuru;
    private boolean mauyenesiVarmi;
    private int yil;

    public String getTasitTuru() {
        return tasitTuru;
        // getter method'u da tek bir satirlik islem yapiyor
        // baska class'larin private oldugu icin erisemedigi
        // tasitTuru bilgisini, class icinden alip
        // istenen farkli class'lar return ediyor
    }

    public void setTasitTuru(String tasitTuru) {
        this.tasitTuru = tasitTuru;
        //return olmadığı icin bu methodun cağırıldığı tasitrunner classinden yazdirilamaz
        //burada bir satırlık islem yapıyor o bir satırlık islemde
        // bizim gönderdiğimiz parametreyi instence variable a atıyor.
    }

    public boolean isMauyenesiVarmi() {
        return mauyenesiVarmi;
        // boolean variable'lar icin olusturulan getter method'larinin ismi
        // isVariableIsmi seklinde olur
    }

    public void setMauyenesiVarmi(boolean mauyenesiVarmi) {
        this.mauyenesiVarmi = mauyenesiVarmi;
    }

    public int getYil() {
        return yil;
    }

    public void setYil(int yil) {
        this.yil = yil;
    }
}
