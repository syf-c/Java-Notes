package Day18_Do_WhileLoop;

public class Harf_iceriyor_Mu {
    public static void main(String[] args) {
        String sifre ="Musa";
        String sonuc ="";

        for (int i = 0; i <=sifre.length() ; i++) {
            sonuc=sifre.substring(i,i+1)+"";
            if(sonuc.charAt(i)>='A'&& sonuc.charAt(i)<='Z'){
                System.out.println("basarili");
                break;
            }

            System.out.println("gerekli");
            break;
        }

        for (int i = sifre.length()-1; i >=0 ; i++) {
            sonuc=sifre.substring(i,i+1);
            if(sonuc.charAt(i)>='a'&& sonuc.charAt(i)<='z'){
                System.out.println("basarili");
            }
            System.out.println("gerekli");
            break;

        }


    }
}
