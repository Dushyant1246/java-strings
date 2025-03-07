// class BMICalculator to find and display BMI of 10 team members
import java.util.Scanner;

public class BMICalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[][] data = new double[10][2]; // Array to store weight and height
        String[][] results = new String[10][4]; // Array to store height, weight, BMI, and status

        // Taking user input
        for (int i = 0; i < 10; i++) {
            System.out.print("Enter weight (kg) for person " + (i + 1) + ": ");
            data[i][0] = scanner.nextDouble();

            System.out.print("Enter height (cm) for person " + (i + 1) + ": ");
            data[i][1] = scanner.nextDouble();
        }

        // Compute BMI and status
        calculateBMI(data, results);

        // Display the results
        displayResults(results);

        scanner.close();
    }

    // Method to calculate BMI and status
    public static void calculateBMI(double[][] data, String[][] results) {
        for (int i = 0; i < data.length; i++) {
            double weight = data[i][0];
            double heightInMeters = data[i][1] / 100; // Convert height to meters

            double bmi = weight / (heightInMeters * heightInMeters); // BMI formula
            String status = getBMIStatus(bmi);

            // Store results
            results[i][0] = String.format("%.2f", data[i][1]); // Height
            results[i][1] = String.format("%.2f", data[i][0]); // Weight
            results[i][2] = String.format("%.2f", bmi); // BMI
            results[i][3] = status; // Status
        }
    }

    // Method to determine BMI status
    public static String getBMIStatus(double bmi) {
        if (bmi < 18.5) {
            return "Underweight";
        } else if (bmi >= 18.5 && bmi <= 24.9) {
            return "Normal";
        } else if (bmi >= 25.0 && bmi <= 39.9) {
            return "Overweight";
        } else {
            return "Obese";
        }
    }

    // Method to display the results
    public static void displayResults(String[][] results) {
        System.out.printf("\n%-10s %-10s %-10s %-15s\n", "Height(cm)", "Weight(kg)", "BMI", "Status");
        System.out.println("------------------------------------------------");
        for (String[] result : results) {
            System.out.printf("%-10s %-10s %-10s %-15s\n", result[0], result[1], result[2], result[3]);
        }
    }
}

/*
Enter weight (kg) for person 1: 45
Enter height (cm) for person 1: 156
Enter weight (kg) for person 2: 50
Enter height (cm) for person 2: 203
Enter weight (kg) for person 3: 80
Enter height (cm) for person 3: 200
Enter weight (kg) for person 4: 40
Enter height (cm) for person 4: 200
Enter weight (kg) for person 5: 60
Enter height (cm) for person 5: 160
Enter weight (kg) for person 6: 45
Enter height (cm) for person 6: 145
Enter weight (kg) for person 7: 35
Enter height (cm) for person 7: 150
Enter weight (kg) for person 8: 40
Enter height (cm) for person 8: 190
Enter weight (kg) for person 9: 80
Enter height (cm) for person 9: 150
Enter weight (kg) for person 10: 60
Enter height (cm) for person 10: 180

Height(cm) Weight(kg) BMI        Status
------------------------------------------------
156.00     45.00      18.49      Underweight
203.00     50.00      12.13      Underweight
200.00     80.00      20.00      Normal
200.00     40.00      10.00      Underweight
160.00     60.00      23.44      Normal
145.00     45.00      21.40      Normal
150.00     35.00      15.56      Underweight
190.00     40.00      11.08      Underweight
150.00     80.00      35.56      Overweight
180.00     60.00      18.52      Normal

*/