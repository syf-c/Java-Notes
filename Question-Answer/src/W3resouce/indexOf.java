package W3resouce;

import java.util.Scanner;

public class indexOf {
    //Write a Java program to find the index of an array element.
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen 0 ile 9arasinda bir index numarasi giriniz ");
        int index=scan.nextInt();

        int[] my_array = {25, 14, 56, 15, 36, 56, 77, 18, 29, 49};
       ;
       // System.out.println(my_array_indexOf(my_array,index));
       my_array_indexOf(my_array,index);
    }

    private static void my_array_indexOf(int[] my_array, int index) {

        for (int i = 0; i < my_array.length; i++) {
            if (i == index) {
                System.out.println("Index position of "+index+" is : "+ my_array[i]);
            }else{
                System.out.println("you have not index position of "+index);
                break;
            }
        }

    }
}
