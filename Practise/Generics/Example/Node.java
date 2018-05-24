package Generics.Example;

public class Node<E> {
	//Properties
	Node next;
	E data;
	
	public Node(E newdata) {
		data = newdata;
		next = null;
	}
	
	public Node(E newData, Node newNext)
	{
		data = newData;
		next = newNext;
	}

	
	//Getters and Setters
	public Node getNext() {
		return next;
	}

	public void setNext(Node<E> newNode) {
		this.next = newNode;
	}

	public E getData() {
		return data;
	}

	public void setData(E newData) {
		this.data = newData;
	}
	
	
	
	

}
