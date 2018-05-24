
public class times {

	public static void main (String args[])
	{
		int i;
		int j;
		for (j=0;j<10;j++)
		{
			System.out.print("	"+j);
		}
		System.out.println("");
		for (i = 0; i<10;i++)
		{
			System.out.print(i+"	");
			for (j=0;j<10;j++)
			{
				int k = i*j;
				System.out.print(k+"	");
			}
			System.out.println("");
		}
	}
}
