package day7_practice;

public class Q03_MDArray {

    /*
     * Girilen Multidimensional arraydeki cift sayilari toplayan bir method
     * yaziniz
     * INPUT : {{1,3,6},{2,8},{5,7,9,14}}
     *
     * OUTPUT : Arraydeki cift sayilarin toplami : 30
     */
    public static void main(String[] args) {
        int[][] input= {{1,3,6},{2,8},{5,7,9,14}};
        sumEven(input);
        System.out.println("sum of even numbers = " + sumEven(input));
    }

    private static int sumEven(int[][] input) {
        int sum =0;
        for (int[] each1:input) {
            for (int each2:each1) {
                if(each2%2==0){
                    sum +=each2;
                }
            }
        }
      return sum;
    }

}
