import java.util.Scanner;

public class BasicRPS {

	public static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {

		// Get player move
		System.out.println("Select ROCK PAPER SCISSORS");
		String playerMove = input.next();
		String computerMove = "";

		// Invalid move
		while (!playerMove.equals("ROCK") && !playerMove.equals("PAPER") && !playerMove.equals("SCISSORS")) {
			System.out.println("Pick ROCK PAPER or SCISSORS");
			playerMove = input.next();
		}

		// Get computer move
		int random = (int) (Math.random() * 3) + 1;
		if (random == 1) {
			computerMove = "ROCK";
		} else if (random == 2) {
			computerMove = "PAPER";
		} else {
			computerMove = "SCISSORS";
		}

		// Win or lose
		if (computerMove.equals(playerMove))
			System.out.println("You and the computer both picked " + playerMove + ". So it's a tie!");
		else if (computerMove.equals("ROCK") && playerMove.equals("PAPER"))
			System.out.println("You picked PAPER and the computer picked ROCK. You win!");
		else if (computerMove.equals("ROCK") && playerMove.equals("SCISSORS"))
			System.out.println("You picked SCISSORS and the computer picked ROCK. You lose!");
		else if (computerMove.equals("PAPER") && playerMove.equals("SCISSORS"))
			System.out.println("You picked SCISSORS and the computer picked PAPER. You win!");
		else if (computerMove.equals("PAPER") && playerMove.equals("ROCK"))
			System.out.println("You picked ROCK and the computer picked PAPER. You lose!");
		else if (computerMove.equals("SCISSORS") && playerMove.equals("ROCK"))
			System.out.println("You picked ROCK and the computer picked SCISSORS. You win!");
		else
			System.out.println("You picked PAPER and the computer picked SCISSORS. You lose!");

	}
}