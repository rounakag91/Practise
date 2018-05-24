//https://www.hackerrank.com/challenges/the-birthday-bar/problem

//*Bars selected in sequential order.

package Done.Maths;

import java.util.Scanner;

public class BirthdayChocolate {
	
	public static void main(String args[])
	{
		   Scanner in = new Scanner(System.in);
	        int n = in.nextInt();
	        int[] s = new int[n];
	        for(int s_i=0; s_i < n; s_i++){
	            s[s_i] = in.nextInt();
	        }
	        int d = in.nextInt();
	        int m = in.nextInt();
	        int result = solve(n, s, d, m);
	        System.out.println(result);
	}
	
	
	 static int solve(int n, int[] bars, int d, int m){
	        // Complete this function
		 int result =0;
		 for(int i = 0; i < bars.length - m + 1; i++) {
	            int sum = 0;
	            for(int j = i; j < i + m; j++) {
	                sum += bars[j];
	            }
	            if(sum == d) {
	                result++;
	            }
	        }
		 return result;
}
}