package loops;

import java.util.Scanner;

public class SeriesOfNumber {

	public static void main(String[] args) 
	{

       Scanner sc =new Scanner(System.in);
       int number;
       int sum=0;
       do {
       	
           System.out.print("Enter a number: ");
           
           //user input
           number = sc.nextInt();
           sum+=number;
       } 
       //Test expression
       while (number != 0);
       
       System.out.println("sum of number is" +sum);
       sc.close();
       
    	   
       

	}

}       

