public class QA18_Sesli_Harf_Sayisi {
    /*
     Girilen Stringdeki  tüm sesli harfleri saymak için bir Java Methodu yazınız.

    Test Data:
    java is fun

    Beklenen Çıktı:

    Stringdeki sesli harf sayısı: 4
     */
    public static void main(String[] args) {
        String str = "AAAAaaaSASSSSa";
        int sonuc =0;
        for (int i =1; i <= str.length(); i++) {

            if (str.substring(i-1,i).equals("a") || str.substring(i-1,i).equals("e") ||str.substring(i-1,i).equals("u") ||
                    str.substring(i-1,i).equals("i") || str.substring(i-1,i).equals("o")||str.substring(i-1,i).equals("A")||str.substring(i-1,i).equals("E") ||
                    str.substring(i-1,i).equals("I")|| str.substring(i-1,i).equals("O") ||
                    str.substring(i-1,i).equals("U")){

                sonuc ++;

            }
        }System.out.println("Stringdeki sesli harf sayisi: "+sonuc);


    }}

