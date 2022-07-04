package replit;

public class Soru_12 {
    /*
    Ask user Name, Surname and credit card numbers than convert it to special form. (Initials for name and surname should be uppercase)
(Check credit card number, if there aren’t 16 digit print “Invalid credit card number”

Input :

John White 1234234534561478

Output :

Name : J*** W****

CCN : **** **** **** 1478
     */
    public static void main(String[] args) {
        String name="john";
        String surname="white";
        String kk="1234234534561478";

        name = name.substring(0,1).toUpperCase()+name.substring(1);
        surname = surname.substring(0,1).toUpperCase()+surname.substring(1);
        String str1=name.charAt(0)+name.replaceAll("\\D","*");
        String str2=surname.charAt(0)+surname.replaceAll("\\D","*");

        String str3=kk.substring(0,4)+" "+kk.substring(4,8)+" "+kk.substring(8,12)+" "+kk.substring(12);
        String str33 =str3.substring(0,15).replaceAll("\\S","*")+str3.substring(15);

        System.out.println(str1+" "+str2);
        System.out.println(str33);

    }
}

