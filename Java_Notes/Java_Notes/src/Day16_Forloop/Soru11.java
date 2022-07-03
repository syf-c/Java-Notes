package Day16_Forloop;

import Day15_Overloading_Forloop.C08_Factoriel;

import java.util.Scanner;

public class Soru11 {
    //Kullanicidan 10'dan kkucuk bir tamsayi isteyin ve girrilen sayinin factorielini bulun (5!=5*4*3*2*1)
    public static void main(String[] args) {

     //   C08_Factoriel.factoriyeHesapla(5);
        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen 10 kucuk bir tamsayi giriniz");
        int sayi = scan.nextInt();
        factoriyelHesapla(sayi);

    }

    public static void factoriyelHesapla(int sayi) {
        int hesap =1;
        if(sayi==0){
            System.out.println("0!=1'dir");
        }else if(sayi<0){
            System.out.println("sifirdan kucuk sayilarin factorieli alinmaz");
        }else{
            for (int i = 1; i <=sayi ; i++) {
                hesap*=i;
            }
            System.out.println("!"+sayi+" = "+hesap);
        }

    }
}
