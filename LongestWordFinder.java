import java.util.Scanner;

public class LongestWordFinder {
	
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
		
		// Take input from user
        System.out.print("Enter a sentence: ");
        String sentence = scanner.nextLine();
        scanner.close();
        
		// find the longest word
        String longestWord = findLongestWord(sentence);
		
		// Display the result
        System.out.println("The longest word is: " + longestWord);
    }
	
	// Method to find largest word from a sentence
    public static String findLongestWord(String sentence) {
        String[] words = sentence.split(" "); // Split by whitespace
        String longestWord = "";
        
        for (String word : words) {
            if (word.length() > longestWord.length()) {
                longestWord = word;
            }
        }
        
        return longestWord;
    }
}
/*
Enter a sentence: this is a sentence
The longest word is: sentence
*/