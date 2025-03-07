// class RockPaperScissors to play the rock paper scissors game and display result
import java.util.Scanner;

class RockPaperScissors{
	
	public static void main(String[] args) {
		// Scanner object to take input from user
		Scanner scan = new Scanner(System.in);
		
		// Take input for number of games
		System.out.print("Enter number of games: ");
		int numberOfGames = scan.nextInt();
		
		// Variable to store the game results
		String[] gameResults = new String[numberOfGames];
		
		// Play the game for the number of games
		for (int i = 0 ; i < numberOfGames ; i++) {
			System.out.print("Enter your choice (rock, paper or scissors): " );
			String choice = scan.next();
			while(!choice.equalsIgnoreCase("rock") && !choice.equalsIgnoreCase("paper") && !choice.equalsIgnoreCase("scissors")) {
				System.out.println("Invalid Choice Enter again");
				System.out.print("Enter your choice (rock, paper or scissors): " );
				choice = scan.next();
			}
			gameResults[i] = isWinner(choice);
		}
		
		displayResults(gameResults);
	}
	
	// Mrthod to find average and percentage of wins
	public static String[][] getAveragePercentage(String[] results) {
		// Count user and computer total wins
		int userWins = 0, computerWins = 0;
		for (String outcome: results) {
			if (outcome.equals("WIN")) userWins++;
			else if (outcome.equals("LOSE")) computerWins++;
		}
		System.out.println("user" + userWins + "comp" + computerWins);
		
		// Caclulate averages and percentages
		double userAverage = (double) userWins / results.length;
		double computerAverage = (double) computerWins / results.length;
		double userPercentage = userAverage * 100;
		double computerPercentage = computerAverage * 100;
		return new String[][]{
			{"User average wins: ", userAverage + ""},
			{"Computer average wins: ", computerAverage + ""},
			{"User percentage wins: ", userPercentage + "%"},
			{"Computer percentage wins: ", computerPercentage + "%"}
		};
	}
	
	// Method to find if won or lost
	public static String isWinner(String choice) {
		choice = choice.toUpperCase();
		String computerChoice = getRandomChoice();
		System.out.println("Computer choice: " + computerChoice);
		if (choice.equals(computerChoice)) {
			return "DRAW";
		} else if ((choice.equals("ROCK") && computerChoice.equals("SCISSORS")) || (choice.equals("PAPER") && computerChoice.equals("ROCK")) || (choice.equals("SCISSORS") && computerChoice.equals("PAPER"))) {
			return "WIN";
		} else {
			return "LOSE";
		}
	}
	
	// Method to find random string from rock paper and scissors
	public static String getRandomChoice() {
		String[] choices = {"ROCK", "PAPER", "SCISSORS"};
		int randomIndex = (int) (Math.random() * 3);
		return choices[randomIndex];
	}
	
	// Method to display the results
	public static void displayResults(String[] results){
		System.out.println("Game No.\tResult");
		for (int i = 0 ; i < results.length ; i++) {
			System.out.println((i + 1) + "\t\t" + results[i]);
		}
		for (String[] row: getAveragePercentage(results)) {
			System.out.println(row[0] + row[1]);
		}
	}
}