//https://www.hackerrank.com/challenges/beautiful-days-at-the-movies/problem

package Done.Maths;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class BeautifulDays {

    // Complete the beautifulDays function below.
    static int beautifulDays(int i, int j, int k) {
    	//System.out.print(reverse(123456));
    	int count =0;
    	while(i<=j) {
    		if((Math.abs(i-reverse(i)))%k==0) {
    			count++;
    		}
    		i++;
    		
    	}
    	return count;
    }
    
    static int reverse(int n) {
    	int r =0;
    	while(n!=0) {
    		r = (r*10) + (n%10);
    		n = n/10;
    	}
    	return r;
    }
    

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
       // BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String[] ijk = scanner.nextLine().split(" ");

        int i = Integer.parseInt(ijk[0]);

        int j = Integer.parseInt(ijk[1]);

        int k = Integer.parseInt(ijk[2]);

        int result = beautifulDays(i, j, k);

       System.out.println(String.valueOf(result));
       System.out.println();

       // bufferedWriter.close();

        scanner.close();
    }
}
