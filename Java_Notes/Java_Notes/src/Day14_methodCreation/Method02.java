package Day14_methodCreation;

public class Method02 {
    public static void main(String[] args) {
        int toplama = topla(3, 4);
        int cikarma = cikart(3, 4);
        int carpma = carp(3, 4);
        double bolme = bol(3, 4);
        System.out.println(toplama + "\n" + cikarma + "\n" +carpma+ "\n"+ bolme);
    }

    private static int bol(int a, int b) {
        return a / b;
    }

    private static int carp(int a, int b) {
        return a * b;
    }

    private static int cikart(int a, int b) {
        return a - b;

    }

    public static int topla(int a, int b) {
        return a + b;
    }

}
