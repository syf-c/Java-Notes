package Day32_StringBuilder;

public class C04_subSequence {
    public static void main(String[] args) {
        
        StringBuilder sb =new StringBuilder("Kayra");

        System.out.println(sb.substring(0, 3)); //Kay
        /*
        Bu metod string builder dondurdugu icin stringbuilder'in eski halini degistirmez
         */
        System.out.println("sb = " + sb); // Kayra !!! 

        System.out.println(sb.subSequence(0, 3)); //Kay
        System.out.println("sb = " + sb);   //Kayra

    }
}
