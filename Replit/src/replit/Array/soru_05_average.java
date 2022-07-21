package replit.Array;

public class soru_05_average {
    public static void main(String[] args) {
        int[] input= {1,2,3,4,5,6,7};
        int sum=0;
        int average=0;
        for (int i = 0; i <input.length ; i++) {
            sum+= input[i];
            average=sum/input.length;
        }
        System.out.println(average);
    }
}
