package day8_practice;

public class Q09_SurviveMonkey {
    /*
		There is a lonely monkey in the island
		He needs to eat 4 bananas every day
		there are just 165 bananas in that island
		Create following variables and find how many days
		monkey can survive.
		Use do while loop, increment and decrement and if statements
		int numberOfBananas =165, survivalDays = 1;
		boolean monkeyAlive = true;
		*/
    public static void main(String[] args) {
        int numberOfBananas =165,
                survivalDays = 0;
        boolean monkeyAlive = true;


        do {
            System.out.println("Maymunlar  gunde 4 muz ile hayatta kalabilir");
            numberOfBananas-=4;
            survivalDays++; //yasadigi gun sayisini 1 artirdik
            if (numberOfBananas<4){
                monkeyAlive=false; //maymun hayatta degil
                System.out.println("Bugun" +survivalDays + ". gun muz kalmadi, maymun sizlere omur");
            }else {
                System.out.println("Bugun "+ survivalDays+". gun maymun hala hayatta ");
            }


        }while(monkeyAlive);
        System.out.println("Maymunun yasadigi gun sayisi : "+survivalDays);

    }
}
