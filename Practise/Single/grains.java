
public class grains {
	public static void main(String args[])
	{
		int i;
		double sum = 0;
		for (i = 0;i<64;i++)
		{
			double j = Math.pow(2,i);
			sum = sum + j;
			System.out.println("Square "+(i+1)+":	"+j+" grains");
		}
		System.out.println("Total is :"+sum);
	}

}
