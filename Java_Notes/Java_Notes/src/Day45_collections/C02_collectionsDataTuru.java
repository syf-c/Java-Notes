package Day45_collections;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class C02_collectionsDataTuru {

    public static void main(String[] args) {
        /*
        Collections <dataTuru> nu Object secmeniz durumunda
        Collection'a farkli data turlerinden objeler koymaniza izin verir

        Bu depolama acisindan bize esneklik saglar
        Ancak islem yaparken tum objeleri object olarak tanimladigimizdan
        cok fazla casting yapmamiz gerekebilir
        */


        List<String> list = new ArrayList<String>();
        //  list.add(5);   //cunku list "<String>" Stringlerden olusuyor
        // list.add('s')   //char da eklenmez
        // list.add(true)  // eklenmez

        List<Object> List = new ArrayList(); // "<Object>" list objectlerden olstugu icin herseyi ekliyor
        List.add(5);
        List.add('s');
        List.add(true);
        List.add("Ali");

        System.out.println(List); //[5, s, true, Ali]

        List.set(0,(Integer)List.get(0)+5);
        List.set(3,List.get(3)+" Can");
        List.set(2,(Boolean)List.get(2));

        System.out.println(List); //[10, s, true, Ali Can]

        Set<Object> Set1 = new HashSet<Object>();   // objectler tum data turlerinin babasidir
        Set1.add(5);
        Set1.add(true);
        Set1.add('d');
        Set1.add("islem");

    }
}
