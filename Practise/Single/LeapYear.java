import java.io.*;

public class LeapYear {
	
	public static void main (String[] args) throws IOException
	{
		System.out.print("Enter Year : ");
		BufferedReader obj = new BufferedReader(new InputStreamReader(System.in));
		int year = Integer.parseInt(obj.readLine());
		
		 if ((year % 4 == 0) && year % 100 != 0)
	        {
	            System.out.println(year + " is a leap year.");
	        }
	        else if ((year % 4 == 0) && (year % 100 == 0) && (year % 400 == 0))
	        {
	            System.out.println(year + " is a leap year.");
	        }
	        else
	        {
	            System.out.println(year + " is not a leap year.");
	        }
	    }
	}