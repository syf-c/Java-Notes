package day7_practice;

import java.util.Arrays;

public class Q04_Arrays {

    /*
     *  Verilen bir cumledeki bosluklar haric character sayisini bulunuz.
     *  Cumle: Verilen bir cumledeki bosluklar haric character sayisini bulunuz.
     */
    public static void main(String[] args) {
        String cumle="Verilen bir cumledeki bosluklar haric character sayisini bulunuz.";
        cumle = cumle.replaceAll(" ","");

        System.out.println(cumle);
        String[] cumle1 = cumle.split("");
        System.out.println(Arrays.toString(cumle1));
        System.out.println(cumle1.length);
    }

}
