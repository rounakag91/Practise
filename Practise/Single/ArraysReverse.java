//https://www.hackerrank.com/challenges/30-arrays/problem
package Single;

import java.util.Scanner;

public class ArraysReverse {
	
	public static void main (String args[])
	{
		
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		int[] arr = new int[T];
		for (int i=0; i<T; i++)
		{
			arr[i] = sc.nextInt();
		}
		sc.close();
		
		reverse(arr);
		
	}
 
public static void reverse(int[] arr)
{
	for(int i=arr.length-1; i>=0; i--)
	{
		System.out.print(arr[i]+ " ");
	}
}
}