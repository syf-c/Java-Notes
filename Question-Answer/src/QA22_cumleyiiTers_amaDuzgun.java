import java.util.Arrays;

public class QA22_cumleyiiTers_amaDuzgun {
    /*
    Bir String değişkeni cümlesi verildiğinde, her sözcüğü almak için kod yazın ve tersine ters çevrilmiş String'e atayın.

    Test Data:
    sentence -> "Java is fun"
    reversed -> "fun is Java"
     */

    public static void main(String[] args) {
        String str="Java is fun .";
        str=str.replace(" ","azerty").replaceAll("\\W", "").replace("azerty", " ");

        String arr[]=str.split(" ");

        System.out.println(str);

        for (int i = arr.length-1; i >=0 ; i--) {
            System.out.print(arr[i]+" ");
        }



    }
}
