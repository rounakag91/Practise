package Generics.Example;

import java.util.LinkedList;
import java.util.Stack;

public class Stacker<T> {

	LinkedList<T> stack;

	public Stacker() {
		stack = new LinkedList<T>();
	}

	// Peek in a Stack
	public T peek() {
		return stack.getLast();
	}

	// Push into a stack
	public void push(T n) {
		stack.add(n);
	}

	// Pop from a stack
	public T pop() {
		return stack.removeLast();
	}
	
	public int size()
	{
		return stack.size();
	}

	//using Java Buildin Stack
	public static void main(String args[])
	{
		//Implemented Stacks
		Stacker stack = new Stacker();
		stack.push(10);
		stack.push(11);
		System.out.println("Size of stack "+stack.size()+ "with : "+stack.pop()+ "," +stack.pop());
		
		
		//Built In stacks
		Stack<String> stacky = new Stack<>();
		stacky.push("Hi!");
		stacky.push("there");
		
		System.out.println("Size of stack "+stacky.size()+ "with : "+stacky.pop()+ "," +stacky.pop());
	}
	
	
}
