package Day11_StringManipulations;

public class ReplaceAndReplaceAll_example {
    public static void main(String[] args) {
        String str="Java'da rakamlar @ 1234567899";

        System.out.println(str.replaceAll("a","*"));
        System.out.println(str.replaceAll("\\s", "*"));  //bosluklari * cevirir
        System.out.println(str.replaceAll("\\S", "*"));   //bosluk haricindekileri * cevirdi
        System.out.println(str.replaceAll("\\w" , "*"));  //rakamlar ve harfleri * cevirdi
        System.out.println(str.replaceAll("\\W","*"));    //rakamlar ve harfler disindakileri * cevirdi
        System.out.println(str.replaceAll("\\d","*"));    //sadece rakamlari * cevirir
        System.out.println(str.replaceAll("\\D","*"));    //rakamlar disindaki herseyi * cevirdi
    }
}
