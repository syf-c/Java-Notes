package Day21_Arrays;

import java.util.Arrays;

public class C07_sort {
    public static void main(String[] args) {
        String[] isimler ={"mehmet","hasan","kasim","zeynep","ali"};
        int[] sayilar={5,7,1,5,4,7,9};

        Arrays.sort(sayilar);
        System.out.println(Arrays.toString(sayilar));

        Arrays.sort(isimler);
        System.out.println(Arrays.toString(isimler));
    }
}
