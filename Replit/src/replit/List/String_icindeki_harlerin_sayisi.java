package replit.List;

import java.util.Arrays;
import java.util.Scanner;

public class String_icindeki_harlerin_sayisi {
    /*
   Ask user to enter a name and a character, then check how many times the character is repeated in the name using loops in the name
e.g
char ch1='a'
String name ="John came late"
Expected Output=Number of a=2
Kullanıcıdan bir isim ve bir karakter girmesini isteyin,
 ardından isimdeki döngüleri kullanarak
  karakterin isimde kaç kez tekrarlandığını kontrol edin.
    */
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen bir string giriniz");
        String str=scan.nextLine();
        String arr[]=str.split("");
        System.out.println("arr=" + Arrays.toString(arr));
        //sort ile sıraliyorum
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        int sayac=0;
        //sayac olusturuyorum, cunku hangi harften kac tane oldugunu bu sayaca ekleyecegim
        for (int i = 1; i <arr.length ; i++) {
            if (arr[i-1].equals(arr[i])) {
                sayac++;
            }else{
                System.out.println(arr[i-1]+" sayisi "+(sayac+1));
                sayac=0;
            }if(i==arr.length-1){
                System.out.println(arr[i] +" sayisi " + (sayac+1));
            }
        }
    }
}

