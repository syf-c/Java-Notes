package replit;

import java.util.Scanner;

public class Soru_11 {
    /*
    Ask user to their weight and height and type a program with calculates mass index

        HINT : Body Mass Index = Weight (kg) / Square of height (m)
        Then give a message to user as following:

        If BMI is less than 18.5 , you re weak If BMI is between 18.5 and 25 ,
        your weight is ideal If BMI is between 25 and 30, you re fat If BMI is more than or equal to 30, obese

    EXAMPLE :

    INPUT:

    Weight : 71

    Height : 1,72

    OUTPUT :

Your BMI is : 23.99945916711736 Your weight is ideal
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen kilonuzu giriniz");
        double weight = scan.nextDouble();
        System.out.println("Lutfen boyunuzu giriniz");
        double height = scan.nextInt();
        height = height/100;

        double bodyMassIndex= (weight/(height*height));

        if(bodyMassIndex<18){
            System.out.println("Your BMI is " + bodyMassIndex +" You are weak");
        }else if(bodyMassIndex<25){
            System.out.println("Your BMI is " + bodyMassIndex +" your weight is ideal");
        }else if (bodyMassIndex<30){
            System.out.println("Your BMI is " + bodyMassIndex +" You are fat");
        }else{
            System.out.println("Your BMI is " + bodyMassIndex +" Obese");
        }

    }

}
