package Day15_Overloading_Forloop;

public class C02_Overloading {
    public static void main(String[] args) {
        /*
        Javada olusturdugumuz metodlarin yaptigi islerle uyumlu olmasini isteriz
        mesela bir stringin bir bolumunu almal icin java 2 adet substring() methodu
        veya verilen stringdeki bazi parcalari degisstirmek icin replace() methodu var

        java ayni isimde birden fazla method varsa hangisinin kullanilacagina
        parametre sayisi veya parametre data turune gore karak verir
          */

        String str ="Java ogrenilecek, baska yolu yok";
        str.substring(2);
        str.substring(2,4);

        str.replace('c','v');
        str.replace("J","H");
      //  str.replace(5,8); boyle birsey olmaz replacein hangi data turunu aldigina dikkat etmek gerekiyor

        /*
        ayni isimde ama farkli methodlari olusturmak icin degistirebilecegimiz seyler
         1-parametre sayisi
         2-ayni sayida parametreye sahip olsa bile parametrelerin data turleri
         3-aynni sayida ve ayni data turunde parametreleri olan methodlarda
         parametre sayisi siralanisi


         */
    }
}
