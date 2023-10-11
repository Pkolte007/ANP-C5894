package collection;
/*Write  a Java program that reads a string input from the user. Convert the string to an integer using the Integer.parseInt() method. 
 * Handle the NumberFormatException that can occur if the input cannot be parsed as an integer. 
 * Display a message indicating that the input is not a valid integer. */
import java.util.Scanner;

public class NumberFormatExceptionEx {

	public static void main(String[] args) 
	{
		//scanner object
		 Scanner sc = new Scanner(System.in);
	        
	        try 
	        {
	            System.out.print("Enter a number: ");
	            int number = Integer.parseInt(sc.nextLine()); // This line can throw NumberFormatException
	            System.out.println("You entered: " + number);
	        } 
	        //handling exception
	        catch (NumberFormatException e)
	        {
	            System.out.println("Invalid input. Please enter a valid number.");
	        }   
	        sc.close();       
	        System.out.println("Program continues...");


	}

}
