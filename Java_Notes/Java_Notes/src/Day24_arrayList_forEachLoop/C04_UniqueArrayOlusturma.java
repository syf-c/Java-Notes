package Day24_arrayList_forEachLoop;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C04_UniqueArrayOlusturma {

    public static void main(String[] args) {
        // Soru 2) Verilen bir array’deki tekrar eden elementleri tek bir defa barindiran
        // yeni bir array olarak donduren bir method olusturun

        int[] arr ={2,3,5,6,3,5,4,1,9,6,3,5,5};

        int[] newArray =uniqueElement(arr);
        System.out.println(Arrays.toString(newArray));


}

    private static int[] uniqueElement(int[] arr) {
        Arrays.sort(arr);
        List<Integer> benzersizList = new ArrayList<>();

        for (int i = 0; i <arr.length-1 ; i++) {
            if(arr[i]!=arr[i+1]){
                benzersizList.add(arr[i]);
            }
        }
        if(!benzersizList.contains(arr[arr.length-1])){
            benzersizList.add(arr[arr.length-1]);
        }

        int[] uniqueArray =new int[benzersizList.size()];
        for (int i = 0; i <uniqueArray.length ; i++) {
            uniqueArray[i]=benzersizList.get(i);
        }
        return uniqueArray;
    }
}