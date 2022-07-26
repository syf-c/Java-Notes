package Day30_immutable_Date;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class C06_LocalDateTime {
    public static void main(String[] args) {
        LocalDateTime tarihSaat = LocalDateTime.now();
        System.out.println(tarihSaat); //2022-07-23T18:38:40.325925100

        System.out.println(tarihSaat.plusMonths(3).plusDays(3));// 2022-10-26T18:44:59.125236200 3 ay 3 gun sonra
    }
}
