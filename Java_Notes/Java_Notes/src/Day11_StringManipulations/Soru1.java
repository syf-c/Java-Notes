package Day11_StringManipulations;

public class Soru1 {
    public static void main(String[] args) {
        String cumle = "Java ogrenmek ne guzel";
        String kelime = "e";

        if(cumle.lastIndexOf(kelime) ==-1){
            System.out.println("kelime yok");
        }else {
            System.out.println("kelime cumlede yok");
        }
    }
}
