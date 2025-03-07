import java.util.Scanner;

public class ReplaceWord {
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Prompt user to enter a sentence
        System.out.print("Enter a sentence: ");
        String sentence = scanner.nextLine();

        // Prompt user to enter the word to be replaced
        System.out.print("Enter the word to replace: ");
        String oldWord = scanner.next();

        // Prompt user to enter the replacement word
        System.out.print("Enter the replacement word: ");
        String newWord = scanner.next();

        // Replace the word in the sentence
        String modifiedSentence = replaceWord(sentence, oldWord, newWord);

        // Display the modified sentence
        System.out.println("Modified Sentence: " + modifiedSentence);

        // Close the scanner
        scanner.close();
    }

    // Method to replace a word in a sentence with another word

    public static String replaceWord(String sentence, String oldWord, String newWord) {
        // Use the replaceAll method to replace the word
        return sentence.replaceAll("\\b" + oldWord + "\\b", newWord);
    }
}
/*
Enter a sentence: this is a sentence
Enter the word to replace: is
Enter the replacement word: was
Modified Sentence: this was a sentence
*/