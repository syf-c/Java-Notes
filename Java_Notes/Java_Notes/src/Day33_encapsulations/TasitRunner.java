package Day33_encapsulations;

public class TasitRunner {
    public static void main(String[] args) {

        Tasit tst1 = new Tasit();

        tst1.setTasitTuru("Tir");

        System.out.println(tst1.getTasitTuru());

        tst1.setMauyenesiVarmi(true);
        System.out.println(tst1.isMauyenesiVarmi());


    }
}
