package day10_practice.okul_proje;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Giris1 {
    /* OgretmenBilgileri  Class’i olusturun bu Class’da bir Ogretmen icin
   gerekli
     bilgileri girebilecegim Instance Variable’lar olusturun
    * ve main method icinde bu variable’lara deger atayin
    * ve yazdirin
    *Not:Ornegin; 1 class, class icinde 1 tane static ve 1 tane de instance
    variable var.
    Bu class'dan 10 object olusturulursa 1 tane static variable ve 10 tane
    instance variable uretilmis demektir.
    */
    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("================================================");
        System.out.println("====== YILDIZ TEKNIK LISESINE HOS GELDINIZ =====");
        System.out.println("================================================");
        System.out.println();
        System.out.println("============OKULUMUZA HOSGELDINIZ===============");

        System.out.println("Adinizi giriniz : ");
        String isim = scan.nextLine();

        System.out.println("SoyAdinizi giriniz : ");
        String soyisim = scan.nextLine();

        System.out.println("Yasinizi giriniz : ");
        int yas = scan.nextInt();

       scan.nextLine(); //dummy hayalet komut

        System.out.println("Bransinizi giriniz : ");
        String brans = scan.nextLine();

        System.out.println("Telefon numaranizi giriniz : ");
        String tel = scan.nextLine();


        OgremenBilgileri1 adayOgretmen=new OgremenBilgileri1(isim,soyisim,yas,brans,tel);
        List<OgremenBilgileri1> ogretmenList = new ArrayList<>();
        ogretmenList.add(adayOgretmen);

        System.out.println(ogretmenList);

    }

}