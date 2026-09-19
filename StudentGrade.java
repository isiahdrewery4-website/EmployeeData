import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class StudentGrade {
    public static void main(String[] args) throws IOException {

        // Open the input file
        Scanner input = new Scanner(new FileReader("grades.txt"));

        // Open the output file
        PrintWriter output = new PrintWriter("gradeReport.txt");

        // Read first student
        String firstName = input.next();
        String lastName = input.next();
        double test1 = input.nextDouble();
        double test2 = input.nextDouble();
        double test3 = input.nextDouble();
        double test4 = input.nextDouble();
        double test5 = input.nextDouble();

        // Read second student
        String firstName1 = input.next();
        String lastName1 = input.next();
        double test11 = input.nextDouble();
        double test21 = input.nextDouble();
        double test31 = input.nextDouble();
        double test41 = input.nextDouble();
        double test51 = input.nextDouble();

        // Read third student
        String firstName2 = input.next();
        String lastName2 = input.next();
        double test12 = input.nextDouble();
        double test22 = input.nextDouble();
        double test32 = input.nextDouble();
        double test42 = input.nextDouble();
        double test52 = input.nextDouble();

        // Calculate the average
        double average = (test1 + test2 + test3 + test4 + test5) / 5;
        double average1 = (test11 + test21 + test31 + test41 + test51) / 5;
        double average2 = (test12 + test22 + test32 + test42 + test52) / 5;

        // Write information to the output file
        output.printf("%-20s %7s %7s %7s %7s %7s %9s%n",
                "Student", "Test1", "Test2", "Test3", "Test4", "Test5", "Average");

        output.printf("%-20s %7.0f %7.0f %7.0f %7.0f %7.0f %9.2f%n",
                firstName + " " + lastName, test1, test2, test3, test4, test5, average);

        output.printf("%-20s %7.0f %7.0f %7.0f %7.0f %7.0f %9.2f%n",
                firstName1 + " " + lastName1, test11, test21, test31, test41, test51, average1);

        output.printf("%-20s %7.0f %7.0f %7.0f %7.0f %7.0f %9.2f%n",
                firstName2 + " " + lastName2, test12, test22, test32, test42, test52, average2);

        // Close the files
        input.close();
        output.close();
    }
}