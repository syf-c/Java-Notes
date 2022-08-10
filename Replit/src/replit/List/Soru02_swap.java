package replit.List;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Soru02_swap {
    public static void main(String[] args) {
    /*
    Create a 10-element list. Swap the 8th element with the 3rd element.

    INPUT : String[] names={"Umit","Emin","Kemal","Kerem","Taylan","Orhan","Sinan","Furkan","Ahmet","Ali"};

    Output:

    [Umit,Emin,Furkan,Kerem,Taylan,Orhan,Sinan,Kemal,Ahmet,Ali]
     */
        String[] names = {"Umit", "Emin", "Kemal", "Kerem", "Taylan", "Orhan", "Sinan", "Furkan", "Ahmet", "Ali"};

        System.out.println(Arrays.toString(names));
        List<String> list = new ArrayList<>();
        for (int i = 0; i < names.length; i++) {
            list.add(names[i]);
        }
      //  System.out.println(list);
        list.add(8, list.get(2));
       // list.remove()
        System.out.println(list);

    }
}
