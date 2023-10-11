package collection;
/* Write a program that attempts to divide two numbers. Whether the division is successful or not, 
 * make sure to display a "Division completed" message. Ensure that the division operation is performed in a try block and the 
 * "Division completed" message is displayed in a finally block.*/
import java.util.Scanner;

public class Division {

	public static void main(String[] args) 
	{
		//taking input from user
		Scanner sc = new Scanner(System.in);

	    System.out.print("Enter the numerator: ");
	    float numerator = sc.nextInt();

	    System.out.print("Enter the denominator: ");
	    float denominator = sc.nextInt();
        //using try,catch and finally
	    try 
	    {
	            float result = numerator / denominator;
	            System.out.println("Result: " + result);
	    }
	    catch (ArithmeticException e)
	    {
	            System.out.println("An exception occurred: " + e.getMessage());
	    }
	    
	    finally {
	    	System.out.println("Division completed");
	    }
	    sc.close();

	}

}
