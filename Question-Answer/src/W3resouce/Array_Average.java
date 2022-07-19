package W3resouce;

public class Array_Average {
    /*
     Write a Java program to calculate the average value of array elements.
     */
    public static void main(String[] args) {
        int[] numbers = new int[]{20, 30, 25, 35, -16, 60, -100};
    double average=0;
    int sum=0;
        for (int i = 0; i < numbers.length ; i++) {
            sum +=numbers[i];
            average=sum/numbers.length;
        }
        System.out.println("average valu of the array element is : "+ average);
    }
}
