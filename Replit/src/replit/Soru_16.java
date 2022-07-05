package replit;

import java.util.Scanner;

public class Soru_16 {
    /*
    Ask user to type a name,
    the length of name should be 3.
    Then check if the name has same characters.
    If the String has same characters
    Print “String has duplicate characters” Else
    Print “String has unique characters”
    Please use ternary.

    Input :
    ala
    OutPut:
    String has duplicate characters
     */
    /*
    Kullanıcıdan bir ad yazmasını isteyin,
    adın uzunluğu 3 olmalıdır.
    Ardından, adın aynı karakterlere sahip olup olmadığını kontrol edin.
    Dize aynı karakterlere sahipse
    Yazdır “Dize çift karakterler içeriyor” Aksi takdirde
    Yazdır “Dizenin benzersiz karakterleri var”
    Lütfen üçlü kullanın.

    Giriş :
    ala
    Çıktı:
    Dize yinelenen karakterler içeriyor
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Bir ad giriniz");
        String ad=scan.next();

        if(ad.length()==3){
            if(ad.substring(0,1).equalsIgnoreCase(ad.substring(2))){
                System.out.println("String has duplicate characters");
            }else {
                System.out.println("String has unique characters");
            }
        }


    }
}
