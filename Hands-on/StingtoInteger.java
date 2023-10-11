package collection;
/*Write  a Java program that reads a string input from the user. 
 * Convert the string to an integer using the Integer.parseInt() method. 
 * Handle the NumberFormatException that can occur if the input cannot be parsed as an integer. 
 * Display a message indicating that the input is not a valid integer. */
import java.util.Scanner;

public class StingtoInteger {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a string: ");
        String input = sc.nextLine();
        try 
        {
            //System.out.print("Enter a number: ");
            int number = Integer.parseInt(input); // This line can throw NumberFormatException
            System.out.println("You entered: " + number);
        } 
        catch (NumberFormatException e)
        {
            System.out.println("Input is not a valid integer.");
        }   
        sc.close();       
        System.out.println("Program continues...");


	}

}
