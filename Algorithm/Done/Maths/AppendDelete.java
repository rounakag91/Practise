package Done.Maths;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class AppendDelete {

    // Complete the appendAndDelete function below.
    static String appendAndDelete(String s, String t, int k) {
    	int lens = s.length();
    	int lent = t.length();
    	System.out.println("T : "+lent+"  , S : "+lens);
    	int count =0;
    	if(lent>lens) {
    		if((lent-lens)<=k) {
    			return "Yes";
    		}
    		else
    			return "No";
    	}
    /*	else if(lens>lent) {
    		if((lens-lent)<=k) {
    			return "Yes";
    		}
    		else
    			return "No";
    	}*/
    	else {
    		for(int i=1; i<=lent; i++) {
    			System.out.println("s " +s.substring(0, i));
    			System.out.println("t " +t.substring(0, i));

    			if(s.substring(0, i).equals(t.substring(0, i))) {
    				count=i;
    			}
    		}
    		System.out.println("Count : " +count);
    		int ans = (lent-count) + (lens-count);
    		System.out.println("Ans : "+ans);
    		if(ans<=k)
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
