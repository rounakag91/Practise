//Given 2 Strings. Check if String b is contained in String a. Do NOT use contains method.

package Done.Strings;

import java.util.Arrays;
import java.util.Scanner;

public class StringContained {
	
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		String a = sc.nextLine();
		String b = sc.nextLine();
		
		System.out.println(isContained(a,b));
	}

	private static String isContained(String a, String b) {
		
		String result = "NO";
		char[] a1 = a.toLowerCase().toCharArray();
		char[] b1 = b.toLowerCase().toCharArray();
 		Arrays.sort(a1);
 		Arrays.sort(b1);
 		int count =0;
 		
 		for(char i : b1)
 		{
 			for(int j =0; j<a1.length; j++)
 			{
 				if(a1[j]==i)
 					count++;
 			}
 		}
 		if(count>=b1.length)
 			result = "YES";
		
		return result;
	}
	
	
	

}
