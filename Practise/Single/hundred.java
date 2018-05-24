import java.io.*;

class hundred {
	
	public static void main (String args[]) throws IOException
	{
		String name = null;
		System.out.println("Enter string to print 100 times: ");
		BufferedReader obj = new BufferedReader(new InputStreamReader(System.in));
		name = obj.readLine();
		for (int i=0;i<100;i++)
		{
			System.out.print(name+" ");
		}
	}

}
