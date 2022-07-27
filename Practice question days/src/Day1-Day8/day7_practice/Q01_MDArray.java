package day7_practice;

public class Q01_MDArray {

    /*
     * {{1,2,3}, {2,3,1} , {5,5,5} , {2,1,3}} int 2D arrayini  olustur
     *  2D arrayinden min number print et
     */
    public static void main(String[] args) {
        int[][] sayilar ={{1,2,3}, {2,3,1} , {5,5,5} , {2,1,3}};
        int enkucukSayi=sayilar[0][0];
        for (int i = 0; i <sayilar.length ; i++) {
            for (int j = 0; j <sayilar[i].length-1; j++) {
                if (sayilar[i][j]<enkucukSayi){
                   enkucukSayi=sayilar[i][j];
                }
            }
        } System.out.println("en kucuk sayi : "+enkucukSayi);
    }
}
