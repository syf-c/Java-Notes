package Day4_Practice;

public class Q01_MethodCreation {

    /*
        Problem tanımı :
        Bir String içindeki tüm karakterleri en fazla bir kez yazdıran parametreli bir method yazınız.
        Test Data:
        input: "aabbcccccddddaaa"
        output: abcd
     */
    public static void main(String[] args) {
        tekrarEden("aabbcccccdddddddddddddddd");
    }

    private static void tekrarEden(String input) {
        String container = "";

        for (int i =0; i <input.length(); i++) {
            if(!container.contains(input.substring(i,i+1))){
                container +=input.substring(i,i+1);
            }
        }
        System.out.println(container);

    }
}
