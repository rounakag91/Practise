//https://www.hackerrank.com/challenges/30-binary-numbers/problem

package Single;

import java.util.Scanner;

public class MaxOnesInBinary {
	
	public static void main (String args[])
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
	
		//System.out.println(ConvertToBinary.binary(n)); //print binary value;

		System.out.println(maxones(n));
		sc.close();
	}
	
	public static int maxones(int n)
	{
		int max = 0, temp=0;
		String binary = Integer.toBinaryString(n);
		System.out.println(binary); // Print binary value to verify.
		for(int i=0; i<binary.length(); i++)
		{
			if(binary.charAt(i)=='1')
			{
				temp++;
				if(temp>max)
					max = temp;
			}
			else
				temp = 0;
		}
		return max;
	}

}
