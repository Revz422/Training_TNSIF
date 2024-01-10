import java.util.Scanner;

public class Pgm5 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter the value of p
        System.out.print("Enter the value of p (must be greater than or equal to 2.5): ");
        double p = scanner.nextDouble();

        // Validate the input
        if (p < 2.5) {
            System.out.println("Invalid input: p must be greater than or equal to 2.5");
            return; // Exit the program if input is invalid
        }

        // Calculate the sum using the arithmetic series formula
        int n = (int) ((p - 2.5) / 2) + 1; // Number of terms in the series
        double sum = (2.5 + p) * n / 2; // Sum of the series

        // Display the result
        System.out.println("The sum of the series up to term " + p + " is: " + sum);
    }
}
