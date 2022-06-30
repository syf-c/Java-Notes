package Day14_methodCreation;

public class C04_MethodCreationReturn {
    //verilen isim ve soyismi ilk harfi buyuk
    // geriye kalanlari * olacak sekilde degistirip bize bu halini donduren bir methot olusturun
    // programin ilerleyen kisimlarinda isim ve soyismi bu E*** B****** sekilde kullanmak istiyoruz

    public static void main(String[] args) {
        String isim = "Enes";
        String soyIsim = "Bozkurt";

        String gizliIsim = isimgizle(isim,soyIsim);
        System.out.println(isim + " "+ soyIsim); //Enes Bozkurt
        System.out.println("gizliIsim = " + gizliIsim); //E*** B******
    }

    public static String isimgizle(String isim, String soyIsim) {
        isim =isim.substring(0,1).toUpperCase()+isim.substring(1).replaceAll("\\w","*");
        soyIsim =soyIsim.substring(0,1).toUpperCase()+soyIsim.substring(1).replaceAll("\\w","*");
        return isim+" "+soyIsim;
    }
}
