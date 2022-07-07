package Day18_Do_WhileLoop;

public class Soru2_Harf_den_Harfe {
    /*
    'm' harfinden baslayarak 'c' harfine kadar olan tum harfleri yazdirin
     */
    public static void main(String[] args) {
        char ilkHarf='m';
        char sonHarf = 'c';

        String sonuc="";

        do {
                sonuc=ilkHarf+"";
                System.out.print(sonuc+ " ");
                ilkHarf--;

        }while (ilkHarf>=sonHarf);
    }

}
