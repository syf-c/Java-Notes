package Day16_Forloop;

public class Soru8 {
    // kullanicidan bir String istseyin ve Stringi tersten ceviren bir method olusturun
    public static void main(String[] args) {
        String input ="Java";
        System.out.println(tersCevir(input));
    }

    public static String tersCevir(String input) {
        String sonHarf="";
        for (int i =input.length()-1; i >=0 ; i--) {
            sonHarf+= input.substring(i,i+1);

        } return sonHarf;
    }
}
