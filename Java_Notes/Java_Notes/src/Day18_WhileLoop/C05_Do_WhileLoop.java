package Day18_WhileLoop;

public class C05_Do_WhileLoop {
    /*
    Soru 1) 9 dan 190 a kadar olan tum tamsayilari ekrana yazdirin
     */

    public static void main(String[] args) {
        int bas=9;
        int son=190;
        int temp=bas;

        //while lopp

        while (temp<son) {
            if(temp%7==0){
                System.out.print(temp+ " ");
            }
            temp++;
        }
        System.out.println("");
        temp=bas;
        do {
            if(temp%7==0){
                System.out.print(temp+ " ");
            }
            temp++;

        }while (temp<son);

    }

}
