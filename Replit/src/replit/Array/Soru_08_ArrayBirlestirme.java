package replit.Array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Soru_08_ArrayBirlestirme {
    /*
    Write a return method that accepts 2 integer Arrays as parameters And adds 2 array into a new Array and prints it.

    Input1={1,2,3,4}
    Input2={5,6}
    Output={1,2,3,4,5,6}
     */
    public static void main(String[] args) {
        int[] input1 = {1,2,3,4};
        int[] input2 = {5,6};



        List<Integer> input3 = new ArrayList<>();
        for (int i = 0; i <input1.length ; i++) {
            input3.add(input1[i]);
        }
        for (int i = 0; i <input2.length ; i++) {
            input3.add(input2[i]);
        }

        int[] yeniArray = new int[input3.size()];
        for (int i = 0; i <yeniArray.length ; i++) {
            yeniArray[i]+=input3.get(i);
        }
        System.out.println(Arrays.toString(yeniArray));








    }
}
