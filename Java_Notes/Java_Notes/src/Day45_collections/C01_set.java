package Day45_collections;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class C01_set {
    // verilen bir arraydeki tekrar eden elementleri silip
    // tekrarsiz halini array e atayan bir kod yaziniz
    public static void main(String[] args) {

        int[] arr = {4, 5, 6, 4, 5, 6, 7, 8, 9, 7, 8, 9, 1, 2, 3, 1,0, 2, 3};

        Set<Integer> tekrarsizSet = new HashSet<Integer>();

        for (int i = 0; i <arr.length ; i++) {
            tekrarsizSet.add(arr[i]);
        }
        System.out.println(tekrarsizSet); //[0, 1, 2, 3, 4, 5, 6, 7, 8, 9]

        System.out.println("********* for each **********");
        for ( int each:arr){
            tekrarsizSet.add(each);
        }
        System.out.println("Set : "+tekrarsizSet); // [0, 1, 2, 3, 4, 5, 6, 7, 8, 9]

        int [] tekrarsizArr = new int[tekrarsizSet.size()];

        System.out.println(Arrays.toString(tekrarsizArr)); //[0, 0, 0, 0, 0, 0, 0, 0, 0, 0]

       //******** Set te index yapisi yoktur
        int i = 0;
        for (int each :tekrarsizSet) {
            tekrarsizArr[i]=each;
            i++;

        }
        arr = tekrarsizArr;
        System.out.println("Bizim arrayin son hali : " + Arrays.toString(arr));//Bizim arrayin son hali : [0, 1, 2, 3, 4, 5, 6, 7, 8, 9]

    }
}