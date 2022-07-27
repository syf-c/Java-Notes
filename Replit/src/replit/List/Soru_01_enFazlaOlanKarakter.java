package replit.List;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Soru_01_enFazlaOlanKarakter {
    /*
    Write a Java program to get a String from user as input and find the maximum occurring character in that string. (Ignore case sensitivity)

    input :
    Learning java is easy
    output:
    maximum occurring character is : a
     */
    public static void main(String[] args) {
        //  Write a Java program to get a String from user as input and find the maximum occurring character in that string. (Ignore case sensitivity)

        //  input :

        //  Learning java is easy

        //  output:

        //  maximum occurring character is : a

        String input="Learning java is eeeeeeeeasy";
        input=input.replaceAll("\\s","");
        input =input.toLowerCase();

        String[] arr=input.split("");
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        int sayac=0;
        int enFazla=0;
        String enFazlaKullanilanHarf="";
        for (int i = 0; i <arr.length ; i++) {
            for (int j = 0; j < arr.length ; j++) {
                if (arr[i].equals(arr[j])) {
                    sayac++;
                }
            }

            if (sayac > enFazla) {
                enFazla = sayac;
                enFazlaKullanilanHarf = arr[i];
                sayac=0;
            } else sayac=0;

        }
        System.out.println("maximum occurring character is " + enFazlaKullanilanHarf);
        System.out.println("Kullanma sayisi :" + enFazla);

    }

    }

