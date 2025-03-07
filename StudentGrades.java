// StudentGrades class to take input marks of students and compute the percentage, and calculate the grade based on predefined criteria

import java.util.Random;

public class StudentGrades {
	
    public static void main(String[] args) {
        int students = 10; // Number of students
        int[][] scores = generateScores(students);
        String[][] results = calculateResults(scores);
        displayResults(results);
    }
    
    // Method to generate random scores for students in PCM subjects
    public static int[][] generateScores(int students) {
        Random random = new Random();
        int[][] scores = new int[students][3];
        for (int i = 0; i < students; i++) {
            for (int j = 0; j < 3; j++) {
                scores[i][j] = random.nextInt(100) + 1; // Random scores between 1 and 100
            }
        }
        return scores;
    }

    // Method to calculate total, average, and percentage
    public static String[][] calculateResults(int[][] scores) {
        String[][] results = new String[scores.length][5];
        for (int i = 0; i < scores.length; i++) {
            int total = scores[i][0] + scores[i][1] + scores[i][2];
            double average = total / 3.0;
            double percentage = Math.round(average * 100.0) / 100.0;
            String grade = calculateGrade(percentage);
            
            results[i][0] = String.valueOf(scores[i][0]); // Physics score
            results[i][1] = String.valueOf(scores[i][1]); // Chemistry score
            results[i][2] = String.valueOf(scores[i][2]); // Math score
            results[i][3] = String.valueOf(percentage);   // Percentage
            results[i][4] = grade;                        // Grade
        }
        return results;
    }

    // Method to calculate grade based on percentage
    public static String calculateGrade(double percentage) {
        if (percentage >= 80) return "A";
        else if (percentage >= 70) return "B";
        else if (percentage >= 60) return "C";
        else if (percentage >= 50) return "D";
        else if (percentage >= 40) return "E";
        else return "R"; // Remedial standards
    }

    // Method to display the student scorecard
    public static void displayResults(String[][] results) {
        System.out.println("Physics\tChemistry\tMath\tPercentage\tGrade");
        for (String[] student : results) {
            System.out.println(student[0] + "\t" + student[1] + "\t\t" + student[2] + "\t" + student[3] + "%\t\t" + student[4]);
        }
    }

}
