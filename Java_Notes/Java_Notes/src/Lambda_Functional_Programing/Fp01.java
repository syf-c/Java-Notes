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

}
