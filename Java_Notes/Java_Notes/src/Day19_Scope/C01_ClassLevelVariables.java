package Day19_Scope;

public class C01_ClassLevelVariables {
    /*class icerisinde heryerden kullanmak istediginiz variable'lari
    class level'da (Class' in icinde ama method ' larin disinda)
    genellikle class level variable'lar class' in basinda olusturulur (sart degil)

    class Level 'daki variable lar icin 2 scope vardin
            1- static variables (Class variable 'lari da denir)
            2- instance (static olmayan) variables (obje variable'i da denir)
     */

    int instSayi=20; //static olmayip class level'da oldugu icin instance variabledir


    public static void main(String[] args) {
    /* System. out. printin(instSayi) ;

    instance variables static olmadigi icin static klup'e uye main method' dan direk kullanamayiz
    instance variable larin diger adi object variable ' dir

    dolayisiyla obje olusturursaniz instance variable lari heryerden kullanabilirsiniz
    */
        C01_ClassLevelVariables obje1= new C01_ClassLevelVariables();
        System.out.println(obje1.instSayi);
        obje1.instSayi=30;
        System.out.println(obje1.instSayi);

        C01_ClassLevelVariables obje2= new C01_ClassLevelVariables();
        System.out.println(obje2.instSayi); //20
        obje2.instSayi=25;
        System.out.println(obje2.instSayi); //25

        C01_ClassLevelVariables obje3= new C01_ClassLevelVariables();
        System.out.println(obje3.instSayi); //20
        obje3.instSayi=28;
        System.out.println(obje3.instSayi); //28

        /*
        Her obje olustugunda instance (obje) variable degeri ilk degeri alir
         */


    }

    public static void StaticMethod(String[] args) {
        // System. out . printin (sayi) ;
    /*
    bir method'un icerisinde olusturulan variable,
    sadece o method'un icinden kullanilabilir
    (Local variables)

    instSayi=30;
    instance variable 'lara main method disindaki static method lardan da
    direk ulasamayiz
    obje olusturursak ulasabiliriz
     */
        C01_ClassLevelVariables obje4 = new C01_ClassLevelVariables();
        System.out.println(obje4.instSayi);

    }

    public void StaticOlmayanMethod(String[] args) {

    }
}
