package Generics.Example;

import java.util.Scanner;

public class ArrayGeneric {

	public static <E> void printArray(E[] a)
	{		
		for(E element : a)
		{
			System.out.print(element+ " ");
		}
		System.out.println();
		
	}
	
		
		//Converted to generic method. Method for int and String not needed.
		
	/*	public static void printArray(int[] a)
	{
		System.out.println("[");
		
		for(int i = 0; i<a.length; i++) {
			int item = a[i];
			System.out.println(item);
			if(i<a.length)
				System.out.print(", ");
		}
			
	}
	
	public static void printArray(String[] a)
	{
		System.out.println("[");
		
		for(int i = 0; i<a.length; i++) {
			String item = a[i];
			System.out.println(item);
			if(i<a.length)
				System.out.print(", ");
		}
			
	}*/
	
public static void main(String args[]) {
	
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter size of array : ");
	int size = sc.nextInt();
	Integer[] array=new Integer[size];
	System.out.println("Enter Integer Array :");
	for(int i =0; i<size; i++)
	{
		array[i]=sc.nextInt();
	}
	
	String[] arrayS=new String[size];
	System.out.println("Enter String Array :");
	for(int i =0; i<size; i++)
	{
		arrayS[i]=sc.next();
	}
	
	printArray(array);
	printArray(arrayS);
	
}

}
