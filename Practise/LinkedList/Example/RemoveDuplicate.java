package LinkedList.Example;

import java.util.Scanner;

public class RemoveDuplicate {
	
	
	 public static Node removeDuplicates(Node head) {
	      //Write your code here
	        Node p = head;
	        Node pNext;
	        if(head == null)
	            return null;
	        while(p.next !=null)
	        {
	            if(p.data == p.next.data){
	                pNext = p.next.next;
	                p.next = null;
	                p.next = pNext;
	                
	            }
	            else
	                p=p.next;
	        }
	        return head;
	    }
	
	public static  Node insert(Node head,int data)
    {
       Node p=new Node(data);			
       if(head==null)
           head=p;
       else if(head.next==null)
           head.next=p;
       else
       {
           Node start=head;
           while(start.next!=null)
               start=start.next;
           start.next=p;

       }
       return head;
   }
   public static void display(Node head)
       {
             Node start=head;
             while(start!=null)
             {
                 System.out.print(start.data+" ");
                 start=start.next;
             }
       }
       public static void main(String args[])
       {
             Scanner sc=new Scanner(System.in);
             Node head=null;
             int T=sc.nextInt();
             while(T-->0){
                 int ele=sc.nextInt();
                 head=insert(head,ele);
             }
             head=removeDuplicates(head);
             display(head);

      }

}
