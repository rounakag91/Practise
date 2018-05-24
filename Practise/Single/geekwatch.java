import java.util.Date;
import java.util.Scanner;

public class geekwatch {
	public static void main(String args[])
	{
		Scanner obj = new Scanner(System.in);
		Date date = new Date();
		int choice;
		String cont;
		long d = date.getTime();
		do
		{
			System.out.println("Enter choice 1 to 4 : ");
			choice = obj.nextInt();
			switch(choice)
			{
			case 1 :System.out.println(d+" milliseconds");
					break;
			case 2 :System.out.println((d/100)+" seconds");
					break;
			case 3 :System.out.println(d/(100*60*60*24)+" days");
					break;
			case 4 :System.out.println(date.toString());
					break;
			default :System.out.println("Invalid");
					break;
			}
			System.out.println("Do you want to continue : y or Y : ");
			cont = obj.next();
		}
		while (cont.contentEquals("y"));
	System.out.println("Thank You.");
	}
	
}
