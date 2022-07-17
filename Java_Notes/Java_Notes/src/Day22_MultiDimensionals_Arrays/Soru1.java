package Day22_MultiDimensionals_Arrays;

import java.util.Arrays;

public class Soru1 {
    /*
    Soru 1 ) Asagidaki multi dimensional array'in tum elemanlarinin carpimini ekrana
    yazdiran bir method yaziniz. { {1,2,3), {4,5,6} }

     */
    public static void main(String[] args) {

        int[][] sayilar ={{1,2,3},{4,5,6}};
        int carpim=1;

        for (int i = 0; i <sayilar.length ; i++) {
            for (int j = 0; j <sayilar[i].length ; j++) {
                carpim *=sayilar[i][j];
            }

        }
        System.out.println(Arrays.deepToString(sayilar));
        System.out.println(carpim);

    }


}