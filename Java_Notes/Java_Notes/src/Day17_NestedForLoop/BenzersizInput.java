package Day17_NestedForLoop;

public class BenzersizInput {
    public static void main(String[] args) {
        String input="Musa eve gel ama ev gel ";
        String DegisenInput = input.replaceAll("\\W", "");
        String kontainer = "";
        for (int i = 0; i < DegisenInput.length(); i++) {
            if(!kontainer.contains(DegisenInput.substring(i,i+1))){
                kontainer += DegisenInput.substring(i,i+1);
            }


        } System.out.println(kontainer);


    }
}
