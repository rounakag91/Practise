package Single;

import java.util.Scanner;

public class ConvertToBinary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext())
		{
			int num = sc.nextInt();
			System.out.println(binary(num));
		}
		sc.close();
		
	}
	
	public static String binary(int n)
	{
		String s = "";
		while(n!=0)
		{
			int b = n%2;
			s +=  Integer.toString(b);
			n = n/2;
		}
		return StringReverse.reverse(s);
		
	}

}
