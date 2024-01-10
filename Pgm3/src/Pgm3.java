public class Pgm3 {

  public static void main(String[] args) {
    // Create an array to store the number names
    String[] numberNames = {
      "zero", "one", "two", "three", "four",
      "five", "six", "seven", "eight", "nine"
    };

    // Loop through the numbers from 0 to 9
    for (int i = 0; i < numberNames.length; i++) {
      // Print the number and its corresponding name
      System.out.println(i + ": " + numberNames[i]);
    }
  }
}
