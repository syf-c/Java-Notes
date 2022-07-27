package Day32_StringBuilder;

public class C05_indexOf_LastIndexOf {
    public static void main(String[] args) {
        
        StringBuilder sb = new StringBuilder("Pay attention Please");

        System.out.println(sb.indexOf("Pay"));  //0
        System.out.println(sb);   // Pay attentions Please

        System.out.println( sb.indexOf("e")); // 7
        System.out.println( sb.indexOf("e", 10)); // 16 10uncu indexten sonraki e yi buldu

        System.out.println( sb.lastIndexOf("e")); //19

        System.out.println( sb.lastIndexOf("e",10)); //7 sondan baslayarak 10uncu indexe geldi ve sonraki e yi buldu



    }
}
