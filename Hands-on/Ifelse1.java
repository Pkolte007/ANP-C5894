package loops;

import java.util.Scanner;

public class Ifelse1 {

	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter a value:");
		
		int p=s.nextInt();
		
		if(p>0)
		{
			System.out.println("Number is positive");

		}
		else 
		{
			System.out.println("Number is negative");
		}
	}
}
