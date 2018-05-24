package Done.Maths;

import java.util.Scanner;

public class PrimeOptimized {

	public static void main(String ars[])
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		int[] num = new int[n];
		for(int i=0; i<n;i++)
			num[i] = sc.nextInt();

		Prime(num);
	}

	static void Prime(int[] numbers) {

		for(int i=0; i<numbers.length;i++)
		{
			isPrime(numbers[i]);
		}
	}

	static void isPrime(int a)
	{
		int count = 0;
		for(int i=1; i<=Math.sqrt(a);i++)
		{
			if(a%i == 0) {
				if(a/i == i)
					count++;
				else
					count += 2;
			}
		}
		System.out.println(a+"'s count : "+count);
		if(count == 2)
			System.out.println("Prime");
		else 
			System.out.println("Not Prime");


		/*
		static boolean isPrime(int n) {
        	for(int i=2;i<=Math.sqrt(n);i++) {
            	if(n%i==0) {
                	return false;
            	}
        	}
        	return true;
    	}
		 */

	}
}
