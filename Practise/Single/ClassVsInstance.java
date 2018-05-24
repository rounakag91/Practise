package Single;
//https://www.hackerrank.com/challenges/30-class-vs-instance/problem
/*
 * 
 * @author rounak-2488  
 * 
*/
import java.util.Scanner;

public class ClassVsInstance {
	
	private int age;
	
	public ClassVsInstance (int initialAge) {
		if (initialAge < 0)
		{
			this.age = 0;
			System.out.println("Age is not valid, setting age to 0.");
		}
		else
		{
			this.age = initialAge;
		}
		
	}
	
	public void yearPasses()
	{
		this.age++;
	}
	
	public void amIOld()
	{
		if(age<13)
			System.out.println("You are Young.");
		else if (age>=13 && age<18)
			System.out.println("You are a Teenager.");
		else 
			System.out.println("You are old");
	}
	
	
	public static void main (String args[])
	{
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for (int i =0; i<=T; i++)
		{
			int age = sc.nextInt();
			ClassVsInstance ci = new ClassVsInstance(age);
			ci.amIOld();
			ci.yearPasses();
			ci.yearPasses();
			ci.yearPasses();
			ci.amIOld();
		}
		sc.close();
	}

}
