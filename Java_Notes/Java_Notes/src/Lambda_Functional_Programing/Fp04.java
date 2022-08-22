package Lambda_Functional_Programing;

import java.util.stream.IntStream;

public class Fp04 {
    public static void main(String[] args) {
        System.out.println(get7den100eToplam());
        System.out.println("2.yol :" + get7den100eToplam02());
        System.out.println("2 den 11 e kadar olan sayilarin carpimi : " + ikiden11ekadarcarpim());
        System.out.println("Fatoriel : " + factoriel(-20));

        System.out.println(verilenIkiCiftSayiArasindakiCiftSyailarinToplami(15, 1));
        System.out.println(ikiSayiArasindakiTumsayilarinRakamlarToplmai(11,5));

    }

    private static int get7den100eToplam() {
        return IntStream.range(7, 101).reduce(0, Math::addExact);
    }

    //2.yol
    private static int get7den100eToplam02() {
        return IntStream.rangeClosed(7, 100).reduce(Math::addExact).getAsInt();
    }

    //2) 2'den 11'e kadar integer değerlerinin çarpımını bulan bir method oluşturun.
    public static int ikiden11ekadarcarpim() {
        return IntStream.rangeClosed(2, 11).reduce(Math::multiplyExact).getAsInt();
    }

    //3) Verilen bir sayiya kadar olan sayilarin carpimi
    public static int factoriel(int x) {

       if (x >0) {
            return IntStream.rangeClosed(1, x).reduce(Math::multiplyExact).getAsInt();
        }
        System.out.println("0 dan buyuk bir sayi girmelisiniz");
        return 0;
    }
    //4) Verilen iki sayi arasindaki cift sayilarin toplamini bulan bir method olusturun .
    public static int verilenIkiCiftSayiArasindakiCiftSyailarinToplami(int x,int y) {
       int z=0;
        if (x>y){
            z=x; //swap yaptik
            x=y;
            y=z;
        }
        return IntStream.rangeClosed(x, y).filter(Utils::ciftElemaniSec).reduce(Math::addExact).getAsInt();
     //2.yol   return IntStream.rangeClosed(x, y).filter(Utils::ciftElemaniSec).sum();
    }
    //5) Verilen iki sayı arasındaki tüm sayıların rakamlarının toplamını hesaplayan bir method oluşturun.
    //  23 and 32 ==> 2+3  +  2+4  +  2+5  +  2+6  +  2+7  +   2+8  +   2+9  +   3+0  +   3+1  +   3+2 ==> 68
    public static int ikiSayiArasindakiTumsayilarinRakamlarToplmai(int x,int y){
        int z=0;
        if (x>y){
            z=x; //swap yaptik
            x=y;
            y=z;
        }
        return IntStream.rangeClosed(x,y).map(Utils::rakamlarToplaminiAl).sum();
    }

}
