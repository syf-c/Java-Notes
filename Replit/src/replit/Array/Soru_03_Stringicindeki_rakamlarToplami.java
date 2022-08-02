package replit.Array;

public class Soru_03_Stringicindeki_rakamlarToplami {
    public static void main(String[] args) {
      /*
      Bir String'i parametre olarak kabul eden ve verilen string'de bulunan rakamların toplamını yazdıran bir metot yazın.

    girdi: ade1r4d3

    çıktı : 8

    Hint :
     Use Character.isDigit()
     Integer.valueOf()
       */

        String str = "ade1r4d3";
        str = str.replaceAll("\\D", "");
        System.out.println(str);
        int yeni = Integer.valueOf(str);
        System.out.println(yeni);

        int basamak = 0;
        int rakam = 0;
        while (yeni != 0) {
            rakam = yeni % 10;
            basamak += rakam;
            yeni /= 10;
        }
        System.out.println(basamak);
    }
}