package replit.List;

import java.util.Arrays;

public class Soru01_enfazlaolan_Karakter {
    /*
    Kullanıcıdan girdi olarak bir Dize almak için bir Java programı yazın ve bu dizede oluşan maksimum karakteri bulun. (Büyük/küçük harf duyarlılığını yoksay)

    giriş:

    Java öğrenmek kolaydır

    çıktı:

    oluşan maksimum karakter: a
     */
    public static void main(String[] args) {
        String input="Learning java is easy";
        input=input.replace(" ","");

        //   System.out.println(input);
        String[] array = input.split("");
      //  System.out.println(Arrays.toString(array));
        Arrays.sort(array);
        int sayac=0;
        int max=0;
        String maxKarakter="";
        for (int i = 0; i <array.length ; i++) {
            for (int j =0; j <array.length ; j++) {
                if (array[i].equalsIgnoreCase(array[j])) {
                    sayac++;
                }

            }if (sayac>max){
                max=sayac;
                maxKarakter=array[i];
                sayac=0;
            }else{
                sayac=0;
            }
        }
        System.out.println(maxKarakter);





    }
}
