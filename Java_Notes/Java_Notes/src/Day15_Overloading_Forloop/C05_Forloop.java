package Day15_Overloading_Forloop;

public class C05_Forloop {
    public static void main(String[] args) {
        // 1 den 5 e kadar olan tam sayilari toplayin
        int toplam = 0;
        for (int i = 0; i <= 5; i++) {
            toplam += i;
            //  System.out.println("sayi " + i +" " + toplam);
        }
        System.out.println("toplam :" + toplam);

        //10 dahil 20 dahil aradaki sayilar toplami ?
        toplam = 0;
        for (int i = 10; i <= 20; i++) {
            toplam += i;
        }
        System.out.println("10 ile 120 arasindaki sayilar toplami : " + toplam);

        //30 dahil 50 dahil, aralarindaki cift sayilar toplami

        toplam = 0;
        for (int i = 30; i <= 50; i += 2) {
            toplam += i;
        }
        System.out.println("30 dahil 50 dahil, aralarindaki cift sayilar toplami : " + toplam);

        //2'inci yontem

        toplam = 0;
        for (int i = 30; i <= 50; i++) {
            if (i % 2 == 0) {
                toplam += i;
            }
        }
        System.out.println("30 dahil 50 dahil, aralarindaki cift sayilar toplami : " + toplam);

        //1500 ile 1600 arasindaki 7 ile bolunebilen sayilari toplayin

        toplam = 0;
        for (int i = 1500; i <=1600 ; i++) {
            if (i%7==0){
                toplam += i;
            }

        }
        System.out.println("1500 ile 1600 arasindaki 7 ile bolunebilen sayilari toplami : "+toplam);


    }
}
