package Day18_WhileLoop;

public class Soru2_Ortak_Bolen {
    /*
    For loop ve While loop kullanarak 3 basamakli sayilardan 15,20 ve 90'a tam bolunebilen sayilari yazdirin
     */
    public static void main(String[] args) {
        for (int i =100; i <=999 ; i++) {
            while (i%15==0 &&i%20==0&&i%90==0){
                System.out.print(i +" ");
                i++;
            }
        }
    }
}
