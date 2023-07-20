package Operator;

import java.util.Scanner;

public class ArithmeticOperatorExample 
{
    public static void main(String[] args) 
    {
    	Scanner sc = new Scanner(System.in);
    	System.out.print("Enter the first number: ");

        //input for the 1st number

        int num1 = sc.nextInt();

        System.out.print("Enter the second number: ");

        //input for the 2nd number

        int num2 = sc.nextInt();

      //operations

        int sum = num1 + num2;

        int difference = num1 - num2;

        int product = num1 * num2;

        int quotient = num1 / num2;

        int remainder = num1 % num2;
      //print the operation values

        System.out.println("Sum: " + sum);

        System.out.println("Difference: " + difference);

        System.out.println("Product: " + product);

        System.out.println("Quotient: " + quotient);

        System.out.println("Remainder: " + remainder);

        sc.close();
    }
    
}
