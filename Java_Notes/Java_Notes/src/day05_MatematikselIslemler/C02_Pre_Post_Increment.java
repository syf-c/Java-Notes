package day05_MatematikselIslemler;

public class C02_Pre_Post_Increment {
    public static void main(String[] args) {
        int sayi= 10;

        System.out.println("Pre increment :" + ++sayi);

        System.out.println("Post increment :" + sayi++);

        System.out.println("Post incrementten sonra :" + sayi);
    }
}
