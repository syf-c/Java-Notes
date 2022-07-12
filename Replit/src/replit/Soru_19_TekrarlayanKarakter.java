package replit;

public class Soru_19_TekrarlayanKarakter {
    /*
    Ask user to enter a name and a character, then check how many times the character is repeated in the name using loops in the name

e.g:

char ch1= 'a' ;

String name =“John came late"

Expected Output: Number of a = 2
     */
    public static void main(String[] args) {

    String str ="John came late";

        String tekrarEdenHarf = "";
        for (int i = 0; i <= str.length() - 1; i++) {

            for (int j = i + 1; j < str.length(); j++) {
                if (str.charAt(i) == str.charAt(j)) {
                    if (!(tekrarEdenHarf.contains(str.substring(i, i + 1)))) {
                        tekrarEdenHarf += str.substring(i, i + 1);
                    }
                }
            }

        }
        System.out.println("Tekrar Eden Harfler = " + tekrarEdenHarf);
    }
}

