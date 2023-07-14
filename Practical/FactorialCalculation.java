package loops;
import java.util.Scanner;


public class FactorialCalculation {

	
	

		public static void main(String[] args) 
	    {
	    	//scanner class object
	        Scanner sc = new Scanner(System.in);
	        
	        //variable declaration
	        int number;
	        
	        //do loop
	        do {
	        	
	            System.out.print("Enter a positive integer: ");
	            
	            //user input
	            number = sc.nextInt();
	        } 
	        //Test expression
	        while (number <= 0);
	        
	        //variable factorial declaration & initialization
	        int factorial = 1;
	        
	        //variable i declaration & initialization
	        int i = 1;
	        
	        do {
	            factorial *= i;
	            i++;
	        } 
	        //Test expression
	        while (i <= number);
	        
	        //print factorial of a number
	        System.out.println("The factorial of " + number + " is " + factorial);
	        sc.close();


	}

}
