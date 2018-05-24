package com;

public class stringdemo {
	public static void main(String args[])
	{
		String abc="ripan is great";
		System.out.println("Everybody says that " + abc);
		
		char a[]={'r','o','u','n','a','k'};
		String b= new String(a);
		byte c[]={12,13,14,15,16};
		String d=new String(c);
		System.out.println("the character stream is " +b);
		System.out.println("the byte stream is "+ d);
		String e="modi is the prime minister of INDIA";
		System.out.println(e);
		String f="i am a boy";
		int g=f.indexOf("boy");
		System.out.println("the index is " + g);
		String h=f.substring(0,g);
		System.out.println("substring is "+ h);
		h=h + " hello";
		System.out.println("the new string is " +h);
		String n="20";
		int m=Integer.valueOf(n).intValue();
		System.out.println("the number is " + m);
		String z=  "      hi    ";
		z=z.trim();
		System.out.println("the string is " + z);
		// Create new StringBuilder.
		StringBuilder builder = new StringBuilder();
		// Loop and append values.
		for (int i = 0; i < 5; i++) {
		 builder.append("abc ");
		}
		// Convert to string.
		String result = builder.toString();
		// Print result.
		System.out.println(result);
		
		
		
		

		
		
		
		}
	}


