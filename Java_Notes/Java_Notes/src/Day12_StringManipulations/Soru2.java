package Day12_StringManipulations;

public class Soru2 {
    public static void main(String[] args) {
        String str1 = "$13.99";
        String str2 = "$10.55";
        str1 = str1.replace("$","");
        str2 = str2.replace("$","");

       double sonuc= Double.parseDouble(str1)+Double.parseDouble(str2);
       System.out.println(sonuc);



        str1 = str1.replace(".","azerty").replaceAll("\\W","")
                .replace("azerty",".");
        str2 = str2.replace(".","azerty").replaceAll("\\W","")
                .replace("azerty",".");


        double Sonuc2 = Double.parseDouble(str1)+Double.parseDouble(str2);
        System.out.println("Sonuc2 : " +Sonuc2);


    }
}
