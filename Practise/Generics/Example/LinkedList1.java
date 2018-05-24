//https://www.hackerrank.com/challenges/30-linked-list/tutorial

package Generics.Example;

import java.util.LinkedList;

public class LinkedList1<D> {
	
	//Properties
	Node<D> head;
	int count;
	
	
	//Constructors
	public LinkedList1() {
		// TODO Auto-generated constructor stub
		head = null;
		count = 0;
	}

	public LinkedList1(Node<D> newHead) {
		head = newHead;
		count =1;
	}

	
	//Methods
	
	//add
	public void add(D newData)
	{
		Node<D> temp = new Node(newData);
		Node<D> current = head;
		while(current.getNext() != null) {
			current = current.getNext();
		}
		current.setNext(temp);
		count++;
	}
	
	//get
	public D get(int index)
	{
	//	if(index<=0)
	//		return -1;
		
		Node<D> current = head;
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
		Node<D> current = head;
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
		
/*		
		LinkedList1<String> l = new LinkedList1();
		l.add("abc");
		System.out.println(l.get(0));*/

	}

}
