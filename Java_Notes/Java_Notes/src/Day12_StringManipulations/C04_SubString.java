package Day12_StringManipulations;

public class C04_SubString {
    public static void main(String[] args) {


        String str = "java cok yasa";

        System.out.println(str.substring(3,4)); // 3denb basla 4 e kadar al  (4-3=1 karakter al)

        System.out.println(str.substring(6,6)); // ""  6 dan basla ama 6 dahil degil (6-6=0 karakter al)

        System.out.println("************************************");

       // System.out.println(str.substring(6,2)); // geriye dogru gidilmez "StringIndexOutOfBoundsException" hatasi verir

    }

}
