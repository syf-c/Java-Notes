public class QA08_TerstenYaz {
    /*
     8----
     Girilen String değerde tersten yazan Java kodunu yazınız.

    Test Data:
    java
    avaj
     */
    public static void main(String[] args) {
        String str="java";
        String sonuc="";
        for (int i = str.length()-1; i >=0 ; i--) {
            sonuc+=str.substring(i,i+1);
        }
        System.out.println(sonuc);
    }
}
