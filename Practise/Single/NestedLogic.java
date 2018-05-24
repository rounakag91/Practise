//https://www.hackerrank.com/challenges/30-nested-logic/problem

package Single;

import java.util.Scanner;

public class NestedLogic {
	
	public static void main(String args[]) {
		
		Scanner sc = new Scanner(System.in);
		int[] aDate = new int[3];
		int[] eDate = new int[3];
		for(int i=0; i<6; i++)
		{
			if(i<3)
				aDate[i] = sc.nextInt();
			else
				eDate[i-3] = sc.nextInt();
		}
		
		System.out.println(totalFine(aDate, eDate));
		
	}

	public static int totalFine(int[] aDate, int[] eDate) {
		int fine = 0;
		if(aDate[2]>eDate[2]) {
			fine = 10000;
		}
		else if(aDate[1]>eDate[1] && aDate[2]==eDate[2])
			fine = 500 * (aDate[1]-eDate[1]);
		else if(aDate[0]>eDate[0] && aDate[1]==eDate[1])
			fine = 15 * (aDate[0]-eDate[0]);
		
		return fine;
	}
	
}
