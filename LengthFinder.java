// LengthFinder class to find the length of a string without using the length method
import java.util.Scanner;

class LengthFinder {
    
    // Method to find string length without using length() method
    public static int findLength(String input) {
        int count = 0;
        try {
            while (true) {
                input.charAt(count);
                count++;
            }
        } catch (StringIndexOutOfBoundsException e) {
            return count;
        }
    }

    public static void main(String[] args) {
        // Scanner object to take input
        Scanner scan = new Scanner(System.in);
        
        // Taking user input
        System.out.print("Enter a string: "); // hello
        String input = scan.next();
        
        // Finding the length
        int length = findLength(input);
        
        // Displaying the result
        System.out.println("Calculated Length: " + length); // 5
        System.out.println("Actual Length using length(): " + input.length());	// 5
        
        scan.close(); // Closing scanner object
    }
}