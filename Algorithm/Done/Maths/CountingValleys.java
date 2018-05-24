//https://www.hackerrank.com/challenges/counting-valleys/problem
package Done.Maths;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class CountingValleys {

    // Complete the countingValleys function below.
    static int countingValleys(int n, String s) {
    	//Stack<Character> valleys = new Stack<>();
    	char[] steps = s.toCharArray();
    	int seaLevel =0;
    	int valley = 0;
    	char start = steps[0];
    	for(int i = 0; i<steps.length; i++)
    	{
    		
    		if(steps[i] == 'U') {
    			seaLevel++;
    		}
    		if(steps[i] == 'D') {
    			seaLevel--;
    		}
    		if(seaLevel==0) {
    			if(start=='D')
    				valley++;
    			if(i<steps.length-1)
    				start=steps[i+1];
    		}
    	}
    	
    	return valley;
    	
    	//Alternative - 8
    	//UDDDUDUU
    	//alt is :1
    	//alt is :0
    	//alt is :-1
    	//alt is :-2
    	//alt is :-1
    	//alt is :-2
    	//alt is :-1 - increase valley if next is up
    	//alt is :0
    	/*for(char c : hike) {
            // Step up
            if(c == 'U') {
                if(altitude == -1) {
                    count++;
                }
                altitude++;
            }
            // Step down
            else {
                altitude--;
            }
            System.out.println("alt is :"+altitude);
        }*/
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
       // BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        String s = scanner.nextLine();

        int result = countingValleys(n, s);

      System.out.println(String.valueOf(result));
      System.out.println();
       // bufferedWriter.close();

        scanner.close();
    }
}
