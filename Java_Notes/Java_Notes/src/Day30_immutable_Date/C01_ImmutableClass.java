package Day30_immutable_Date;

import java.util.ArrayList;
import java.util.List;

public class C01_ImmutableClass {
    public static void main(String[] args) {

        List<String> list = new ArrayList<String>();
        list.add("Kenan");
        list.add("Musa");
        list.add("Enes");
        System.out.println(list);

        list.set(0,"Yasemin");
        System.out.println(list);

        list.remove("Enes");
        System.out.println(list);
    }
}
