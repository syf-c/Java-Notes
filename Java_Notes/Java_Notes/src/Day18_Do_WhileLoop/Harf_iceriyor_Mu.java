package Day18_Do_WhileLoop;

public class Harf_iceriyor_Mu {
    public static void main(String[] args) {
        String sifre ="Musa";
        String sonuc ="";

        for (int i = 0; i <sifre.length() ; i++) {
            sonuc=sifre.substring(i,i+1)+"";
            if(sonuc.charAt(0)>='A'&& sonuc.charAt(0)<='Z'){

                break;
            }

            System.out.println("gerekli");
            break;
        }

        for (int i = sifre.length()-1; i >=0 ; i++) {
            sonuc=sifre.substring(i,i+1);
            if(sonuc.charAt(sonuc.length()-1)>='a'&& sonuc.charAt(sonuc.length()-1)<='z'){

                break;
            }
            System.out.println("gerekli");
            break;

        }


    }
}
