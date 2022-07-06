package Day17_NestedForLoop;

public class C04_NestedForLoop {
    //Verilen inputa gore yildizlardan olusan bir ucgen olusturun
    // input = 4; ise
      /*       *
               * *
               * * *
               * * * *
    */
    public static void main(String[] args) {
       int input =4;
        for (int i = 1; i <=input ; i++) {
            for (int j = 1; j <=i ; j++) {
                System.out.print(" * ");
            }
            System.out.println(" ");

        }
    }
}
