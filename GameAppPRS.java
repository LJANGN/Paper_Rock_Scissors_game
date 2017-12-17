import java.util.Random;
import java.util.Scanner;

public class GameAppPRS {

	public static void main(String[] args) {

		
		System.out.println("Choose 1 = paper, 2 = rock or 3 = scissors");
	
		Scanner scan = new Scanner(System.in);
		Random rand = new Random();

		int choose = scan.nextInt();
		int randomNr = rand.nextInt(3) + 1;
		
		if (randomNr == 1 && choose == 1) {
			System.out.println("You chose paper, Computer chooses paper");
			System.out.println("It's a tie");
		}

		else if (randomNr == 1 && choose == 2) {
			System.out.println("You chose rock, Computer chooses paper");
			System.out.println("Computer wins!");
		}

		else if (randomNr == 1 && choose == 3) {
			System.out.println("You chose scissors, Computer chooses paper");
			System.out.println("You win!");
		}
		
		if (randomNr == 2 && choose == 1) {
			System.out.println("You chose paper, Computer chooses rock");
			System.out.println("You win!");
		}

		else if (randomNr == 2 && choose == 2) {
			System.out.println("You chose rock, Computer chooses rock");
			System.out.println("It's a tie!");
		}

		else if (randomNr == 2 && choose == 3) {
			System.out.println("You chose scissors, Computer chooses rock");
			System.out.println("Computer wins!");
		}
		
		if (randomNr == 3 && choose == 1) {
			System.out.println("You chose paper, Computer chooses scissors");
			System.out.println("Computer wins!");
		}

		else if (randomNr == 3 && choose == 2) {
			System.out.println("You chose rock, Computer chooses scissors");
			System.out.println("You win!");
		}

		else if (randomNr == 3 && choose == 3) {
			System.out.println("You chose scissors, Computer chooses scissors");
			System.out.println("It's a tie!");
		}
	}

}
