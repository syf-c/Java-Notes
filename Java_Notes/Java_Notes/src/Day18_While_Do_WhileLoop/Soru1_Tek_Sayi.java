package Day18_While_Do_WhileLoop;

public class Soru1_Tek_Sayi {
    //While loop kullanarak 3 den 13 e kadar tum tek tamsayilari ekrana yazdiriniz

    public static void main(String[] args) {
        int bas=3;
        int bitis=13;
         int temp=bas;
         int sayilar=0;

        System.out.print(bas + " ile "+bitis +" arasindaki tek sayilar :");
        while(temp<=bitis){
            if(temp%2!=0){
                sayilar=temp;
                System.out.print(" "+sayilar);
            }
            temp++;
        }
    }
}
