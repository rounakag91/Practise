package Done.Maths;

import java.util.Scanner;

public class IntToByte {
	
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		String y = Integer.toBinaryString(x);
		String z = Integer.toBinaryString(10);
		System.out.println(y);
		System.out.println(y+z);
	}

}
