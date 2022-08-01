package replit.For_While;

import java.util.Arrays;

public class Soru03_TekrarEdenHarfler {
    public static void main(String[] args) {

        String str = "John cameee latea";
        str = str.replaceAll(" ", "");

        String tekrarEdenHarf = "";

        for (int i = 0; i < str.length(); i++) {
            for (int j = i + 1; j < str.length(); j++) {
                if (str.charAt(i) == str.charAt(j)) {
                    if (!(tekrarEdenHarf.contains(str.substring(i, i + 1)))) {
                        tekrarEdenHarf += str.substring(i, i + 1);
                    }
                }
            }
        }
        System.out.println(tekrarEdenHarf);

        String[] yeniArray = new String[tekrarEdenHarf.length()];
        for (int i = 0; i < tekrarEdenHarf.length(); i++) {
            yeniArray[i] = tekrarEdenHarf.substring(i, i + 1);
        }
        System.out.println(Arrays.toString(yeniArray));
    }
}
