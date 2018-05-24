package Sorting;

import java.util.Scanner;

public class BubbleSort {

	public static void main(String args[]) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter size of array : ");
		int size = sc.nextInt();
		int[] array = new int[size];
		for(int i=0; i<size; i++)
		{
			array[i] = sc.nextInt();
		}
		
		array = bubbleSort(array);
		System.out.println("Sorted Array is :");
		for(int i=0; i<=size-1; i++)
		{
			System.out.print(array[i]+ " ");
		}
		
	}

	private static int[] bubbleSort(int[] array) {
		// TODO Auto-generated method stub
		int numberOfSwaps = 0;

		for (int i =0; i<array.length-1; i++)
		{
			for(int j =0; j<array.length-1-i; j++)
			{
				if(array[j]>array[j+1])
				{
					array[j] = array[j] + array[j+1];
					array[j+1] = array[j] - array[j+1];
					array[j] = array[j] - array[j+1];
					numberOfSwaps++;
				}
			}
		}
        System.out.println("Array is sorted in " +numberOfSwaps+ " swaps.");
		return array;
	}
	
	

}
