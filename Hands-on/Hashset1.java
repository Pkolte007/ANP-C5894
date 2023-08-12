package collection;
/* Question 2: HashSet Operations
Create a program that showcases the usage of a HashSet:
a) Add elements to the set.
b) Check whether a specific element exists in the set.
c) Remove an element from the set.
d) Print the elements of the set.*/
import java.util.*;
public class Hashset1 {

	public static void main(String[] args) 
	{
		Set<String> p=new HashSet<String>();
		p.add("Cricket");
		p.add("Football");
		p.add("Basketball");
		p.add("Volleyball");
		System.out.println("Elements are:" +p);
		
		String c="Cricket";
		System.out.println("elements contains:"+c+" " +p.contains(c));
		
		p.remove("Volleyball");
		System.out.println("upadted elements are: " + p);
		
		System.out.println("Elements are: " +p);
	}

}
