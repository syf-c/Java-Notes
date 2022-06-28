package day06_WrapperClasses;

public class day06_WrapperClasses {
    public static void main(String[] args) {
        // wrapper class javanin hazir methodlarine kullanabilmemiz
        //icin primitivve data turlerinin her biri icin actigi classlardir

        String str = "Java ogrenmek ne guzel";
        System.out.println(str.toUpperCase());

        boolean guzelMi = true;
        // guzelMi boolean primitive oldugundan hazir method bulunmyor

        Boolean buGuzelMi = true;
        buGuzelMi.toString();

        System.out.println(Short.MAX_VALUE);
        System.out.println(Short.MIN_VALUE);




    }
}
