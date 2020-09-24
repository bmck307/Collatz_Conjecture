import java.util.Scanner;

/*
 * Algorithm to calculate Collatz conjecture
 * Written by Brayden McKelvey
 */
public class collatz {
	
	static int calculateCollatz(int value)
	{
		if (value <= 0)
		{
			System.out.println("Error, negative numbers are not allowed");
			return 0;
		}
		else if (value % 2 == 0)
		{
			return value / 2;
		}
		return 3 * value + 1;
	}

	public static void main(String[] args) 
	{
		int value;
		Scanner scnr = new Scanner(System.in);
		System.out.println("Enter the number you would like to check the Collatz for?");
		value = scnr.nextInt();
		
		while (value != 1 || value == 0)
		{
			value = calculateCollatz(value);
			System.out.println(value);
		}
	}

}
