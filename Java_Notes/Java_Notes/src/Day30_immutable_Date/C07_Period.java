package Day30_immutable_Date;

import java.time.LocalDate;
import java.time.Period;

public class C07_Period {
    public static void main(String[] args) {


        // iki tarih arasindaki sureyi bulma

        LocalDate tarih1 = LocalDate.of(1989,12,12);
        LocalDate bugun = LocalDate.now();

        Period period = Period.between(tarih1, bugun);
        System.out.println(period); //P32Y7M11D 32 yil 7 ay 11 gun olmus

        System.out.println(period.getYears()); // 32 yil
    }
}
