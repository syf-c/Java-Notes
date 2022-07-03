package Day17_NestedForLoop;

public class Soru12 {
    //kullanicidan pozitif bir rakam gitmesini isteyin ve girilen rrakama gore asagidaki sekli cizdirin
   /* *
      **
      ***
      ****

    */
    public static void main(String[] args) {
        for (int i = 1; i <=5 ; i++) {
            for (int j = 1; j <=i ; j++) {
                System.out.print("***");
            }System.out.println("");
        }
    }
}
