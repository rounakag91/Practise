//https://www.hackerrank.com/challenges/recursive-digit-sum/problem



package Done.Maths;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class RecursiveDigitSum {

	static int digitSum(String n, int k) {
		// Complete this function
		long result = 0;
		for(int i =0; i<n.length(); i++)
			result = result+Integer.parseInt(n.substring(i, i+1));
		System.out.println(result);
		return Integer.parseInt(superDigit(Long.toString(result*k)));
	}
	
	static String superDigit(String p) {
		
		System.out.println("----------------");
		int result =0;
		System.out.println(p);
		for(int i=0; i<p.length();i++) {
			System.out.println(p.substring(i, i+1));
			result = result+Integer.parseInt(p.substring(i, i+1));
			
		}
		String s = Integer.toString(result);
		
		System.out.println(s);
		
		return s.length()!=1 ? superDigit(s) : s;
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String n = in.next();
		int k = in.nextInt();
		int result = digitSum(n, k);
		System.out.println(result);
		in.close();
	}
}
