public class QA08_TerstenYaz {
    /*
     8----
     Girilen String değerde tersten yazan Java kodunu yazınız.

    Test Data:
    java
    avaj
     */
    public static void main(String[] args) {
        String str="java is fun";
        String sonuc="";
        for (int i = str.length()-1; i >=0 ; i--) {
            sonuc+=str.charAt(i);
        }
        System.out.println(sonuc);
    }
}
