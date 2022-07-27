package Day32_StringBuilder;

public class C08_replace {
    public static void main(String[] args) {


        StringBuilder sb = new StringBuilder("Calm down");

        System.out.println(sb.replace(5, 10, "up")); //Calm up

        System.out.println(sb.replace(4,5,"---"));  //Calm---up
        System.out.println(sb.replace(4,7," "));     //Calm up ---leri kaldirdik

        System.out.println(sb.replace(5, 7, "down")); //Calm down
    }
}