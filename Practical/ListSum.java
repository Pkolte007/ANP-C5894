package collection;
/* Create a method to find the sum of all the elements in an 
 * ArrayList of integers. 
 * Test your method with a sample ArrayList */
import java.util.ArrayList;
import java.util.List;



public class ListSum {

	public static void main(String[] args) 
	{
		//create list of integers
				List<Integer> num= new ArrayList<>();
				
				//Adding elements in list
				num.add(12);
				num.add(20);
				num.add(10);
				num.add(11);
				
				int sum=0;
				
		        for(int i=0; i < num.size(); i++) 
		        {
		        	  sum += num.get(i);//sum = num.add(i) + sum;
		        }
		        //displaying sum
		        System.out.println("Sum " + sum);
		     




	}

}
