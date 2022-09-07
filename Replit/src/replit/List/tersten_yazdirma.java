package replit.List;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class tersten_yazdirma {
    public static void main(String[] args) {


      terstenyazdir();


        //-------list kullanarak---------------
       /* List<String> list = new ArrayList<>();
        for (int i = input.length() - 1; i >= 0; i--) {
           list.add(String.valueOf(input.charAt(i)));
       } System.out.println(list);

        */
    }

    private static String terstenyazdir() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Tersten yazmak istediginiz bir cumle yaziniz :");
        String input = scan.nextLine();
        String[] array = input.split("");

        for (int i = array.length - 1; i >= 0; i--) {
            System.out.print(array[i]);
        }

        return input;
    }
}
