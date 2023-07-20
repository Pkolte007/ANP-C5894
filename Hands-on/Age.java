package Operator;
/*1.Write a Java program that prompts the user to enter their age. 
The program should check if the age is between 18 and 30 (inclusive) and 
print "Eligible for Job" if true, or "Not Eligible for Job" otherwise*/
import java.util.*;
public class Age {

	public static void main(String[] args) 
	{
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Are you eligible for job? ");
        System.out.print("Enter a age: ");
        //input for the 1st number
        int age = sc.nextInt();
      //to check whether the number is positive or not
        
        
       if ( age>18 && age<30)
       {
    	   System.out.println("Person is eligible for job ");  
       }
       else {
    	   System.out.println("Person is not eligible for job ");
       }
       
        sc.close();
	}

}
