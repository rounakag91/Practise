package Done.Maths;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class PermutationEquation {

	// Complete the permutationEquation function below.
 	static int[] permutationEquation(int[] p) {
		int[] result = new int[p.length];
/*		int[] buf = new int[p.length];
		for(int i=0; i<p.length; i++) {
			for(int j=0; j<p.length; j++) {
				if((i+1)==p[j]) {
					buf[i] = j+1;
				}
			}
		}
		
		for(int i=0; i<p.length; i++) {
			for(int j=0; j<p.length; j++) {
				if(p[j]==buf[i]) {
					result[i] = j+1;
				}
			}
		}*/
        List<Integer> ar = new ArrayList<Integer>();
        
        for(int i=0; i<p.length; i++) {
        	ar.add(p[i]);
        }
        System.out.println(ar);
        for(int i=0; i<ar.size(); i++) {
        	result[i] = ar.indexOf(ar.indexOf(i+1)+1) +1;
        }
		
		return result;

	}


	private static final Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) throws IOException {
		//BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

		int n = scanner.nextInt();
		scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

		int[] p = new int[n];

		String[] pItems = scanner.nextLine().split(" ");
		scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

		for (int i = 0; i < n; i++) {
			int pItem = Integer.parseInt(pItems[i]);
			p[i] = pItem;
		}

		int[] result = permutationEquation(p);

		for (int i = 0; i < result.length; i++) {
			System.out.println(String.valueOf(result[i]));

			if (i != result.length - 1) {
				System.out.println();
			}
		}

//		bufferedWriter.newLine();

//		bufferedWriter.close();

		scanner.close();
	}
}
