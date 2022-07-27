package replit.For_While;


import java.util.Scanner;

public class istenen_Karakter_Kac_tane {
    public static void main(String[] args) {
        /*
        Kullanıcıdan bir isim ve bir karakter girmesini isteyin, ardından isimdeki döngüleri kullanarak karakterin isimde kaç kez tekrarlandığını kontrol edin.

        Örneğin:

        char ch1= 'a' ;

        String name="John geç geldi"

        Beklenen Çıktı: a sayısı = 2

        */
        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen bir cumle giriniz");
        String name= scanner.nextLine();
        System.out.println("hangi karakteri bulmak istiyorsunuz");
        char istenen = scanner.next().charAt(0);
        //String name = "John came late";

      // char istenen = 'e';
        int sayac = 0;


            for (int i = 0; i < name.length(); i++) {
                if (name.charAt(i)==istenen){
                    sayac++;
                }
            }
        System.out.println(istenen+""+sayac);

    }

}


