package pgm1;


import java.util.Scanner;

public class Pgm1 
{
   public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);

       int totalSamples = 0;
       int rounds = 0;

       System.out.println("Enter the number of leaf samples collected during each round (0 to stop):");

       while (true) {
           int samplesCollected = scanner.nextInt();

           if (samplesCollected == 0) {
               break; // Stop collecting when 0 is entered
           }

           totalSamples += samplesCollected;
           rounds++;

           if (totalSamples >= 30) {
               System.out.println("Asif has collected enough samples and is returning home.");
               break; // Stop collecting when at least 30 samples are collected
           }

           System.out.println("Enter the number of leaf samples collected during the next round (0 to stop):");
       }

       System.out.println("\nTotal samples collected: " + totalSamples);
       System.out.println("Number of rounds around the park: " + rounds);
   }
}