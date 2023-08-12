package collection;
import java.util.Stack;

public class StockExample {

	public static void main(String[] args) 
	{
		Stack<String> stack = new Stack<>();

        // Pushing elements onto the stack
        stack.push("Java");
        stack.push("Python");
        stack.push("C++");

        // Peeking at the top element (without removing it)
        System.out.println("Top element: " + stack.peek());
     // Popping elements from the stack
        System.out.println("Popped element: " + stack.pop());
        System.out.println("Popped element: " + stack.pop());

        // Check if the stack is empty
        System.out.println("Is stack empty? " + stack.isEmpty());

        // Pushing more elements
        stack.push("JavaScript");
        stack.push("C#");

        // Size of the stack
        System.out.println("Stack size: " + stack.size());
        System.out.println("Elements popped from the stack:");
//        while (!stack.isEmpty()) 
//        {
//            System.out.println(stack.pop());
//        }
//



	}

}
