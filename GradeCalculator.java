import java.util.Scanner;
public class GradeCalculator
{
    public static char calculateGrade(double averagePercentage)
    {
        if (averagePercentage >= 90)
        {
            return 'A';
        }
        else if (averagePercentage >= 80)
        {
            return 'B';
        }
        else if (averagePercentage >= 70)
        {
            return 'C';
        }
        else if (averagePercentage >= 60)
        {
            return 'D';
        }
        else{
            return 'F';
        }
    }

    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of subjects: ");
        int subjects = scanner.nextInt();
        double[] marks = new double[subjects];

        for (int i = 0; i < subjects; i++)
        {
            System.out.print("Enter marks obtained in subject " + (i + 1) + "(out of 100)");
            marks[i] = scanner.nextDouble();
        }

        double totalMarks = 0;
        for (double mark : marks)
        {
            totalMarks += mark;
        }

        double averagePercentage = (totalMarks / (subjects * 100)) * 100;
        char grade = calculateGrade(averagePercentage);

        System.out.println("\n--- Results ---");
        System.out.printf("Total Marks: %.2f%n", totalMarks);
        System.out.printf("Average Percentage: %.2f%%%n", averagePercentage);
        System.out.printf("Grade: " + grade);

        scanner.close();

   }
}