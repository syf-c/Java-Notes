package Day30_immutable_Date;

import java.time.LocalDate;
import java.time.Month;


public class C03_Date {
    public static void main(String[] args) {
        LocalDate tarih = LocalDate.now();
        System.out.println(tarih);

        tarih.getDayOfYear();
        System.out.println(tarih.getDayOfYear()); //204 bugun yilin 204 uncu gunu
        System.out.println(tarih.getDayOfMonth()); // ayin 23 gunu
        System.out.println(tarih.getDayOfWeek());  //SATURDAY bugunun cumartesi oldugunu verir
        System.out.println(tarih.getMonthValue()); // 7 inci ay
        System.out.println(tarih.isLeapYear());     //bu sene artikyil mi false verdi

        LocalDate tarih2 = LocalDate.of(1991,12,12);
        System.out.println(tarih2);         //1991-12-12

        LocalDate tarih3 = LocalDate.of(1991, Month.DECEMBER,10);
        System.out.println(tarih3); //1991-12-10

        System.out.println(tarih.plusDays(100)); //100 gun sonra 2022-10-31 i olacak

        System.out.println(tarih.plusYears(5).plusMonths(3).plusDays(12));
        // 5 yil 3 ay 12 sonra tarih = 2027-11-04

        System.out.println(tarih.minusWeeks(20)); //20 hafta onceki tarih 2022-03-05
        System.out.println(tarih.minusDays(100).minusMonths(5));  //100 gun once 2021-11-14

        System.out.println(tarih.isAfter(tarih2)); // bizim tarihimiz diger tarihten sonra mi true


        // iki farkli dogum gunu girildiginde hangisinde doganin daha buyuk oldugunu bulunuz
        // tarih2 ve tarih3 icin bunu yapalim

        if (tarih2.isAfter(tarih3)){
            System.out.println(tarih3+" tarihinde dogan daha buyuk");
        }else if(tarih2.isBefore(tarih3)){
            System.out.println(tarih2  + " tarihde dogan daha kucuk");
        }else {
            System.out.println("iki tarih de ayni");
        }


    }
}
