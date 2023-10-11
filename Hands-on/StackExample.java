package collection;
/*Question 5: Stack Implementation
Implement a stack using either an ArrayList or a LinkedList. Write a program that performs the following operations:
a) Push elements onto the stack.
b) Pop elements from the stack.
c) Check whether the stack is empty.
d) Display the elements in the stack.
 */
import java.util.Stack;

public class StackExample {

	public static void main(String[] args) 
	{
		Stack<Integer> num= new Stack<>();
		num.push(3);
		num.push(4);
		num.push(8);
		num.push(9);
		System.out.println("Popup elemnts: " + num.pop());
        
		  System.out.println("Is stack empty? " + num.isEmpty());
		  
		System.out.println("Elments from stack are: " + num);
	}

}
