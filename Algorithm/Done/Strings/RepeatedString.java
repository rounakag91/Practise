package Done.Strings;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class RepeatedString {

    // Complete the repeatedString function below.
    static long repeatedString(String s, long n) {
    	long repeat = (n/s.length());
    	int remain = (int) (n%s.length());
    	int count =0;
    	for(int i=0; i<s.length(); i++) {
    		if(s.charAt(i)=='a') {
    			count++;
    		}
    	}
    	long ans = (count*repeat);
    	for(int i=0; i<remain;i++) {
    		if(s.charAt(i)=='a')
    			ans++;
    	}
    	return ans;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
       // BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String s = scanner.nextLine();

        long n = scanner.nextLong();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        long result = repeatedString(s, n);

       System.out.println(String.valueOf(result));
     

       // bufferedWriter.close();

        scanner.close();
    }
}
