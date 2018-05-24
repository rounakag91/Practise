package QueueAndStacks.Example;

import java.util.LinkedList;

public class Queuey {

	LinkedList<Integer> queue;

	public Queuey() {
		queue = new LinkedList<Integer>();
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
	public void enqueue(int n) {
		queue.addLast(n);
	}

	// Dequeuing an item
	public int dequeue() {
		return (int) queue.removeFirst();
	}

	public int peek() {
		return (int) queue.get(0);
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
	}

}
