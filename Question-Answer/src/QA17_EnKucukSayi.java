public class QA17_EnKucukSayi {
    /*
    Üç sayı arasındaki en küçük sayıyı bulmak için bir Java METHOD yazın.
​
    Test data:
    12,24,34
​
    Beklenen Çıktı:
    12
     */
    public static void main(String[] args) {
        int a=20;
        int b=35;
        int c= 25;
        if(a<b || a<c){
            if(a==b){
                System.out.println("a ve b esit sayilardir ve en kucuklerdir");
            }else if(a==c) {
                System.out.println("a ve c esit sayilardir ve en kucuklerdir");
            }else {
                System.out.println("En kucuk sayi 'a'");
            }

        }else if(b<a || b<c){
            if(b==a){
                System.out.println("a ve b esit sayilardir ve en kucuklerdir");
            }else if(b==c) {
                System.out.println("b ve c esit sayilardir ve en kucuklerdir");
            }else {
                System.out.println("En kucuk sayi 'b'");
            }

        }else if(c<a || c<b){
            if(c==a){
                System.out.println("a ve b esit sayilardir ve en kucuklerdir");
            }else if(c==b) {
                System.out.println("a ve c esit sayilardir ve en kucuklerdir");
            }else {
                System.out.println("En kucuk sayi 'c'");
            }

        }else {
            System.out.println("sayilarin ucu de esittir");
        }
    }
}
