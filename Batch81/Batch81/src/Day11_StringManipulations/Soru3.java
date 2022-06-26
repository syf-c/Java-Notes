package Day11_StringManipulations;

import java.util.Scanner;

public class Soru3 {
    //Soru 1) Kullanicidan email adresini girmesini isteyin,
    // email "@gmail.com" icermiyorsa  "lutfen gmail adresi giriniz",
    // @gmail.com ile bitiyorsa  "Email adresiniz kaydedildi " ,
    // @gmail.com ile bitmiyorsa lutfen yazimi kontol edin yazdirin
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Email adresinizi giriniz");
        String email =scan.nextLine();

        if (!email.contains("@gmail.com")){
            System.out.println("lutfen gmail adresi giriniz");
        }else if(email.contains("@gamil.com")){
            System.out.println("Email adresiniz kaydedildi");
        }else{
            System.out.println("lutfen yazimi kontrol edin");
        }


    }
}
