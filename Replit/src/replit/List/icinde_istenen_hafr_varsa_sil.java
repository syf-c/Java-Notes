package replit.List;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class icinde_istenen_hafr_varsa_sil {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Bir harf giriniz :");
        String harf = scan.next();

        String[] array = {"Ali", "Veli", "Ayse", "Fatma", "Omer"};

        List<String> list = Arrays.asList(array);
        List<String> list2 = new ArrayList<String>();

        System.out.println(list);
        for (int i = 0; i <list.size();i++ ) {

            if (!list.get(i).contains(harf.toUpperCase()) && !list.get(i).contains(harf.toLowerCase())){
                list2.add(list.get(i));
            }

        }System.out.println(list2);




    }
}
