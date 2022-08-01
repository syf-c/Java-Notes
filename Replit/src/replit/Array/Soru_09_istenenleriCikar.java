package replit.Array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Soru_09_istenenleriCikar {
    /*Verilen bir Array'den istenen degere esit olan elamanlari kaldirip,
        kalanlari yeni bir Array olarak yazdiran bir method yaziniz.*/

   // int [] arr={1,2,5,4,9,3,3,8};

  static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {


       int [] arr={1,2,5,4,9,3,3,8,2};
        System.out.println(Arrays.toString(arr));
        Arrays.sort(arr);


       List<Integer> ArrList = new ArrayList<>();
       for (int i = 0; i <arr.length ; i++) {
           ArrList.add(arr[i]);
       }
        System.out.println("kac elelman cikarmak istiyosunuz");
        int adet=scanner.nextInt();

        List<Integer> adetList=new ArrayList<>();
        for (int i = 0; i < adet ; i++) {
            System.out.print(i);
            int eleman=scanner.nextInt();
            adetList.add(eleman);
        }
        System.out.println(adetList);

        for (int i = 0; i <ArrList.size() ; i++) {
            for (int j = 0; j <adetList.size(); j++) {
                if (ArrList.get(i).equals(adetList.get(j))){
                    ArrList.remove(ArrList.get(i));
                    ArrList.remove(adetList.get(j));
                }
            }
        }
        System.out.println(ArrList);

   }
}
