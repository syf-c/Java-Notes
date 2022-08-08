package Day13_interviewQuestion;

public class Q02Stringi_terscevirmek_StringBuilder {
     /*
// Stringi ters cevirmek icin bir Java Programi yazin
//1.Yol: StringBuilder () kullanarak
//2.Yol: String Classini kullanarak
//3.Yol: Bir method olusturun, ardindan methodu main method dan cagirin
  */
     public static void main(String[] args) {

         String input ="Gurbuz";

         stringBuilder(input);
         stringTersCevir(input);

         }

    private static void stringTersCevir(String input) {
        System.out.print("ters cevrilen input string kullanim = ");
        for (int i = input.length() - 1; i >= 0; i--) {
            System.out.print(input.charAt(i));
        }
    }

    private static void stringBuilder(String input) {
        StringBuilder str = new StringBuilder();

        str.append(input);
        String terscevir = str.reverse().toString();
        System.out.println("ters cevrilen input String Builder kullanim = " + terscevir);
    }

}


