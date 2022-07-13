package Print_F_;

public class PrintF_Kullanimi {
    public static void main(String[] args) {
        int sayi= 123;
        String str = "Ahmet Bulutluoz";
        double dob= 1.0205030456;

        System.out.printf("sayi : %-10d str : %-10.10S dob : %-7.3f", sayi,str,dob);
        // double aciklamasi
        // %- sonraki ilk "-" sola yaslamak icin kullaniliyor
        // %0 bastaki bosluklara sifri atamak icin kullaniliyor. Eger tire kullanirsa sola yasliyor ve sifir koyamiyoruz
        // %7 7 sayinin uzunlugunu belirliyor
        // %.3f sifirdan sonra 3 basamak gostermek icin

    }

}
