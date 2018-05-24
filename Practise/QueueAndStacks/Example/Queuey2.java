package QueueAndStacks.Example;

import java.util.LinkedList;

public class Queuey2 {

	LinkedList<String> queue;

	public Queuey2() {
		queue = new LinkedList<String>();
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
	public void enqueue(String n) {
		queue.addLast(n);
	}

	// Dequeuing an item
	public String dequeue() {
		return (String) queue.removeFirst();
	}

	public String peek() {
		return (String) queue.get(0);
	}
	
	
	public static void main (String args[])
	{
		Queuey2 stringQueue = new Queuey2();
		stringQueue.enqueue("Hi");
		stringQueue.enqueue("My Name is Rounak");
		System.out.println(stringQueue.dequeue()+ "! " +stringQueue.dequeue()+ "." );
	}

}
