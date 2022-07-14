package Day21_Arrays;

import java.util.Arrays;
import java.util.Scanner;



public class C04_ArrayOlustur_Tekrar {
    // Soru 4- Kullanicidan bir array’in boyutunu
    // ve tum elementlerini alarak bir array olusturup,
    // bu array’i bize donduren bir method olusturun
    public static void main(String[] args) {
        int[] sonuc =arrayOlusturma();
        System.out.println(Arrays.toString(sonuc));
    }

    private static int[] arrayOlusturma() {
        Scanner scan = new Scanner(System.in);
        System.out.println("kac elemanli bir array olusturmak istiyorsunuz?");
        int elemansayisi=scan.nextInt();

        int[] myArray = new int[elemansayisi];
        for (int i = 0; i <myArray.length ; i++) {
            System.out.println(i+". elemani giriniz");
            int sayi=scan.nextInt();
            myArray[i]=sayi;
        }
        return myArray;
    }
}