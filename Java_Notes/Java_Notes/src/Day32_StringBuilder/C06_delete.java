package Day32_StringBuilder;

public class C06_delete {
    public static void main(String[] args) {

        StringBuilder sb=new StringBuilder("Java her zaman guzel");
        System.out.println(sb.delete(8,9));//Java herzaman guzel

        sb.deleteCharAt(8);
        System.out.println(  sb.deleteCharAt(8));//Java herman guzel

        //Bastan baslayarak her loopda ilk harfi silip oyle yazdiralim

        int son=sb.length();
        for (int i = 0; i <son ; i++) {
            sb.deleteCharAt(0);
            System.out.println(sb);
        }

    }
}
