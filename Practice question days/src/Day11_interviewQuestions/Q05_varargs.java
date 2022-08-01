package Day11_interviewQuestions;

public class Q05_varargs {
    public static void main(String[] args) {
        /*
        normal toplama metodu ve varargs metodu yaziniz
         */

        int[] arr = {17,20,33,9,46,12,25};
       int toplam = arrTopla(arr);
      int toplam1 =  varargsToplaList(25,55,63,21,20);
        int toplam2 = varargsToplaArr(arr);
        System.out.println(toplam);
        System.out.println(toplam1);
        System.out.println(toplam2);
    }
    // varargs arr gibi danrandigi icin herhangi bir arrayi parametre olarak verebiliriz

    private static int varargsToplaArr(int[] arr) {
        int toplam = 0;
        for (int w : arr) {
            toplam +=w;
        }
        return toplam;
    }

    private static int varargsToplaList(int... i) {
        int toplam = 0;
        for (int w : i) {
            toplam +=w;
        }
        return toplam;
    }

    private static int arrTopla(int[] arr) {
        int toplam=0;
        for (int w : arr) {
            toplam +=w;
        }
        return toplam;
    }


}
