//https://www.hackerrank.com/challenges/birthday-cake-candles/problem

package Done.Maths;
	
	import java.io.*;
	import java.math.*;
	import java.text.*;
	import java.util.*;
	import java.util.regex.*;

	public class BirthdayCakeCandles {

	    /*
	     * Complete the birthdayCakeCandles function below.
	     */
	    static int birthdayCakeCandles(int n, int[] ar) {
	        /*
	         * 2 for loops.
	         */
	 /*   	int max = 0;
	    	int candle = 0;
	    	for(int i=0; i<n; i++)
	    	{
	    		if(ar[i]>max)
	    			max = ar[i];
	    	}
	    	for(int i=0;i<n;i++) {
	    		if(ar[i]==max)
	    			candle++;
	    	}
	    	return candle;*/
	    	
	    	
	    	//1 for loop
	    	int max = 0;
	    	int candle = 0;
	    	for(int i=0; i<n; i++) {
	    		if(ar[i]>max) {
	    			max = ar[i];
	    			candle =1;
	    		}
	    		if(i==max)
	    			candle++;
	    	}
	    	return candle;

	    }

	    private static final Scanner scan = new Scanner(System.in);

	    public static void main(String[] args) throws IOException {
	       // BufferedWriter bw = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

	        int n = Integer.parseInt(scan.nextLine().trim());

	        int[] ar = new int[n];

	        String[] arItems = scan.nextLine().split(" ");

	        for (int arItr = 0; arItr < n; arItr++) {
	            int arItem = Integer.parseInt(arItems[arItr].trim());
	            ar[arItr] = arItem;
	        }

	        int result = birthdayCakeCandles(n, ar);
	        System.out.println(String.valueOf(result));
	       // bw.write(String.valueOf(result));
	       // bw.newLine();

	      //  bw.close();
	    }
	}

