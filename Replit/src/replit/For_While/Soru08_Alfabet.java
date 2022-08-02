package replit.For_While;

public class Soru08_Alfabet {
    public static void main(String[] args) {
        char baslangic='a';
        char son = 'z';
        for (int i = 'a'; i <=son;i++){
            System.out.println("Ascii value of "+baslangic+" = "+i);
            baslangic++;
        }
    }
}
