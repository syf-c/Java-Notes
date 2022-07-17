package Day22_MultiDimensionals_Arrays;

public class Soru_3 {
    /*
    Soru 3) Asagidaki multi dimensional array'lerin ic array'lerinde ayni index'e sahip
             elemanlarin toplamini ekrana yazdiran bir program yaziniz. (Zor soru) arr1 = { {1,2},
             [3,4,5), {6} } ve arr2 = { {7,8,9}, {10,11}, (12} }
     */
    public static void main(String[] args) {
        int[][] arr1 = {{1, 2}, {3, 4, 5}, {6}};
        int[][] arr2 = {{7, 8, 9}, {10, 11}, {12}};

        int toplam = 0;

        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr1[i].length; j++) {
                for (int a = 0; a < arr2.length; a++) {
                    for (int b = 0; b < arr2[a].length; b++) {
                        if (i==a && j == b) {
                            toplam += arr1[i][j] + arr2[a][b];

                        }
                    }
                }

            }
        }

        System.out.println(toplam);


    }
}
