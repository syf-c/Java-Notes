package Day25_constructor;

public class C02_Constructor {
    public static void main(String[] args) {

        C01             obj1       =          new         C01()     ;
        // class adi     obje adi            keyword      constructor
        System.out.println(obj1.sayi); // 0
        obj1.deneme();//C01'den deneme method calisir
       // Scanner scan = new Scanner(System.in);
       // Random rnd= new Random();
      //  List<String> list= new ArrayList<>();

        /*
        Javada bir obje olusturabilmek icin
        mutlaka constructor kullanmalisiniz
         */
        System.out.println(obj1.sayi); // 0
        obj1.deneme(); // C01 den deneme method calisir

        //constructor= obje olusturmak icin kullanilan kod blogudur
        //
    }
}
