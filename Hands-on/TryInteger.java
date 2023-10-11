package collection;

import java.util.Scanner;

/*Write a program that takes an integer input from the user and throws this custom exception 
 * if the input is negative. 
 * Catch the exception and display an error message accordingly. */
public class TryInteger {

	public static void main(String[] args) 
	{
		//taking input from user
		Scanner sc = new Scanner(System.in);

	    System.out.print("Enter the number: ");
	    int num = sc.nextInt();
	    //using if loop
	   	if(0>num) 
	   	//using try and catch
	    try {
	    	throw new Exception();
        }catch(Exception e){
            System.out.println("error occured");
        }
	   	
	   	else {
	   		System.out.println("Positive integer");
	   	}
	    
	   	
	    
        sc.close();

	}

}
