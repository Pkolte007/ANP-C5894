package Operator;

import java.util.Scanner;

public class LogicalOperatorExample 
{
    public static void main(String[] args) 
    {
    	Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        //input for the 1st number
        int num = sc.nextInt();

        //to check whether the number is positive or not
        System.out.print("Is the number positive? ");
        boolean isPositive = num > 0;
      //to check whether the number is even or not
        System.out.print("Is the number even? ");
        boolean isEven = num % 2 == 0;

       //to check whether the number is divisible by 5
        System.out.println("Is the number divisible by 5? ");
        boolean isDivisibleBy5 = num % 5 == 0;

        //print statement
        System.out.println("The number is positive: " + isPositive);
        System.out.println("The number is even: " + isEven);
        System.out.println("The number is divisible by 5: " + isDivisibleBy5);
      //AND operator
        boolean number = isPositive && isEven && isDivisibleBy5;

        //print value
        System.out.println("Is the number a special number? " + number);
        sc.close();
    }
}


