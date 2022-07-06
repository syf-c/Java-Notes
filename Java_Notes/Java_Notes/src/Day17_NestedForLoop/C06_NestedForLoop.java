package Day17_NestedForLoop;

public class C06_NestedForLoop {
    public static void main(String[] args) {
         String input = "TURKIYEM";

        for (int i = 1; i <=input.length() ; i++) {
            for (int j = 1; j <=i ; j++) {
                System.out.print(input.substring(j-1,j)); //ilk harf icin substring(0,1) olmali
            }
            System.out.println(" ");
        }

        for (int i = input.length()-1; i >=1; i--) {
            for (int j =1; j <=i; j++) {
                System.out.print(input.substring(j-1,j)); //ilk harf icin substring(0,1) olmali
            }
            System.out.println(" ");
        }


    }

}
