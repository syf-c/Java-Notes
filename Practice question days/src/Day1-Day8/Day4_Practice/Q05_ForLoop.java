package Day4_Practice;

public class Q05_ForLoop {

    // 0-255 e kadar olan harflerin , sayı ve harf değerini ekrana yazdırınız.

    public static void main(String[] args) {

        // --------for dongusu-------
/*
        for (int i = 0; i <255 ; i++) {
          char c = (char)i;
            System.out.println(i + "-> " + c);
        }

 */

        //--------while loop ile---------
/*
        int baslangic = 0;
        int bitis =255;
        while (baslangic<bitis){
            char c = (char)baslangic;
            System.out.println(baslangic + " -> " + c);
            baslangic++;
        }

 */
        //---------Do While loop----------------
        int baslangic = 0;
        int bitis =255;
        do {
            char c = (char)baslangic;
            System.out.println(baslangic + " -> " + c);
            baslangic++;
        }while(baslangic<bitis);


    }
}
