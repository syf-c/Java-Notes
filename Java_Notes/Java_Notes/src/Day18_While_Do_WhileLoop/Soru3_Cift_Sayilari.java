package Day18_While_Do_WhileLoop;

public class Soru3_Cift_Sayilari {
    /*
    Kullanicidan baslangic ve bitis degerlerini alin.
    Baslangic degeri ve bitis degeri dahil aralarindaki tum cift tam sayilari While loop kullanarak
    ekrana yazdirin
     */
    public static void main(String[] args) {
        int bas=150;
        int bitis=180;
        int temp=bas;
        int temp2=bitis;
        System.out.print(bas + " ile "+ bitis +" arasindaki cift sayilari : ");


        while (temp<=temp2) {
            if (temp%2==0){
                System.out.print(temp+ " ");
            }
            temp++;
        }while (temp>=temp2) {
            if (temp%2==0){
                System.out.print(temp+ " ");
            }
            temp--;
        }

    }
}
