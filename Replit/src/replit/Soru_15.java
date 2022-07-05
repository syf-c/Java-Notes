package replit;


public class Soru_15 {
    // Write a Java program to find the number of days in a month.
    // (Use Switch Case) (Interview Question / Leak Year)

    public static void main(String[] args) {

        System.out.println(artikYillar(1904));


    }


    private static String artikYillar(int year) {
        String son="";
        if (year % 4 == 0) {
            if (year % 100 != 0) {
               son +=year + " leap year";

            } else if (year % 400 == 0) {

                son +=year + "isn't leap year";
            }
        } else {
            son +=year + " isn't leap year";
        }
       return son;
    }
}
