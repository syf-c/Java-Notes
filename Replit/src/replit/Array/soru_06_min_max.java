package replit.Array;

public class soru_06_min_max {
    /*
    Write a method that accepts an integer array as input and prints the minimum and the maximum numbers from given array

        Input : {3,2,5,4,1,6}

        Output :

        min: 1

        max: 6
     */

    public static void main(String[] args) {
        int[]  input = {3,2,5,4,1,6};
        int enk=input[0];
        int eby=input[0];
        for (int i = 0; i <input.length ; i++) {
            if(enk>input[i]){
                enk=input[i];
            }
            if (eby<input[i]){
                eby=input[i];
            }
        }
        System.out.println("min : " + enk);
        System.out.println("max : " + eby);
    }
}
