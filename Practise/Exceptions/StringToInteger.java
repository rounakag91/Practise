package Exceptions;

import java.util.Scanner;

public class StringToInteger {

	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		
		try {
			System.out.println(Integer.parseInt(s));
		}
		catch(Exception e)
		{
			//System.err.println("Exception caught : "+e);
			System.err.println("Bad String");
			
		}
	}

}
