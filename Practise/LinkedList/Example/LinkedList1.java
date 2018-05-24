//https://www.hackerrank.com/challenges/30-linked-list/tutorial

package LinkedList.Example;

import java.util.LinkedList;

public class LinkedList1 {
	
	//Properties
	Node head;
	int count;
	
	
	//Constructors
/*	public LinkedList() {
		// TODO Auto-generated constructor stub
		head = null;
		count = 0;
	}
	*/
	public LinkedList1(Node newHead) {
		head = newHead;
		count =1;
	}

	
	//Methods
	
	//add
	public void add(int newData)
	{
		Node temp = new Node(newData);
		Node current = head;
		while(current.getNext() != null) {
			current = current.getNext();
		}
		current.setNext(temp);
		count++;
	}
	
	//get
	public int get(int index)
	{
		if(index<=0)
			return -1;
		
		Node current = head;
		for (int i=1; i < index; i++)
		{
			current = current.getNext();
		}
		return current.getData();
	}
	
	//size
	public int size()
	{
		return count;
	}
	
	//isEmpty
	public boolean isEmpty()
	{
		return head == null;
		
	}
	
	//remove
	public void remove()
	{
		Node current = head;
		while (current.getNext().getNext() != null)
		{
			current = current.getNext();
		}
		current.setNext(null);
		count--;
	}
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<String> ll = new LinkedList<String>();
		ll.add("Rounak");
		System.out.println(ll);
		ll.add("Agarwal");
		System.out.println(ll);
		
	}

}
