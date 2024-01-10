import java.util.Scanner;

public class Pgm6 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your Community Report score (0-10): ");
        int score = scanner.nextInt();

        switch (score) {
            case 0:
            case 1:
            case 2:
            case 3:
                System.out.println("When can we meet you to explain the roles and responsibilities of a resident?");
                break;
            case 4:
            case 5:
            case 6:
            case 7:
                System.out.println("You have taken a step in the right direction!");
                break;
            case 8:
            case 9:
            case 10:
                System.out.println("Thank you for going the extra mile! Would you be interested in training others?");
                break;
            default:
                System.out.println("Invalid score entered. Please enter a score between 0 and 10.");
                break;
        }
    }
}
