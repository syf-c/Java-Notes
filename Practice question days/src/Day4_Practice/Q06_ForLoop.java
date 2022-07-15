package Day4_Practice;

public class Q06_ForLoop {

    // 1 x 1 = 1
    // 1 x 2 = 2
    // 1 x 3 = 3
    // 1 x 4 = 4
    // 1 x 5 = 5
    // 1 x 6 = 6
    // 1 x 7 = 7
    // 1 x 8 = 8
    // 1 x 9 = 9
    // 1 x 10 = 10
    // Yukarıdaki çarpım tablosunu 10 a kadar ekrana yazdırınız.

    public static void main(String[] args) {
        /*
        int carpan =1;
        int sonuc =0;
        for (int i = 0; i <=10 ; i++) {
            sonuc = i*carpan;
            System.out.println(carpan + " x "+ i + " = " + sonuc);
        }

         */

        for (int i = 0; i <=10 ; i++) {
            for (int j = 0; j <=10 ; j++) {
                System.out.println(i + " x "+ j + " = " + (i*j));
            }
            System.out.println(" ");
        }

    }
}
