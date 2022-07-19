package W3resouce;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Array_RemoveElement {
    /*
    Write a Java program to remove a specific element from an array.
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[] my_array = {25, 14, 56, 15, 36, 56, 77, 18, 29, 49};
        System.out.println(Arrays.toString(my_array));

        System.out.println("Which element do you want to remove?");
        int removed=scan.nextInt();

        sonuc(my_array,removed);
    //    System.out.println(sonuc);


    }

    private static void sonuc(int[] my_array, int removed) {
        List<Integer> my_list = new ArrayList<Integer>();

        for (int i = 0; i <my_array.length ; i++) {
            my_list.add(my_array[i]);
        }
        my_list.remove(removed);
        System.out.println("elemani kaldirilmis liste : "+my_list);

        int[] newArray = new int[my_list.size()];
        for (int i = 0; i <newArray.length ; i++) {

            newArray[i]=my_list.get(i);

        }
        System.out.println("Elemani kaldirilmis Array :"+Arrays.toString(newArray));


    }
}
