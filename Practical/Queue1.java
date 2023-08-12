package collection;
/* Queue Operations
Design a program that demonstrates the use of a Queue:
a) Enqueue elements into the queue.
b) Dequeue elements from the queue.
c) Check whether the queue is empty.
d) Print the elements in the queue.*/
import java.util.*;
public class Queue1 {

	public static void main(String[] args) 
	{
		Queue<String> b=new LinkedList<>();
        b.add("Rome");
        b.add("India");
        b.add("Germany");
        b.add("USA");
        
        
        System.out.println("Enqueue elements: " + b.add("UK"));
        
        System.out.println("Dequeue elements are:" + b.remove("Rome"));
        
        System.out.println("Is stack empty" + b.isEmpty());
        
        System.out.println("Print elements: " + b);
	}

}
