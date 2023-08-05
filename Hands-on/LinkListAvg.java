package collection;
/*Create a method to find the average of all the elements in a LinkedList of integers. 
 * Test your method with a sample LinkedList. */

import java.util.LinkedList;


public class LinkListAvg {

	public static void main(String[] args) 
	{
		//create list of integers
		LinkedList<Integer> ls = new LinkedList<>();

        // Adding elements to the linked list
        ls.add(12);
        ls.add(20);
        ls.add(10);
        ls.add(11);
        int sum=0;
        int avg=0;
		
        for(int i=0; i < ls.size(); i++) 
        {
        	  sum += ls.get(i);//sum = num.add(i) + sum;
        	  avg = sum/ls.size();
        }
        //displaying sum
        System.out.println("Average is " + avg);


	}

}
