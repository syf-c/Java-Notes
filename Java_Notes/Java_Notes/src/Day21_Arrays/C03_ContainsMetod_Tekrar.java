package Day21_Arrays;

import java.util.Scanner;

public class C03_ContainsMetod_Tekrar {
    // Soru 3- Kulanicidan aldiginiz bir ismin,verilen array’de olup olmadigini kontrol edip,
    // bize true veya false sonucu donen bir method olusturun.
    public static void main(String[] args) {
        String[] isimler ={"Basak","Nurullah","Fatih","Adem","Enes"};
        Scanner scan = new Scanner(System.in);
        System.out.println("Aramak istediginiz ismi giriniz :");
        String arananIsim=scan.nextLine();

        boolean sonuc = contains(isimler,arananIsim);
        System.out.println(sonuc);

    }

    private static boolean contains(String[] isimler,String arananIsim) {
        boolean sonuc=false;
        for (int i = 0; i <isimler.length; i++) {
           if (arananIsim.equalsIgnoreCase(isimler[i])){
               sonuc=true;
           }
        }
        return sonuc;
    }
}
