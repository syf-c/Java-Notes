package replit.Array;

public class Soru_07_sumArray {
    /*
    Write a method that accepts an array as parameter and returns sum off all elements in the array Then print the result in the main method.

    Eg :
    input : {1,2,3,4,5,6,7,8};
    output: 36
     */
    public static void main(String[] args) {
        int[] input ={1,2,3,4,5,6,7,8};
        sumArray(input);
        System.out.println(sumArray(input));
    }

    private static int sumArray(int[] input) {
        int sum = 0;
        for (int i = 0; i <input.length ; i++) {
            sum+=input[i];
        }
        return sum;
    }
}
