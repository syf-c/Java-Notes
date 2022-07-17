package Day23_ArrayList;

import java.util.ArrayList;
import java.util.List;

public class C02_set {
    /*
        elimizde urunlerin bulundugu bir liste var
        urun Listesindeki istenen siradaki urunu
        istegimiz yeni urunle degistirip
        eski urunu, varolan eski urunler listesine ekleyelim
     */
    public static void main(String[] args) {

        List<String> urunler = new ArrayList<>();
        urunler.add("Nutella");
        urunler.add("Ikram");
        urunler.add("Cekirdek");
        urunler.add("Cay");

        List<String> eskiUrunler = new ArrayList<>();
        //listeden ikram'in yerine biskrem koyalim
        //ikram'i da eski urunller listesine ekleyelim

        String yeniUrun="Biskrem";
        String silinecekUrun="Ikram";

        int temp=urunler.indexOf(silinecekUrun);
        silinecekUrun=urunler.set(temp,yeniUrun);

        eskiUrunler.add(silinecekUrun);

        System.out.println("urunler Listesi"+urunler);
        System.out.println("eski urunler listesi :"+ eskiUrunler);

        yeniUrun="Kahve";
        silinecekUrun="cay";

        temp=urunler.indexOf(silinecekUrun);
        silinecekUrun=urunler.set(temp,yeniUrun);

        eskiUrunler.add(silinecekUrun);

        System.out.println("urunler Listesi :"+ urunler);
        System.out.println("eski urunler listesi :"+ eskiUrunler);



    }
}