package replit;


import java.util.Scanner;

public class Soru_15_LeapYear {
    // Write a Java program to find the number of days in a month.
    // (Use Switch Case) (Interview Question / Leak Year)

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input a month number: ");
        int month = scanner.nextInt();
        System.out.println("Input a year: ");
        int year = scanner.nextInt();


        switch (month) {
            case 1:
                System.out.println("January " + year + " has 31 days");
                break;
            case 2:
                if (artikYillar(year) == true) {
                    System.out.println("February " + year + " has 29 days");
                    break;
                } else
                    System.out.println("February " + year + " has 28 days");
                break;

            case 3:
                 System.out.println("March " + year + " has 31 days");
                break;
            case 4:
                System.out.println("April " + year + " has 30 days");
                break;
            case 5:
                System.out.println("May " + year + " has 31 days");
                break;
            case 6:
                System.out.println("June " + year + " has 30 days");
                break;
            case 7:
                System.out.println("July " + year + " has 31 days");
                break;
            case 8:
                System.out.println("August " + year + " has 31 days");
                break;
            case 9:
                System.out.println("September " + year + " has 30 days");
                break;
            case 10:
                System.out.println("October " + year + " has 31 days");
                break;
            case 11:
                System.out.println("November " + year + " has 30 days");
                break;
            case 12:
                System.out.println("December " + year + " has 31 days");
                break;
            default:
                System.out.println("Please Enter a valid month");
                break;
        }

    }

    private static boolean artikYillar(int year) {

        if (year % 4 == 0) {
            if (year % 100 != 0) {
                return true;

            } else if (year % 400 == 0) {

                return false;
            }
        } else {
            return false;
        }
        return false;
    }
}




/*
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

 */

