package day7_practice;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Q05_ArrayList {

    /*  Rastgele kullanici adi olusturan JAVA kodu yaziniz.
     *  1. Kullanicidan ismini isteyelim
     *  2. Kullanici adindaki bosluklari silelim.
     *  3. Kullanici adinin alinabilir olup olmadigina bakalim.
     *  4. Eger bizim listemizde oyle bir kullanici adi yoksa kullanici adi, kullanicinin girdigi isim olsun.
     *  5. Eger bu kullanici adi zaten varsa, sonuna rastgele sayi olusturup ekleyelim, ve gosterelim.

     */
    public static void main(String[] args) {
        List<String> databaseIsim = new ArrayList<>();
        databaseIsim.add("Musa");
        databaseIsim.add("Enes");
        databaseIsim.add("Ismail");
        databaseIsim.add("Abdullah");
        databaseIsim.add("Emre");
        databaseIsim.add("Melisa");
        databaseIsim.add("Oguz");
        System.out.println(databaseIsim);

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your userName :");
        String userName=scan.nextLine().trim();

        boolean userNameVarMi = databaseIsim.contains(userName);

        if (userNameVarMi){
            System.out.println("bu kullanici adi alinmis");

        }else {
            System.out.println("Bu kullanici adinizi kullanabilirsiniz");
        }
        if(userNameVarMi){
            int randomSayi=new Random().nextInt(100);
            userName=userName+""+randomSayi;
            System.out.println("yeni kullanici adiniz "+userName);
            databaseIsim.add(userName);
            System.out.println(databaseIsim);
        }else {
            System.out.println("yeni kullanici adiniz : "+userName);
        }


    }
}
