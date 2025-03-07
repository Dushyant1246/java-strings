// class StudentVoting to show if students can vote or not
import java.util.Random;
import java.util.Scanner;

public class StudentVoting {
	
    public static void main(String[] args) {
		// Scanner object to take input
        Scanner scanner = new Scanner(System.in);
        
        // Asking for the number of students
        System.out.print("Enter the number of students: ");
        int n = scanner.nextInt();
        
        // Generate random ages for students
        int[] ages = generateAges(n);
        
        // Check voting eligibility
        String[][] results = checkVotingEligibility(ages);
        
        // Display results
        displayResults(results);
        
        scanner.close();	// close the scanner
    }

    // Method to generate an array of random ages for n students
    public static int[] generateAges(int n) {
        Random rand = new Random();
        int[] ages = new int[n];
        for (int i = 0; i < n; i++) {
            ages[i] = rand.nextInt(90) + 10; // Generates a 2-digit age (10-99)
        }
        return ages;
    }

    // Method to determine voting eligibility and return a 2D array
    public static String[][] checkVotingEligibility(int[] ages) {
        String[][] results = new String[ages.length][2];
        
        for (int i = 0; i < ages.length; i++) {
            results[i][0] = String.valueOf(ages[i]); // Store age as string
            
            // Check eligibility
            if (ages[i] < 0) {
                results[i][1] = "Invalid Age";
            } else if (ages[i] >= 18) {
                results[i][1] = "Can Vote";
            } else {
                results[i][1] = "Cannot Vote";
            }
        }
        return results;
    }

    // Method to display the 2D array in tabular format
    public static void displayResults(String[][] results) {
        System.out.println("Age\tVoting Eligibility");
        for (String[] row : results) {
            System.out.println(row[0] + "\t" + row[1]);
        }
    }

}