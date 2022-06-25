package Day12_StringManipulations;

public class C02_ReplaceAll {
    public static void main(String[] args) {
        String str = "1Bu2gu3n Ja*va- cok g3uz/el";

        //str i "Bugun Java cok guzel" haline getirelim
        // replaceAll deki all'in amaci ayni ozellikteki tum karakterleri kapsamasidir
        //butun sayilari sil
        //butun ozel karakterleri sil

        //tum ozel karakterlerin silelim dedigimizde space'ler de siliniyor
        // space'leri korumak icin en basta onlarin yerine cumlede bulunmayacak
        // bir sitring koyalim

        str = str.replaceAll(" ", "azerty"); //1Bu2gu3nazertyJa*va-azertycokazertyg3uz/el
        System.out.println(str);
        str = str.replaceAll("\\W",""); //harf veya rakam olmayan herseyi siler
        System.out.println(str); //  1Bu2gu3nJavacokg3uzel

        str =str.replaceAll("\\d","");  //BugunazertyJavaazertycokazertyguzel
        System.out.println(str);

        str= str.replaceAll("azerty", " "); //Bugun Java cok guzel
        System.out.println(str);





    }
}
