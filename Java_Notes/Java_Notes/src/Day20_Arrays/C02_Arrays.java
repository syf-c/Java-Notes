package Day20_Arrays;

import java.util.Arrays;

public class C02_Arrays {
    public static void main(String[] args) {

        int sayilar[] = new int[3];
        System.out.println(sayilar); //[I@723279cf

        // non-primitive data turundeki datalari
        //herzaman direk yazdiramayiz
        //Array 'i yazdirmak istersek Arrays class'indan yardim isteriz

        System.out.println(Arrays.toString(sayilar)); // [0, 0, 0]

        sayilar[2]=10;
        sayilar[0]=5;
        sayilar[1]=3;
        System.out.println(sayilar); // [I@723279cf
        System.out.println(Arrays.toString(sayilar)); //[5, 3, 10]

        String sinifList[] = {"Ali","Veli","Ayse"};

        System.out.println(Arrays.toString(sinifList)); //[Ali, Veli, Ayse]

        sinifList[1]="Hasan";
        System.out.println(Arrays.toString(sinifList));

        System.out.println(sinifList[1]);   // Hasan
        System.out.println(sinifList[0]);   // Ali



    }
}
