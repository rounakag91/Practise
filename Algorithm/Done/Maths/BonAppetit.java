package Done.Maths;

import java.util.Scanner;

public class BonAppetit {
	
	public static void main(String args[]) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		int[] bill = new int[n];
		for(int i=0; i<n; i++)
			bill[i] = sc.nextInt();
		int b = sc.nextInt();
		
		sc.close();
		int actualBill = bill(n, bill, k);
		
		if(actualBill == b)
			System.out.println("Bon Appetit");
		else {
			System.out.println(bill[k]/2);
		}
	}

	public static int bill(int n, int[] bill, int k) {
		int sum = 0;
		for(int i=0; i<n; i++)
		{
			if(i==k)
				continue;
			sum += bill[i];
		}
		return sum/2;
		
	}
}
