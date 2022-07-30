package Day35_inheritanceda_Constructor;

public class A_GrandParent {
    protected String isim="Grandpa ismi belirtilmedi";
    /*
    Her class da gorunmese bile bir constructor vardir
    bu classdan obje olusturmak istedigimizde default constructor devreye girecektir

    default constructor'i gozlemleyemeyecegimiz icin
    onun yerine parametresiz constructor olusturalim
     */
    protected String grandpaKlupAdi = "Grandpa klubu";

    public A_GrandParent() {
        System.out.println("Grandpa constructor calisti");
    }
}
