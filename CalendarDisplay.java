// class CalendarDisplay to display a calendar for a given month and year
import java.util.Scanner;

public class CalendarDisplay {
	
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // User input for month and year
        System.out.print("Enter month (1-12): ");
        int month = scanner.nextInt() - 1; // Adjust to 0-based index

        System.out.print("Enter year: ");
        int year = scanner.nextInt();

        // Display the calendar
        displayCalendar(month, year);

        scanner.close();
    }

    // Array to store the names of the months
    static String[] months = {
        "January", "February", "March", "April", "May", "June",
        "July", "August", "September", "October", "November", "December"
    };

    // Array to store the number of days in each month
    static int[] daysInMonth = {
        31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31
    };

    // Method to check if a year is a leap year
    public static boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }

    // Method to get the number of days in a given month
    public static int getDaysInMonth(int month, int year) {
        if (month == 1 && isLeapYear(year)) { // February case
            return 29;
        }
        return daysInMonth[month];
    }

    // Method to get the first day of the month using Zeller’s Congruence Algorithm
    public static int getFirstDayOfMonth(int month, int year) {
        if (month < 2) { // Adjust for January and February
            month += 12;
            year--;
        }
        int y0 = year;
        int x = y0 + y0 / 4 - y0 / 100 + y0 / 400;
        int m0 = month;
        int d0 = (1 + x + (31 * m0) / 12) % 7; // 1 is the day (first of the month)
        return d0; // 0=Sunday, 1=Monday, ..., 6=Saturday
    }

    // Method to display the calendar
    public static void displayCalendar(int month, int year) {
        System.out.printf("\n\t%s %d\n", months[month], year);
        System.out.println("Sun Mon Tue Wed Thu Fri Sat");

        int days = getDaysInMonth(month, year);
        int firstDay = getFirstDayOfMonth(month, year);

        // Print leading spaces
        for (int i = 0; i < firstDay; i++) {
            System.out.print("    ");
        }

        // Print the days of the month
        for (int day = 1; day <= days; day++) {
            System.out.printf("%3d ", day);
            if ((day + firstDay) % 7 == 0) { // Move to the next line after Saturday
                System.out.println();
            }
        }
        System.out.println(); // Newline after printing all days
    }
}

/*
Enter month (1-12): 11
Enter year: 2002

        November 2002
Sun Mon Tue Wed Thu Fri Sat
  1   2   3   4   5   6   7
  8   9  10  11  12  13  14
 15  16  17  18  19  20  21
 22  23  24  25  26  27  28
 29  30

*/