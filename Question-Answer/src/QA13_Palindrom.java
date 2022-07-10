public class QA13_Palindrom {
    /*
    Bir palindrom, madam veya racecar veya 10801 sayısı gibi ileriye doğru geriye doğru okuyan bir kelime, sayı, kelime öbeği veya diğer karakter dizisidir.
​
    Girilecek kelimenin palindrom olup olmadığını doğrulayacak bir Java Kodu yazın.
​
    Test Data:
    madam
​
    Beklenen Çıktı:
    True
     */
    public static void main(String[] args) {
        String cumle = "Madam";

        cumle=cumle.toLowerCase();
        String tersten ="";
        for (int i =cumle.length(); i >0 ; i--) {
            tersten +=cumle.substring(i-1,i);

        }System.out.println(tersten);
        if (cumle.equals(tersten)){
            System.out.println("True");
        }else {
            System.out.println("False");
        }
    }
}
