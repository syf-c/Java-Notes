package Day16_Forloop;

import java.util.Scanner;

public class Soru7 {
    public static void main(String[] args) {
        // kullanicidan bir String istseyin ve Stringi tersten yazdirin

        Scanner scanner = new Scanner(System.in);
        System.out.println("bir kelime giriniz :");
        String kelime = scanner.nextLine();
        String sonHarf= "";
        for (int i =kelime.length()-1;i>=0 ; i--) {
            sonHarf +=kelime.substring(i,i+1); // substring(3,4) 2,3 1,2 ,0,1
        } System.out.println("tersten yazilimi :" + sonHarf);

    }
}
