package Day11_StringManipulations;

public class C01_indexOf {
    public static void main(String[] args) {

        String str = "Java ogrenmek cok guzel";
        /*
        Verilen bir String'de herhangi bir string veya char in ilk kulllanildigi index i bize verir
         */

        System.out.println(str.indexOf('g')); // 6
        System.out.println(str.indexOf('r'));  //7
        System.out.println(str.indexOf("j"));  // -1

        System.out.println(str.indexOf("mek")); // 10 ilk harfin index'ini verir

        //eger istedigimiz indexten sonrasini kontrol etmek istersek
        // o zaman ayni metodu iki parametreli olarak kullanilabilir

        System.out.println(str.indexOf("g",(6+1))); // yazilan indexten baslar

        // yukardaki str da 2. ve 3. e'nin indexini bul
        //2. inci e'yi bulabilmek icin birinci e'nin index'ine ihtiyacim vardir

       int ilk_e = str.indexOf("e");
       int ikinci_e = str.indexOf("e", ilk_e+1);

       if (ikinci_e ==-1){
           System.out.println("verilen str'da ikinci e yok");
       }else {
           int ucuncu_e = str.indexOf("e",ikinci_e+1);
           if (ucuncu_e==-1){
               System.out.println("verilen str'da 3.e yok");
           }else{
               System.out.println("verilen str'daki 3.e " +ucuncu_e +"'inci indextedir");
           }
       }


     }
}
