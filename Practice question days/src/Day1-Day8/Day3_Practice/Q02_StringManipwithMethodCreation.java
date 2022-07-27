package Day3_Practice;

public class Q02_StringManipwithMethodCreation {
    /*
     * girilen String icinde "xyz" dizimi var ise true degilse false return eden metod yaziniz
     *
     * input      output
     * axyzm  ==   true
     * xyz    ==   true
     * x.yz   ==   false
     * xyaz   ==   false
     */
    public static void main(String[] args) {


    String str="x.yz";
        System.out.println(searchList(str));
}

    private static boolean searchList(String str) {
        if(str.contains("xyz")){
            return true;
        }else {
            return false;
        }
    }
}