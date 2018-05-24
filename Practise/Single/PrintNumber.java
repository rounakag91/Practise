import java.io.*;

public class PrintNumber {
	public static void main(String[] args)throws IOException
	{
		String[] words = new String[50];
		
		System.out.println("Enter number : ");
		BufferedReader obj = new BufferedReader(new InputStreamReader(System.in));
		int num = Integer.parseInt(obj.readLine());
		
		words[1] = "one";
		words[2] = "two";
		words[3] = "three";
		
	}

}
