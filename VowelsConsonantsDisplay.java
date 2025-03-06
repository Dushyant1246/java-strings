// VowelsConsonantsDisplay class to display the vowels and consonants in a string
import java.util.Scanner;

class VowelsConsonantsDisplay {

    public static void main(String[] args) {
        // Scanner object to take user input
        Scanner scanner = new Scanner(System.in);

        // Taking user input
        System.out.print("Enter a string: ");	// this is a string
        String input = scanner.nextLine();

        displayVowelsConsonants(input);

        scanner.close(); // Closing the scanner object
    }

    // Method to check if a character is a vowel, consonant, or not a letter
    public static String checkCharacterType(char ch) {
        ch = Character.toLowerCase(ch); // Convert to lowercase for uniformity
        if (ch >= 'a' && ch <= 'z') {
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                return "Vowel";
            } else {
                return "Consonant";
            }
        }
        return "Not a letter";
    }

    // Method to get vowels and consonants along with their type in a string using charAt()
    public static String[][] getVowelsAndConsonants(String input) {
        String[][] result = new String[input.length()][2];

        for (int i = 0; i < input.length(); i++) {
            String type = checkCharacterType(input.charAt(i));
            result[i][0] = input.charAt(i) + "";
            result[i][1] = type;
        }
        return result;
    }
	
	// Method to Display vowels consonants and others
	public static void displayVowelsConsonants(String input) {
		String[][] result = getVowelsAndConsonants(input);
		System.out.println("Letter\tType");
		for (String[] row: result) {
			System.out.println(row[0] + "\t" + row[1]);
		}
	}

}
