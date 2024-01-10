import java.util.Scanner;

public class Pgm4 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Define unit rates and surcharge percentage
        final double RATE_100 = 2.00;
        final double RATE_200 = 3.00;
        final double RATE_300PLUS = 5.00;
        final double SURCHARGE_PERCENTAGE = 2.5;

        // Read water consumption from user
        System.out.print("Enter number of water units consumed: ");
        int waterConsumption = scanner.nextInt();

        // Calculate base charge based on consumption bands
        double baseCharge = 0;
        if (waterConsumption <= 100) {
            baseCharge = waterConsumption * RATE_100;
        } else if (waterConsumption <= 300) {
            baseCharge = 100 * RATE_100 + (waterConsumption - 100) * RATE_200;
        } else {
            baseCharge = 100 * RATE_100 + 200 * RATE_200 + (waterConsumption - 300) * RATE_300PLUS;
        }

        // Calculate surcharge (if applicable)
        double surcharge = 0;
        if (waterConsumption > 300) {
            surcharge = baseCharge * SURCHARGE_PERCENTAGE / 100;
        }

        // Calculate total charge
        double totalCharge = baseCharge + surcharge;

        // Print results
        System.out.println("Water consumption: " + waterConsumption + " units");
        System.out.println("Base charge: ₹" + String.format("%.2f", baseCharge));
        System.out.println("Surcharge (if applicable): ₹" + String.format("%.2f", surcharge));
        System.out.println("Total charge: ₹" + String.format("%.2f", totalCharge));
    }
}
