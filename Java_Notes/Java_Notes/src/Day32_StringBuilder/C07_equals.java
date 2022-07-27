package Day32_StringBuilder;

public class C07_equals {
    public static void main(String[] args) {
        StringBuilder sb1 = new StringBuilder("Java");
        StringBuilder sb2 = new StringBuilder("Java");

        String str = "Java";
        System.out.println(sb1.equals(sb2)); //false
        System.out.println(sb1.equals(sb1)); //true
        //StringBuilder 'da equals metodu ancak kendisine esit olursa true doner
        //Stringdeki gibi dusunmemek lazim

        System.out.println(sb1.equals(str)); //false

        System.out.println(sb1.compareTo(sb2)); //0

        StringBuilder sb3 = new StringBuilder("Jave");

        System.out.println(sb1.compareTo(sb3)); //-4
        /*
        compareTo metodu iki stringBuilderi bastan baslayarak harf harf karsilastirir
        ilk harfler ayni ise,ikinciye ikinciler ayni ise ucunculere...
        ve ilk farkli harflere kadar gider farkli olan iki harfin ascii kodlari arasindaki farki verir

        eger hic farkli harf yoksa sonuc 0 dondurur
         */
    }

}
