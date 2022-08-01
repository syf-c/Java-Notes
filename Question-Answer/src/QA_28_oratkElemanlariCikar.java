import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class QA_28_oratkElemanlariCikar {
    public static void main(String[] args) {
        int[] arr = {1,2,2,2,3,1,3,3,4,5,6,4,6,7};
        Arrays.sort(arr);
        List<Integer> list = new ArrayList<Integer>();
        for (int i = 0; i <arr.length ; i++) {
           list.add(arr[i]);
        }


        for (int i = 0; i <list.size(); i++) {
            for (int j = i+1; j <list.size(); j++) {
                if(list.get(i).equals(list.get(j)) && list.contains(list.get(j))){
                    list.remove(i);
            }

            }

        }

        System.out.println(list);
    }
}
