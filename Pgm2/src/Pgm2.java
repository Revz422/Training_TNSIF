
	import java.util.Scanner;

	public class Pgm2	 
	{

	   public static void main(String[] args)
	 
	{
	       Scanner scanner = new Scanner(System.in);

	       System.out.print("Enter a string: ");
	       String str = scanner.nextLine();

	       int vowelCount = 0, consonantCount = 0;

	       // Convert string to lowercase for case-insensitive counting
	       str = str.toLowerCase();

	       for (int i = 0; i < str.length(); i++) {
	           char ch = str.charAt(i);

	           // Check if character is a vowel
	           if (isVowel(ch)) {
	               vowelCount++;
	           }
	           // Check if character is a consonant (lowercase English alphabet)
	           else if (ch >= 'a' && ch <= 'z') {
	               consonantCount++;
	           }
	       }

	       System.out.println("Vowels: " + vowelCount);
	       System.out.println("Consonants: " + consonantCount);
	   }

	   // Helper function to check if a character is a vowel
	   public static boolean isVowel(char ch) {
	       return (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u');
	   }
	}