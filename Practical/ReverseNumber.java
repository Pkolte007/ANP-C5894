package loops;

public class ReverseNumber 
{
	public static void main(String[] args) 

	{
		 int number = 95623;
		 //reversednumber initialized to 0
	     int reversedNumber = 0;
	     while (number != 0) 
	     {
	    	 int remainder = number % 10;
	            reversedNumber = reversedNumber * 10 + remainder;
	            number /= 10;

	     }
	     System.out.println("Reversed number: " + reversedNumber);


	}
}
