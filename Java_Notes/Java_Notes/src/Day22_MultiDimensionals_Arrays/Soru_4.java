package Day22_MultiDimensionals_Arrays;

import java.util.Arrays;

public class Soru_4 {
    /*
  Soru 4) Asagidaki multi dimensional array'in ic array'lerindeki tum elemanlarin toplamini
          birer birer bulan ve herbir sonucu yeni bir array'in elemani yapan ve yeni array'i ekrana
          yazdiran bir program yaziniz { {1,2,3), {4,5), {6,7} }

          Ornek; { {1,2,3), {4,5), (6,7} } ==> 1+2+3=6 4+5=9 6+7=13 ==> output: {6, 9, 13}
     */
    public static void main(String[] args) {

        int[][] array = {{1, 2, 3}, {4, 5}, {6, 7}};

        int[] yeni= new int[array.length];

        for (int i = 0; i <array.length ; i++) {
            for (int j = 0; j <array[i].length ; j++) {
                yeni[i]+=array[i][j];
            }

        }
        System.out.println(Arrays.toString(yeni));


    }
}
