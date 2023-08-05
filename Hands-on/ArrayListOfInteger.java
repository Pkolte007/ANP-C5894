package collection;
/* .Write a Java program to create an ArrayList of integers and perform the following operations:
a. Add elements to the ArrayList.
b. Remove an element from a specific index.
c. Update an element at a specific index.*/

import java.util.ArrayList;
import java.util.List;

public class ArrayListOfInteger {

	public static void main(String[] args) 
	{
		List<Integer> n= new ArrayList<>();
		n.add(3);
		n.add(1);
		n.add(4);
		n.add(5);
        n.add(7);
        System.out.println("Number list " + n);
        
        n.remove(1);
        System.out.println("Remove number is " + n);
        
        n.add(2, 8);
        System.out.println("Updated element is " + n);

	}

}
