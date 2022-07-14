package Day21_Arrays;

public class C01_MaxSayiBul_Tekrar {
    public static void main(String[] args) {

        int[] sayilar = {3, 5, 7, 1, 4, 9, 55, 2};

        maxSayi(sayilar);

    }

    private static void maxSayi(int[] sayilar) {
        int maxsayi = sayilar[0];
        for (int i = 0; i < sayilar.length; i++) {
            if (maxsayi < sayilar[i]) {
                maxsayi = sayilar[i];
            }

        }
        System.out.println("Sayilar icindeki en buyuk sayi : "+maxsayi);
    }
}


