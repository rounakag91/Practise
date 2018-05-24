//Implemeted generics so that Queuey and Queuey2 is generalised.(QueueAndStack.Example package)

package Generics.Example;

import java.util.LinkedList;

import QueueAndStacks.Example.Queuey2;

public class Queuey<D> {

	LinkedList<D> queue;

	public Queuey() {
		queue = new LinkedList<D>();
	}

	// Check queue is empty
	public boolean isEmpty() {
		return queue.isEmpty();
	}

	// Return size of queue
	public int size() {
		return queue.size();
	}

	// Enqueuing an item
	public void enqueue(D n) {
		queue.addLast(n);
	}

	// Dequeuing an item
	public D dequeue() {
		return queue.removeFirst();
	}

	public D peek() {
		return queue.get(0);
	}
	
	
	public static void main (String args[])
	{
		Queuey num = new Queuey();
		num.enqueue(5);
		num.enqueue(7);
		num.enqueue(10);
		System.out.println("First out :" +num.dequeue());
		System.out.println("First after First out : " +num.peek());
		System.out.println("2nd out :" +num.dequeue());
		System.out.println("3rd out :" +num.dequeue());
		
		Queuey stringQueue = new Queuey();
		stringQueue.enqueue("Hi");
		stringQueue.enqueue("My Name is Rounak");
		System.out.println(stringQueue.dequeue()+ "! " +stringQueue.dequeue()+ "." );
		
	}

}
