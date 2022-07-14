package Day21_Arrays;

import static java.util.Arrays.sort;

public class C01_MaxSayiBul {
    /*
    Soru 1- Verilen bir int array’deki en buyuk sayiyi yazdiran bir method olusturun.
     */
    public static void main(String[] args) {
        int sayilar[] = {4,5,6,7,8,9,5,2,53};

        maxSayiBul(sayilar);
    }

    private static void maxSayiBul(int[] sayilar) {
        int maxSayi=sayilar[0];
        for (int i = 0; i <sayilar.length ; i++) {
            if(maxSayi<sayilar[i]){
                maxSayi=sayilar[i];
            }
        }System.out.println("Array deki en buyuk sayi :" + maxSayi);
    }
}
