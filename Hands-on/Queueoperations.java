package collection;
/*Queue Operations
Write a Java program that demonstrates the usage of a Queue (LinkedList):
Enqueue a series of elements.
Dequeue elements from the Queue.
Print the elements after each dequeue operation. */
import java.util.LinkedList;
import java.util.Queue;
public class Queueoperations {

	public static void main(String[] args) 
	{
		//queue list
		Queue<Integer> q=new LinkedList<>();
		q.add(3);
		q.add(4);
		q.add(6);
		q.add(7);
		
		System.out.println("Enqueue" + q);
		//while loop
		while(!q.isEmpty()) 
		{
		System.out.println("Removed element: " + q.remove());
        System.out.println("Queue after dequeuing: " + q);
		
		}
	}

}
