import java.util.Scanner;

public class MultiplesCounter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the first integer: ");
        int firstNumber = input.nextInt();

        System.out.print("Enter the second integer: ");
        int secondNumber = input.nextInt();

        int countMultiplesOf2 = 0;
        int countMultiplesOf4 = 0;

        int start = Math.min(firstNumber, secondNumber);
        int end = Math.max(firstNumber, secondNumber);

        for (int number = start; number <= end; number++) {
            if (number % 2 == 0) {
                countMultiplesOf2++;
            }

            if (number % 4 == 0) {
                countMultiplesOf4++;
            }
        }

        System.out.println("Multiples of 2: " + countMultiplesOf2);
        System.out.println("Multiples of 4: " + countMultiplesOf4);

        input.close();
    }
}
