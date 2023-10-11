package collection;
/* Develop a program that takes a user's age as input and determines if they are eligible to vote (age >= 18). 
 * If the user enters non-numeric text or a negative number, catch the NumberFormatException and 
 * IllegalArgumentException respectively, displaying appropriate error messages.*/
import java.util.Scanner;
public class Ageexception {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);

	
	    
	    try 
	    {
	    	System.out.print("Enter a age: ");
            int num1 = Integer.parseInt(sc.nextLine()); 
	    	if(num1 == 0) {
	    	   throw new IllegalArgumentException(" age cannot be zero");
	    	}
            if(num1>=18)
	    		
	    	{
	    		System.out.println("Person is eligible for vote");
	    	}
	    	else {
	    		System.out.println("Person is not eligible for vote");
	    	}
	    	
	    }
	    
	    catch (NumberFormatException e)
        {
            System.out.println("Invalid input. Please enter a valid number.");
        }  
	    catch(IllegalArgumentException e) {
	    	System.out.println("error" + e.getMessage());
	    }
	    
        sc.close(); 

	}

}
