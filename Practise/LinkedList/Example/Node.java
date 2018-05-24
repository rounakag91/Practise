package LinkedList.Example;

public class Node {
	//Properties
	Node next;
	int data;
	
	public Node(int newdata) {
		data = newdata;
		next = null;
	}
	
	public Node(int newData, Node newNext)
	{
		data = newData;
		next = newNext;
	}

	public Node getNext() {
		return next;
	}

	public void setNext(Node newNode) {
		this.next = newNode;
	}

	public int getData() {
		return data;
	}

	public void setData(int newData) {
		this.data = newData;
	}
	
	//Getters and Setters
	
	

}
