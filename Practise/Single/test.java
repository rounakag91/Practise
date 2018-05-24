
public class test 
{
	public static void main(String args[])
	{
		double gascost1 = (50000/10)*4;
		double gascost2 = (50000/50)*4;
		double totalcost1 = 15000 + gascost1;
		double totalcost2 = 30000 + gascost2;
		System.out.println(totalcost1);
		System.out.println(totalcost2);
		if(totalcost1>totalcost2)
			System.out.println("car 2");
		else
			System.out.println("car 1");
	}

}
