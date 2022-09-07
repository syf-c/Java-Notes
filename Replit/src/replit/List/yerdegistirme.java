package replit.List;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class yerdegistirme {
    public static void main(String[] args) {
        //Create a 10-element list. Swap the 8th element with the 3rd element.
        String[] names={"Umit","Emin","Kemal","Kerem","Taylan","Orhan","Sinan","Furkan","Ahmet","Ali"};
        names[2]="Musa";

        System.out.println(Arrays.toString(names));
        List<String> list=Arrays.asList(names);
        list.set(2,"Furkan");
        list.set(7,"Kemal");
        System.out.println(list);


    }
}
