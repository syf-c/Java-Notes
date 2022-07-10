public class QA09_UcucaEkleme {
    /*
     farklı String'i  ucuca ekleyen Java Kodunu yazınız.

    Test Data:
    str1: Java is
    str2: fun

    Beklenen Çıktı:
    java is fun
     */

    public static void main(String[] args) {
        String str1 = "Java is";
        String str2 = "fun";

        System.out.println(str1.concat(" "+str2));
    }
}
