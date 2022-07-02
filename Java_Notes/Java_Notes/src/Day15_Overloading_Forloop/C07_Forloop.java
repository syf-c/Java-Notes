package Day15_Overloading_Forloop;

public class C07_Forloop {
    public static void main(String[] args) {
        //100 den 1'e kadar 8 ile bolunebilen sayilari yazdirin
        for (int i = 100; i >=1 ; i--) {
            if(i%8==0){
                System.out.println(i + " sayisi 8 ile tam bolunur");
            }


        }
    }
}
