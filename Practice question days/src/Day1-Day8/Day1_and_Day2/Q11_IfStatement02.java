package Day1_and_Day2;

import java.util.Scanner;

public class Q11_IfStatement02 {
    /*
    not hesaplayici
		   	A => 90 ~100
		   	B => 80 ~ 89
		   	C => 70 ~ 79
		   	D => 60 ~ 69
		   	F =>  0 ~ 59
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("lutfen notunuzu giriniz :");
        int note = scan.nextInt();

        if (note < 0 || note > 100) {
            System.out.println("lutfen 0 ile 100 arasinda bir not giriniz");
        } else if (note <= 59) {
            System.out.println("Notunuz F dir");
        } else if (note <= 69) {
            System.out.println("Notunuz D dir");
        } else if (note <= 79) {
            System.out.println("Notunuz C dir");
        } else if (note <= 89) {
            System.out.println("Notunuz B dir");
        } else {
            System.out.println("Notunuz A dir");
        }
    }


}
