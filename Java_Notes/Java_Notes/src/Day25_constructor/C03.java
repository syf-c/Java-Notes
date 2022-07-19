package Day25_constructor;

public class C03 {
    /*
proje olustururken bazi class' lar run etmek icin degil
variable ve method olusturup
bunlari baska class lardan kullanmak icin olusturulur

*/
    /*
    Default constructor parametresizdir goremesek bile
     ihtiyac oldugunda calisir

     Class icerissinde parametreli veya parametresiz
     herhangi bir constructor olusturursak java default constructor'i siler
     */

    C03(){

     }
    /*
    olusturdugumuz parametresiz bu cmonstructor default constructor ile 1-1 aynidir
    ama biz olusturdugumuz icin buna default constructor demeyiz
    parametresiz constructor deriz.
     */
    String isim="Etka";

    public void method(){
        System.out.println("C03 method calisti");
    }


}
