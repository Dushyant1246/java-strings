import java.util.Scanner;

public class ToggleCase {
	// Mehtod to toggle case of every character of a string
    public static String toggleCase(String str) {
        StringBuilder toggled = new StringBuilder();
        
        for (char ch : str.toCharArray()) {
            if (Character.isUpperCase(ch)) {
                toggled.append(Character.toLowerCase(ch));
            } else if (Character.isLowerCase(ch)) {
                toggled.append(Character.toUpperCase(ch));
            } else {
                toggled.append(ch);
            }
        }
        
        return toggled.toString();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
		
		// Take user input
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();
        scanner.close();
        
		// find the toggled case string
        String result = toggleCase(input);
		
		// Display the output
        System.out.println("Toggled case string: " + result);
    }
}
/*
Enter a string: Hello Welcome
Toggled case string: hELLO wELCOME
*/
