public class QA_24_ucgenDeseni {
    public static void main(String[] args) {
        int input = 5;

       for (int i = 1; i <= input; i++) {
            for (int j =input-i ; j >= 1; j--) {
                System.out.print("  ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            for (int j = 1; j <= i-1; j++) {
                System.out.print("* ");
            }
            System.out.println("");
        }
/*

        for (int i = input; i >= 1; i--) {
            for (int j =input-i ; j >= 1; j--) {
                System.out.print("  ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print(j+" ");
            }
            for (int j = 1; j <= i-1; j++) {
                System.out.print(j+" ");
            }
            System.out.println("");
        } */
    }
}