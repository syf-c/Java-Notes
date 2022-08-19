package Lambda_Functional_Programing;

import java.util.ArrayList;
import java.util.List;

public class Fp01 {
    public static void main(String[] args) {
        /*
    1) Lambda (Functional Programming) Java 8 ile kullanılmaya başlanmıştır.
    2) Functional Programming'de "Ne yapılacak" (What to do) üzerine yoğunlaşılır.
       Structured Programming "Nasıl yapılacak" (How to do) üzerine yoğınlaşılır.
    3) Functional Programming, Arrays ve Collections ile kullanılır.
    4) "entrySet() methodu ile Map, Set'e dönüştürülerek Functional Programming'de kullanılabilir.
     */

        List<Integer> liste = new ArrayList<>();
        liste.add(8);
        liste.add(9);
        liste.add(131);
        liste.add(10);
        liste.add(9);
        liste.add(10);
        liste.add(2);
        liste.add(8);
        System.out.println(liste);

        listElemanlariniYazdirScructured(liste);
        System.out.println();//dummy
        listElemanlariniYazdirFunctional(liste);
        System.out.println();//dummy
        ciftElemanlariYazdirScructured(liste);
        System.out.println();//dummy
        ciftElemanlariYazdirFunctional(liste);
        System.out.println();//dummy
        tekElemanlarinKareleriniYazdirScructured(liste);
        System.out.println();//dummy
        tekElemanlarinKareleriniYazdirfunctional(liste);
        System.out.println();//dummy
        tekrarsizTekElemanlarinKupunuYazdir(liste);
        System.out.println();//dummy
        tekrarsizCiftElemanlarinKareToplami(liste);
        System.out.println();//dummy
        tekrarsizCiftElemanlerinKupununCarpimi(liste);
        System.out.println();//dummy
        getMaximumElement01(liste);
        System.out.println();//dummy
        getMaximumElement02(liste);
        enkucukeleman01(liste);
        enkucukeleman02(liste);
        getyedidenBuyukEnkucukCiftsayi(liste);

    }

    //1)Ardışık list elementlerini aynı satırda aralarında boşluk bırakarak yazdıran bir method oluşturun.(Functional)

    private static void listElemanlariniYazdirScructured(List<Integer> liste) {
        for ( Integer w : liste){
            System.out.print(w+" ");
        }
    }
    private static void listElemanlariniYazdirFunctional(List<Integer> liste) {
        liste.stream().forEach(t-> System.out.print(t +" "));
        //stream() methodu collection'dan elementleri akışa dahil etmel için ve methodlara ulaşmak için kullanılır.
    }

    //2)Çift sayı olan list elemanlarını aynı satırda aralarında boşluk bırakarak yazdıran bir method oluşturun.(Structured)
    public static void ciftElemanlariYazdirScructured(List<Integer>liste){
        for (Integer w:liste){
            if (w%2==0){
                System.out.print(w+" ");
            }
        }
    }
    private static void ciftElemanlariYazdirFunctional(List<Integer> liste) {
        liste.stream().filter(t->t%2==0).forEach(t-> System.out.print(t+" "));
    }

    //3) Ardışık tek list elemanlarının karelerini aynı satırda aralarında boşluk bırakarak yazdıran bir method oluşturun.(Functional)
    private static void tekElemanlarinKareleriniYazdirScructured(List<Integer> liste) {
        for (Integer w : liste) {
            if (w%2!=0){
                System.out.print(w +" ");
            }
        }
    }
    private static void tekElemanlarinKareleriniYazdirfunctional(List<Integer> liste) {
        liste.stream().filter(t->t%2!=0).map(t->t*t).forEach(t-> System.out.print(t+" ")); //elemanların değerleri değişecekse map() methodu kullanılır.
    }

    //4) Ardışık tek list elementlerinin küplerini tekrarsız olarak aynı satırda aralarında boşluk bırakarak yazdıran bir method oluşturun.
    public static void tekrarsizTekElemanlarinKupunuYazdir(List<Integer> list) {
        list.stream().distinct().filter(t -> t % 2 != 0).map(t -> t * t * t).forEach(t -> System.out.print(t + " "));
    }

    //5) Tekrarsız çift elemanların karelerinin toplamını hesaplayan bir method oluşturun.
    public static void tekrarsizCiftElemanlarinKareToplami(List<Integer> list){
        Integer toplam = list.stream().distinct().filter(t->t%2==0).map(t->t*t).reduce(0,(t,u)->t+u);
        System.out.println(toplam);

    }
    //6) Tekrarsiz cift elemanlerin kupunun carpimini hesaplayan bir method olusturun.
    public static void tekrarsizCiftElemanlerinKupununCarpimi(List<Integer> list){
        Integer carpim = list.stream().distinct().filter(t -> t % 2==0).map(t -> t*t*t).reduce(1,(t,u)->t*u);
        System.out.println(carpim);
    }

    //7) List elemanlari arasindan en buyuk degeri bulan bir method olusturun.
    //1.yol
    public static void getMaximumElement01(List<Integer>list){
       Integer max= list.stream().distinct().reduce(Integer.MIN_VALUE,(t,u)->t>u ? t : u);
        System.out.println("max 1.yol = "+max);
    }

    //2.yol
    public static void getMaximumElement02(List<Integer>list){
        Integer max =list.stream().distinct().sorted().reduce(Integer.MIN_VALUE,(t,u)->u);
        System.out.println("max 2.yol = "+max);
    }

    //8) List elemanları arasından en küçük değeri bulan bir method oluşturun.(2 Yol ile)
    public static void enkucukeleman01(List<Integer>list){
        Integer min =list.stream().distinct().sorted().reduce(list.get(0),(t,u)->t<u ?t :u);
        System.out.println("En kucuk eleman : "+min);
    }
    public static void enkucukeleman02(List<Integer>list){
      Integer min= list.stream().distinct().reduce(Integer.MAX_VALUE,(t,u)->u);
        System.out.println("En kucuk eleman : "+min);
    }
    //9) List elemanları arasından 7'den büyük, çift, en küçük değeri bulan bir method oluşturun.
    public static void getyedidenBuyukEnkucukCiftsayi(List<Integer>list){
       Integer minvalue= list.stream().distinct().filter(t->t>7).filter(t->t%2==0).reduce(Integer.MAX_VALUE,(t,u)->t<u ? t : u);
        System.out.println("minvalue = " + minvalue);
    }

    

}
