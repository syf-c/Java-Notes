package day8_practice;

import java.util.Scanner;

public class Q04_HackerLanguage {

// Kullanıcının yazdığı metni, 'hacker'ların konuşma diline çeviren bir method(method ismi hackerDili) yazınız.
//    Hackerlar bazı harfleri sayılara çevirerek yazışabiliyorlar. Genellikle çevirdikleri harfler şu şekilde:
//    s -> 5
//    a -> 4
//    e -> 3
//    i -> 1
//    o -> 0
//    Test data
//    hackerDili("java ile hersey guzel")
//    j4v4 1l3 h3r53y guz3l
//    İpucu harfleri değiştirin ve ekrana yazdırın.
public static void main(String[] args) {

    Scanner scan = new Scanner(System.in);
    System.out.println("Bir cumle giriniz :");
    String cumle = scan.nextLine().toLowerCase();

    hacerDili(cumle);

}

    private static void hacerDili(String cumle) {

    String[] array= new String[cumle.length()];

        for (int i = 0; i <cumle.length(); i++) {
            array[i] = cumle.substring(i,i+1);

            if (array[i].contains("s")){
                array[i] = "5";
            }
            if (array[i].contains("a")){
                array[i] = "4";
            }
            if (array[i].contains("e")){
                array[i] = "3";
            }
            if (array[i].contains("i")){
                array[i] = "1";
            }
            if (array[i].contains("o")){
                array[i] = "0";
            }
            System.out.print(array[i]);
        }

     }

}
