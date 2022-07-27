package day8_practice;

import java.util.ArrayList;
import java.util.List;

public class Q03_ArrayList {

    /*
     * verilen arrayin n sayisi kadar maksimun  degerlerini bulan java programi yaziniz
     * not kisa metodlar kullamayiniz
     * Input : {1,2,3,4,5,6,7,8} input n:2 Output : 7 and 8
     */
    public static void main(String[] args) {
        int[] arr ={1,21,3,45,5,6,7,8,21,25};
        int n=4;

        List<Integer> list = new ArrayList<Integer>();

        for (int each : arr) {
            list.add(each);
        }

        List<Integer> maxList = new ArrayList<Integer>();
        int count = 1;
        while (count<=n){
            int max = list.get(0);
            for (int i = 0; i <list.size() ; i++) {
                if (list.get(i)>max && !maxList.contains(list.get(i))){
                    max=list.get(i);
                }
            }
            maxList.add(max);
           // list.remove(list.indexOf(max));
            count++;
        }
        System.out.println("Array icindeki maximum"+n+" elemanlari : "+maxList);











    }
}
