package Day17_NestedForLoop;

public class C07_WhileLoop {
    public static void main(String[] args) {
        //20 den 50 ye kadar cift sayilari yazdiralim
        int bas=20;
        int son=50;
        for (int i = 20; i <=50 ; i++) {
            if (i%2==0){
                System.out.println(i);
            }
        }
        int temp=bas;
        while (temp<=son) {
            if(temp%2==0){
                System.out.println("temp"+temp);
            }
            temp++;
        }

    }
}
