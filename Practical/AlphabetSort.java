package collection;
import java.util.ArrayList;
import java.util.List;
import java.util.Collections;
/* List Sorting
Write a Java program that sorts a list of strings in alphabetical order using the Collections framework.*/

public class AlphabetSort {

	public static void main(String[] args) 
	{
		//array list
		List<String> fruits= new ArrayList<>();
		fruits.add("Banana");
		fruits.add("Apple");
		fruits.add("Orange");
		fruits.add("Mango");
        fruits.add("Grapes");
        System.out.println("Fruits list" + fruits);
        //sorting
        
        Collections.sort(fruits);
        System.out.println("after sorting" + fruits);

	}

}
