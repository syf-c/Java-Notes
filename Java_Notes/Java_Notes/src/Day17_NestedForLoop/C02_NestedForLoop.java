package Day17_NestedForLoop;

public class C02_NestedForLoop {
    // verilen sayiya gore carpim tablosu olusturma

    public static void main(String[] args) {
        int input =5;
        for (int i = 1; i <=input ; i++) {
            for (int j =1; j <=input ; j++) {
                System.out.print(i*j + "");
            }
            System.out.println("");
        }
    }
}
