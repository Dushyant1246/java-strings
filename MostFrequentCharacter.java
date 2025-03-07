import java.util.Scanner;

public class MostFrequentCharacter {
    public static char findMostFrequentChar(String str) {
        int[] freq = new int[256]; // Assuming ASCII characters
        for (char c : str.toCharArray()) {
            freq[c]++;
        }

        char mostFrequent = str.charAt(0);
        int maxCount = 0;
        for (char c : str.toCharArray()) {
            if (freq[c] > maxCount) {
                maxCount = freq[c];
                mostFrequent = c;
            }
        }
        return mostFrequent;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String inputStr = scanner.nextLine();
        scanner.close();

        char mostFrequentChar = findMostFrequentChar(inputStr);
        System.out.println("Most Frequent Character: '" + mostFrequentChar + "'");
    }
}
/*
Enter a string: hello
Most Frequent Character: 'l'
*/