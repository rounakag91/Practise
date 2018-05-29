package Done.Maths;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class AppendDelete2 {

	// Complete the appendAndDelete function below.
	static String appendAndDelete(String s, String t, int k) {
		int lens = s.length();
		int lent = t.length();
		int commonLength = 0;
		for(int i=0; i<Math.min(lent, lens); i++) {
			if (s.charAt(i)==t.charAt(i))
				commonLength++;
			else
				break;
		}

		if(lent>lens) {
			if((lent-lens)%2==0)
				return "Yes";
			else
				return "No";
		}

		int needToProcess = (lent + lens) - 2*commonLength;

		if (needToProcess <= k) {
			return "Yes";
		}

		return "No";    
	}

	private static final Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) throws IOException {
		// BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

		String s = scanner.nextLine();

		String t = scanner.nextLine();

		int k = scanner.nextInt();
		scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

		String result = appendAndDelete(s, t, k);

		System.out.println(result);

		//bufferedWriter.close();

		scanner.close();
	}
}
