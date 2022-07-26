package Day30_immutable_Date;

import java.time.LocalDate;
import java.time.LocalTime;

public class C04_LocalTime {
    private static Thread Tread;

    public static void main(String[] args) throws InterruptedException {

        LocalTime time1 = LocalTime.now();
        System.out.println(time1);
        /*
        bizim olusturdugumuz date ve time canli saat veya tarih degildir LocalTime.now kullandigimizda
        o anki tarih ve saati alip bizim variable'imiza store eder
        time1 variable'in deger Sabittir
         */
      /*  Thread.sleep(3000);
        time1=LocalTime.now();
        System.out.println(time1);// uc saniye bekler ve yeni zamani yazar 18:28:44.082311200 18:28:47.085629100


       */
        System.out.println(time1.getSecond()); //suandaki saniye

        System.out.println(time1.plusSeconds(10000)); //10000 saniye sonrasini verir

        System.out.println(time1.minusMinutes(200)); //200 dakika once

        System.out.println(time1.withHour(3)); //saati 3 yaparak yazdi 03:35:13.366826200

    }
}
