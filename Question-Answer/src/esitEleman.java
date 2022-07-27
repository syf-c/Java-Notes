import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class esitEleman {
    public static void main(String[] args) {
        /*Verilen bir Array'den istenen degere esit olan elamanlari kaldirip,
        kalanlari yeni bir Array olarak yazdiran bir method yaziniz.*/
        Scanner scanner = new Scanner(System.in);
        System.out.println("hangi sayilari cikarmak istersiniz");
        int adet = scanner.nextInt();
        int[] arr={1,2,3,5,7,3,9,5,8,6};
        List<Integer> sayilar = new ArrayList<>();
        Arrays.sort(arr);
        for (int i = 0; i <arr.length; i++) {
            sayilar.add(arr[i]);
        }

        for (int i = 0; i <adet ; i++) {
            System.out.println("hangi sayilari cikaralim");
            int sayi1 = scanner.nextInt();
            for (int j = 0; j <sayilar.size() ; j++) {
                sayilar.remove(sayi1);
            }
        }


        System.out.println(sayilar);


    }
}
