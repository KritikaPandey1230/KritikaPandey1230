import java.util.Scanner;

public class avg {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to the Student Marks and Grade Calculator Interface!");

        
        System.out.print("Enter the number of subjects: ");
        int numSubjects = sc.nextInt();

        if (numSubjects <= 0) {
            System.out.println("Invalid number of subjects. Exiting the program.");
            return;
        }

       
        int totalMarks = 0;
        for (int i = 1; i <= numSubjects; i++) {
            System.out.print("Enter marks for subject " + i + " (0-100): ");
            int marks = sc.nextInt();
            while (marks < 0 || marks > 100) {
                System.out.println("Invalid marks! Please enter between 0 and 100.");
                marks = sc.nextInt();
            }
            totalMarks += marks;
        }

       
        float averagePercentage = (float) totalMarks / numSubjects;

       
        char grade;
        if (averagePercentage >= 90) {
            grade = 'A';
        } else if (averagePercentage >= 80) {
            grade = 'B';
        } else if (averagePercentage >= 70) {
            grade = 'C';
        } else if (averagePercentage >= 60) {
            grade = 'D';
        } else if (averagePercentage >= 50) {
            grade = 'E';
        } else {
            grade = 'F';
        }

      
        System.out.println("\n--- Results ---");
        System.out.println("Total Marks: " + totalMarks);
        System.out.printf("Average Percentage: %.2f%%\n", averagePercentage);
        System.out.println("Grade: " + grade);

        sc.close();
    }
}
