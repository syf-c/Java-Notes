import java.util.Arrays;
import java.util.Scanner;

public class QA20_Siralama {
    /*
     Karışık verilen sayıları  ve kelimeleri  sıralayan   Java kodunun yazınız.
    not: Test datadaki değerleri kullanınız.
​
​
    Test Data:
    [1232, 1134,2345,1022]
    [Java, Python, PHP, C#, C Programming, C++]
​
    Beklenen Çıktı:
    [1022,1134,1232,2345]
    [C Programming, C#, C++, Java, PHP, Python]
     */

    public static void main(String[] args) {

        int data[] = {1232, 1134,2345,1022};
        String data2[]={"Java", "Python", "PHP", "C#", "C Programming","C++"};
        Arrays.sort(data);
        Arrays.sort(data2);
        System.out.println(Arrays.toString(data));
        System.out.println(Arrays.toString(data2));
    }
}
