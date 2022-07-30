package Day35_inheritanceda_Constructor;

public class B_Parent extends A_GrandParent {
    protected String isim= "Parent ismi belirtilmedi";

    protected String parentKlupAdi = "Parent klubu";

    B_Parent(){
        System.out.println("Parent constructor calisti");
    }
}
