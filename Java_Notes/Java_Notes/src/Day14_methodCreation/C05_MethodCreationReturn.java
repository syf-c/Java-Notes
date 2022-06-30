package Day14_methodCreation;

import java.util.Scanner;

public class C05_MethodCreationReturn {
    public static void main(String[] args) {
        //kullanicidan sehir ismini ve dogum tarihini alip
        //bunlari programda kullanacagimiz formatta bize donduren bir method olusturun
        // sehir ismini programimizda buyuk harf olarak,
        // tarihi ise 2022-06-30 seklinde kullanmak istiyoruz

        String sehir = sehirAl();
        String tarih = tarihAl();

        System.out.println("Girdiginiz sehir : " + sehir);
        System.out.println("Girdiginiz tarih : " +tarih);

    }

    public static String tarihAl() {
        String tarih ="";
        Scanner scan = new Scanner(System.in);
        System.out.println("yil giriniz");
        int yil = scan.nextInt();
        if(yil>1900 && yil<2100){
            tarih =yil +"-";
        }else {
            System.out.println("yil icin gecerli bir tarih yazmalisiniz(1900-2100)");
        }

        System.out.println("kacinci ay oldugunu yaziniz :");
        int ay =scan.nextInt();
        if(ay<=0 || ay>12){
            System.out.println("ay no 1-12 arasinda olmalidir");
        }else if(ay<10) {
            tarih = tarih +"0"+ay+"-";
        }else {
            tarih = tarih + ay +"-";
        }

        System.out.println("lutfen gunu giriniz :");
        int gun = scan.nextInt();
        if(gun<=0 || gun>30){
            System.out.println("lutfen 0-31 arasinda bir gun giriniz");
        }else if(gun<10){
            tarih = tarih+"0"+gun;
        }else{
            tarih = tarih +gun;
        }

        return tarih;
    }

    public static String sehirAl() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen sehir adi giriniz : ");
        String sehirAdi = scanner.nextLine().toUpperCase();
        return sehirAdi;
    }
}
