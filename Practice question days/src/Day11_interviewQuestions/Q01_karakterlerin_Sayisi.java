package Day11_interviewQuestions;

import java.util.Arrays;
import java.util.Scanner;

public class Q01_karakterlerin_Sayisi {
    /*
 Kullanicidan bir String aliniz.
 String'de var olan her character'in sayisini ekrana yazdiriniz.

Ornek: yapacan ==> a = 3, y = 1, p = 1, n = 1, c = 1
        hallolur yaaa   ==> a=4  l=3 h=1 o=1 u=1 y=1
*/
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen bir cumle giriniz");
        String str = scanner.nextLine().toLowerCase();


        String[] arr = str.split("");
        Arrays.sort(arr);

        System.out.println(Arrays.toString(arr));
        int counter=0;

        for (int i = 1; i <arr.length; i++) {
            if (arr[i-1].equals(arr[i])){
                counter++;
            }else{
                System.out.println(arr[i-1]+ " sayisi "+(counter+1));
                counter = 0;
            }if (i==arr.length-1){
                System.out.println(arr[i]+ " sayisi "+(counter+1));
            }
        }


    }
}
