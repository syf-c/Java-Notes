package Day14_methodCreation;

public class C01_MethodCreation {
    public static void main(String[] args) {
        //input olarak verilen 4 harfli bir stringi
        // terssten yazdiranbir method olusturalim
        terstenYazdir("Musa");

    }
    public static void terstenYazdir(String input) {
        String tersInput = input.substring(3)
                +input.substring(2,3)
                +input.substring(1,2)
                +input.substring(0,1);

        System.out.println("verilen kelimenin tersten yazilisi : "+ tersInput);

    }
}
