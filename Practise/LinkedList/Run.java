package LinkedList;

import java.util.Scanner;

public class Run {

	public Run() {
		// TODO Auto-generated constructor stub
	}

	 public static  Node insert(Node head,int data) {
		
		 Node temp = head;
		 if(temp == null)
		 {
			 temp = new Node(data);
			 return temp;
		 }
		 while(temp.next != null)
		 {
			 temp = temp.next;
		 }
		 temp.next = new Node(data);
		 return head;
	
		 
	 }
	 
	 public static void display(Node head) {
	        Node start = head;
	        while(start != null) {
	            System.out.print(start.data + " ");
	            start = start.next;
	        }
	    }

	    public static void main(String args[]) {
	        Scanner sc = new Scanner(System.in);
	        Node head = null;
	        int N = sc.nextInt();

	        while(N-- > 0) {
	            int ele = sc.nextInt();
	            head = insert(head,ele);
	        }
	        display(head);
	        sc.close();
	    }
	}
	
