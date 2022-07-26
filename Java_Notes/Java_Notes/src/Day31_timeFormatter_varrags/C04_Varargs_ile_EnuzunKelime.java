package Day31_timeFormatter_varrags;

public class C04_Varargs_ile_EnuzunKelime {
    public static void main(String[] args) {

        enUzunKelimeyiYazdir("Ali","Ayse","ismail");
    }

    public static void enUzunKelimeyiYazdir(String...kelime) {
        String enUzunKelime =kelime[0];
        for (String each:kelime){
            if (enUzunKelime.length()<each.length()){
                enUzunKelime=each;
            }
        }
        System.out.println("enUzunKelime = " + enUzunKelime);
    }
}
