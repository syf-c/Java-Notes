package Day16_Forloop;

public class C01_ForLoop {

    // verilen bir tam sayinin tam bolenlerini yazdiralim
    public static void main(String[] args) {
        int input = 20;
        for (int i = 1; i <= input; i++) {
            if (input % i == 0) {
                System.out.println(i + " ");
            }
        }
    }
}