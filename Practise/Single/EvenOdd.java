import java.io.*;


public class EvenOdd {
	
	public static void main(String args[]) throws IOException
	{
		int a;
		System.out.print("Enter No : ");
		BufferedReader obj = new BufferedReader (new InputStreamReader(System.in));
		a = Integer.parseInt(obj.readLine()); 
		if (a%2 == 0)
			System.out.println("Even");
		else
			System.out.println("Odd");
	}

	
}
