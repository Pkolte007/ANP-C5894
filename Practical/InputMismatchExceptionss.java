package collection;	

/* Write a Java program that reads an integer from the user using the Scanner class. 
 * Handle the InputMismatchException that can occur if the user enters a non-integer value. 
 * Display an appropriate error message.*/
import java.util.*;

public class InputMismatchExceptionss
{
    public static void main(String[] args)
    {
    	//scanner class
    	Scanner sc = new Scanner(System.in);

        
        try
        {
        	//print the enter number
            System.out.print("Enter a number: ");
            int number = sc.nextInt(); // This line can throw NumberFormatException
            System.out.println("You entered: " + number);
        } 
        //handling the exception
        catch (InputMismatchException e)
        {
            System.out.println("Invalid input. Please enter a valid number.");
        }
       
        sc.close();
        
        
}
}
