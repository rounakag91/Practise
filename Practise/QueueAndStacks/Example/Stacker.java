package QueueAndStacks.Example;

import java.util.LinkedList;
import java.util.Stack;

public class Stacker {

	LinkedList stack;

	public Stacker() {
		stack = new LinkedList();
	}

	// Peek in a Stack
	public int peek() {
		return (int) stack.getLast();
	}

	// Push into a stack
	public void push(int n) {
		stack.add(n);
	}

	// Pop from a stack
	public int pop() {
		return (int) stack.removeLast();
	}
	
	public int size()
	{
		return stack.size();
	}

	//using Java Buildin Stack
	public static void main(String args[])
	{
		
		Stacker stack = new Stacker();
		stack.push(10);
		stack.push(11);
		System.out.println("Size of stack "+stack.size()+ "with : "+stack.pop()+ "," +stack.pop());
		
		
		
		Stack<String> stacky = new Stack<>();
		stacky.push("Hi!");
		stacky.push("there");
		
		System.out.println("Size of stack "+stacky.size()+ "with : "+stacky.pop()+ "," +stacky.pop());
	}
	
	
}
