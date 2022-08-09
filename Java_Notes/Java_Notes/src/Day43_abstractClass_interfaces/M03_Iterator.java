package Day43_abstractClass_interfaces;

import java.util.ArrayList;
import java.util.List;

public class M03_Iterator{
    public static void main(String[] args) {
         List<Integer> list = new ArrayList<Integer>();
        list.add(10);
        list.add(20);
        list.add(30);

        System.out.println(list); // [10, 20, 30]

        // listedeki tum elementleri index kullanmadan 3 artirin

        for (Integer each: list) {
            each+=3;
            System.out.print(each +" ");

        }
        System.out.println();
        System.out.println(list);

    }
}
