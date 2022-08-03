package replit.For_While;

public class Soru06_Alfabet {
    //Print Alphabet on the console.
    public static void main(String[] args) {

       // char baslangic='C';
      //  char son = 'D';
        alfabetik('A','Z');

    }

    private static void  alfabetik(char baslangic,char son) {
        for (int i = baslangic; i <=son;i++){
            System.out.println(baslangic+" = "+i);
            baslangic++;
        }
    }
}

