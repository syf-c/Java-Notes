package Day31_timeFormatter_varrags;

public class C05_VarargsParametre_ile_Kullanma {
    public static void main(String[] args) {

        enUzunKelimeyiYazdir(5,"Ali","Ayse","ismail");
        /*
        Varargs teorik olarak sonsuz sayida element alabilir
        bir method da parametre olarak vrarags varsa
        varargs'in sinirlarini bilebilmesi icin
        parametrelerin sonuncusu olmalidir
        oncesinde farkli bir pamatre olabilir
         */
    }

    public static void enUzunKelimeyiYazdir(int kelimeSyaisi, String... kelime) {
        String enUzunKelime =kelime[0];
        for (String each:kelime){
            if (enUzunKelime.length()<each.length()){
                enUzunKelime=each;
            }
        }
        System.out.println("enUzunKelime = " + enUzunKelime);
    }
}

