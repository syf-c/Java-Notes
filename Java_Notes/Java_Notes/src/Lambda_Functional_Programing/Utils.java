package Lambda_Functional_Programing;

public class Utils {
    public static void ayniSatirdabosluklaYazdir(Object obj){
        System.out.print(obj+" ");
    }

    public static boolean ciftElemaniSec(Integer x){
       return x%2==0;
    }
    public static boolean tekElemaniSec(Integer x){
       return x%2!=0;
    }
    public static int karesiniAl(int x){
        return x*x;
    }
    public static int kupunuAl(int x){
        return x*x*x;
    }
    public static double yarisiniAl(int x){

        return x/2.0;

    }

    public static char sonKarakteriAl(String str){

        return str.charAt(str.length()-1);
    }

    public static char ilkKarakteriAl(String str){

        return str.charAt(0);
    }

    public static int rakamlarToplaminiAl(int sayi){
        int toplam=0;
        int rakam=0;
        while (sayi>0){
            rakam= sayi%10;
            toplam +=rakam;
            sayi/=10;
        }
        return toplam;
    }

}
