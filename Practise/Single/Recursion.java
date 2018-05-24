//https://www.hackerrank.com/challenges/30-recursion/problem
package Single;

import java.util.Scanner;

public class Recursion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.println(factorial(n));
		sc.close();
	}
	
	public static int factorial(int n)
	{
		int fact = 1;
		if(n>1)
			fact = n*factorial(n-1);
		return fact;
	}

}
