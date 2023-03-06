// Java Code to illustrate push() Method
import java.util.*;
public class StackDemo {
    public static void main(String args[])
    {
        Stack& lt;
        String& gt;
        STACK = new Stack& lt;
        String& gt;
        ();
        STACK.push(" Welcome & quot;);
        STACK.push(" To & quot;);
        STACK.push(" Geeks & quot;);
        STACK.push(" For & quot;);
        STACK.push(" Geeks & quot;);
        System.out.println(" Initial Stack: "+ STACK);
        STACK.push(" Hello & quot;);
        STACK.push(" World & quot;);
        System.out.println(" Final Stack: "+ STACK);
    }
}
import java.util.*;
public class StackDemo {
    public static void main(String args[])
    {
        Stack<String> STACK = new Stack<String>();
        STACK.push("Welcome");
        STACK.push("To");
        STACK.push("Geeks");
        STACK.push("For");
        STACK.push("Geeks");
        System.out.println("Initial Stack: " + STACK);
        System.out.println("Popped element: " + STACK.pop());
        System.out.println("Popped element: " +STACK.pop());
        System.out.println("Stack after pop operation "+ STACK);
    }
}
// Java code to illustrate peek() function
import java.util.*;
public class StackDemo {
	public static void main(String args[])
	{
		Stack<String> STACK = new Stack<String>();
		STACK.push("Welcome");
		STACK.push("To");
		STACK.push("Geeks");
		STACK.push("For");
		STACK.push("Geeks");
		System.out.println("Initial Stack: " + STACK);
		System.out.println("The element at the top of the stack is: " + STACK.peek());
		System.out.println("Final Stack: " + STACK);
	}
}
// Java code to demonstrate empty() method
import java.util.*;
public class Stack_Demo {
	public static void main(String[] args)
	{
		Stack<String> STACK = new Stack<String>();
		STACK.push("Geeks");
		STACK.push("4");
		STACK.push("Geeks");
		STACK.push("Welcomes");
		STACK.push("You");
		System.out.println("The stack is: " + STACK);
		System.out.println("Is the stack empty? " +STACK.empty());
		STACK.pop();
		STACK.pop();
		STACK.pop();
		STACK.pop();
		STACK.pop();
		System.out.println("Is the stack empty? " +STACK.empty());
	}
}
// Java code to demonstrate search() method
import java.util.*;
public class Stack_Demo {
	public static void main(String[] args)
	{
		Stack<String> STACK = new Stack<String>();
		STACK.push("Geeks");
		STACK.push("4");
		STACK.push("Geeks");
		STACK.push("Welcomes");
		STACK.push("You");
		System.out.println("The stack is: " + STACK);
		System.out.println("Does the stack contains '4'? "+ STACK.search("4"));
		System.out.println("Does the stack contains 'Hello'? "+ STACK.search("Hello"));
		System.out.println("Does the stack contains 'Geeks'? "+ STACK.search("Geeks"));
	}
}               
