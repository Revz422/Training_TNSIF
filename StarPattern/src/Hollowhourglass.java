import java.util.Scanner;

public class Hollowhourglass {
	private static Scanner sc;
	
	public static void main(String[] args) {
		sc = new Scanner(System.in);
		
		int i, j, k;
		
		System.out.print("Enter Hollow Sandglass Star Pattern Rows = ");
		int rows = sc.nextInt();
		
		System.out.println("Printing Hollow Sandglass Star Pattern");
		i = 1;
		while( i <= rows ) 
		{
			j = 1;
			while( j < i ) 
			{
				System.out.print(" ");
				j++;
			}
			k = i;
			while( k <= rows) 
			{
				if(i == 1 || k == i || k == rows)
				{
					System.out.print("* ");
				}
				else 
				{
					System.out.print("  ");
				}
				k++;
			}
			System.out.println();
			i++;
		}
		
		i = rows - 1;
		while( i >= 1 ) 
		{
			j = 1;
			while( j < i ) 
			{
				System.out.print(" ");
				j++;
			}
			k = i;
			while( k <= rows) 
			{
				if(i == 1 || k == i || k == rows)
				{
					System.out.print("* ");
				}
				else 
				{
					System.out.print("  ");
				}
				k++;
			}
			System.out.println();
			i--;
		}
	}
}