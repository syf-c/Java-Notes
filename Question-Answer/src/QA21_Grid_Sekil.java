public class QA21_Grid_Sekil {
    /*
    Aşağıdaki grid şeklini yazan Java Kodunu yazınız.

    Beklenen Çıktı:
     0  0  0  0  0  0  0  0  0  0
     0  0  0  0  0  0  0  0  0  0
     0  0  0  0  0  0  0  0  0  0
     0  0  0  0  0  0  0  0  0  0
     0  0  0  0  0  0  0  0  0  0
     0  0  0  0  0  0  0  0  0  0
     0  0  0  0  0  0  0  0  0  0
     0  0  0  0  0  0  0  0  0  0
     0  0  0  0  0  0  0  0  0  0
     0  0  0  0  0  0  0  0  0  0
     */
    public static void main(String[] args) {
        int sayi=10;
        for (int i = 0; i <sayi ; i++) {
            for (int j = 0; j <sayi ; j++) {
                System.out.print(0+"  ");
            }
            System.out.println(" ");

        }
    }
}
