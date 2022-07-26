package Day31_timeFormatter_varrags;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class C01_Timeformatter {
    public static void main(String[] args) {

        LocalDateTime tarihSaat = LocalDateTime.now();
        System.out.println("ilk olusturulan tarih :"+tarihSaat);
        //ilk olusturulan tarih :2022-07-25T20:40:02.275595200

        DateTimeFormatter dtf1= DateTimeFormatter.ofPattern("dd/M/yy hh:mm"); //  25/7/22 08:44
        System.out.println(dtf1.format(tarihSaat));

        DateTimeFormatter dtf2= DateTimeFormatter.ofPattern("d/MMM/yyyy HH:mm"); // 25/juil./2022 20:45
        System.out.println(dtf2.format(tarihSaat));

        DateTimeFormatter dtf3= DateTimeFormatter.ofPattern("dd/MMMM/yyyy hh:mm a"); // 25/juillet/2022 08:47 PM
        System.out.println(dtf3.format(tarihSaat));



    }
}
