package loops;
import java.util.Scanner;

public class Grade 
{
	public static void main(String[] args)
	{
		//input from the user
				Scanner sc=new Scanner(System.in);
				System.out.print("Enter your numeric grade");
				int marks=sc.nextInt();
				String grade=null;
				if(marks<0 || marks>100)
				{
					System.out.println("Please enter a valide grade between 0 and 100");
					//return;
				}
				switch(marks/10)
				{
				case 10:
				case 9:	
				grade="A";
				 break;
				 
				case 8:
				
				
				grade="B";
				 break;
				 
				case 7:
				grade="C";
				 break;
				 
				case 6:
				grade="D";
				 break;
				 
				default:
					grade="F";
				 break;
				}
				System.out.println("The grade is: "+ grade);
				sc.close();
	}
}
