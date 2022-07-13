package Print_F_;

public class PrinF_Market {
    /*
    urunler = Domates, biber, patlican, elma, armut
    miktartar= 1, 2, 3.5, 2.5,6
    birim fiyatlari=2.3, 2. 29, 4. 1, 2, 3
    satis fisi

    Urun      miktar    br_fiyat    urun_top
    ========================================
    Domates    1.00    € 2. 30      € 2.30
    Biber      2.00    € 2. 29      € 4.58
    Patlican   3.50    € 4. 10      € 14.35
    Armut      3. 50   € 2. 50      € 5. 00

    ========================================
    Genel toplam      15. 50kg      35. 566
     */
    public static void main(String[] args) {
        String urun[] = {"Domates","Biber","Patlican","Elma","Armut"};
        double br_fiyat[] = {2.3,2.29,4.1,2,3};
        double miktar[]={1,2,3.5,2.5,6};

        System.out.println("========================================");
        System.out.println("Urun       miktar    br_fiyat   urun_top");
        System.out.println("========================================");
        for (int i = 0; i < urun.length; i++) {
            System.out.printf("%-10s kg %05.2f    %05.2f    %05.2f\n",urun[i],miktar[i],br_fiyat[i],miktar[i]*br_fiyat[i]);

        }
        System.out.println("========================================");
        double  toplamBrimFiyati = 0;
        for (int i = 0; i <br_fiyat.length ; i++) {
            toplamBrimFiyati+=br_fiyat[i];
        }
        double  toplamOdenecekPara = 0;
        for (int i = 0; i <br_fiyat.length ; i++) {
            toplamOdenecekPara+=miktar[i];
        }
        System.out.printf(" Genel toplam    kg %05.2f     € %05.2f\n",toplamBrimFiyati,toplamOdenecekPara);
        System.out.println("========================================");


    }
}
