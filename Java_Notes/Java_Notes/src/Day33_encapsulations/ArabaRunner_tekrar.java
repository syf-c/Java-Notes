package Day33_encapsulations;

public class ArabaRunner_tekrar {
    public static void main(String[] args) {

        Araba_tekrar arb1 = new Araba_tekrar();
        arb1.marka = "Toyota";
        System.out.println(arb1.marka);


        System.out.println(arb1.getYakit());
        arb1.setModel("Supra");
        arb1.getModel();
        System.out.println(  arb1.getModel());

    }
}