package loops;
/*Write a program that prompts the user to enter a series of integers. 
The program should calculate the sum of all the even numbers entered, skipping any negative numbers. 
Use the continue statement to skip negative numbers*/
import java.util.Scanner;

public class SeriesOfInteger 
{
	public static void main(String[] args) 
	{
		//scanner class object
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the number of values to sum:");
		//initializing and declaration
		int count=s.nextInt();
	
		
		int sum=0;
		for(int i=1;i<=count;i++)
		{
			System.out.println("Enter value #" +i+":");

			int value=s.nextInt();
			
		
		if(value%2 == 0 && value>0) 
		{

			sum+=value;
		}
		else {
			continue;
		}
		}

		System.out.println("Sum is" + sum);
		s.close();
	}
}