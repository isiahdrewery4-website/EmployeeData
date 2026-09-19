import java.io.FileReader;
import java.io.PrintWriter;
import java.io.IOException;
import java.util.Scanner;

public class EmployeePay {
    public static void main(String[] args) throws IOException {

        // Open the input file
        Scanner input = new Scanner(new FileReader("employees.txt"));

        // Open the output file
        PrintWriter output = new PrintWriter("payroll.txt");

        // Read first employee
        String firstName = input.next();
        String lastName = input.next();
        double hourlyRate = input.nextDouble();
        double workhours = input.nextDouble();

        // Read second employee
        String firstName1 = input.next();
        String lastName1 = input.next();
        double hourlyRate1 = input.nextDouble();
        double workhours1 = input.nextDouble();

        // Read third employee
        String firstName2 = input.next();
        String lastName2 = input.next();
        double hourlyRate2 = input.nextDouble();
        double workhours2 = input.nextDouble();

        // Read fourth employee
        String firstName3 = input.next();
        String lastName3 = input.next();
        double hourlyRate3 = input.nextDouble();
        double workhours3 = input.nextDouble();

        // Calculate the gross pay
        double grosspay = hourlyRate * workhours;
        double grosspay1 = hourlyRate1 * workhours1;
        double grosspay2 = hourlyRate2 * workhours2;
        double grosspay3 = hourlyRate3 * workhours3;

        // Write information to the output file
        output.printf("%-20s %8s %8s %10s%n", "Employee", "Rate", "Hours", "Gross Pay");

        output.printf("%-20s %8.2f %8.1f %10.2f%n",
                firstName + " " + lastName, hourlyRate, workhours, grosspay);

        output.printf("%-20s %8.2f %8.1f %10.2f%n",
                firstName1 + " " + lastName1, hourlyRate1, workhours1, grosspay1);

        output.printf("%-20s %8.2f %8.1f %10.2f%n",
                firstName2 + " " + lastName2, hourlyRate2, workhours2, grosspay2);

        output.printf("%-20s %8.2f %8.1f %10.2f%n",
                firstName3 + " " + lastName3, hourlyRate3, workhours3, grosspay3);

        // Close the files
        input.close();
        output.close();
    }
}