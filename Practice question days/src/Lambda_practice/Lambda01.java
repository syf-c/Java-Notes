package Lambda_practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Lambda01 {
    /* TASK :
     * Input olarak verilen listteki isimlerden
     * icinde 'a' harfi bulunanlari silen bir code create ediniz.
     *
     * INPUT : list1={"Ali","Veli","Ayse","Fatma","Omer"}
     * OUTPUT : [Veli,Omer]
     */
    static ArrayList<String> names = new ArrayList<String>(Arrays.asList("Ali", "Veli", "Ayse", "Fatma", "Ismail", "Fatih", "Ersin"));
    static List<Integer> numbers = new ArrayList<Integer>(Arrays.asList(25,36,75,96,32,45,69,25,9,35,35,34));

    public static void AHarfiOlanlariSil(List<String> list) {
        /*System.out.println(list.stream()
                .map(String::toLowerCase)
                .filter(t -> !t.contains("a"))
                .collect(Collectors.toList()));*/
        //2.yol
        System.out.println("2.yol : "+list.stream()
                .filter(t -> !t.contains("a") && !t.contains("A"))
                .collect(Collectors.toList()));
        //3.yol
       names.removeIf(t -> t.contains("A") || t.contains("a"));
        System.out.println("3.yol : " +names);

    }

    //Enbuyuk elemani bulun

    public static int enBuyukEleman(List<Integer> list) {
        return list.stream().distinct().sorted().reduce(Math::max).get();

    }

    //Listedeki tum elemanlarin toplamini bulan metodu yaziniz

    public static int tumElemanlarinToplami(List<Integer> list) {
        return list.stream().reduce(Math::addExact).get();

    }

    //Listedeki cift elemanlarin carpimi



}
