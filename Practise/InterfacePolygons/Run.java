package InterfacePolygons;

import java.util.Scanner;

public class Run {

	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		sc.close();
		
		AdvancedArithmetic myCalc = new Calculator();
		int sum = myCalc.divisorSum(num);
		System.out.println("I implemented: " + myCalc.getClass().getInterfaces()[0].getSimpleName()+ "\n" +sum);
	}
	
}
