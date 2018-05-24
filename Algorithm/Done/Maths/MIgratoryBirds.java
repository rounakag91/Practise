//https://www.hackerrank.com/challenges/migratory-birds/problem

package Done.Maths;

import java.io.*;
import java.math.*;
import java.text.*;
import java.util.*;
import java.util.regex.*;

public class MIgratoryBirds {

    // Complete the migratoryBirds function below.
    static int migratoryBirds(int n, int[] ar) {
    	int [] count = new int[5];
    	for(int i =0; i<n; i++)
    	{
    		//System.out.println(i);
    		switch(ar[i]) {
    		case 1 : count[0]++;
                     break;
    		case 2 : count[1]++;
                    break;
    		case 3 : count[2]++;
                    break;
    		case 4 : count[3]++;
                    break;
    		case 5 : count[4]++;
                    break;
    		}
    	}
    	
    	int maxIndex = 0;
    	int max=0;
    	for(int i=0; i<5; i++)
    		if(max<count[i]) {
    			max = count[i];
    			maxIndex = i;
    		}
    		
    	return maxIndex+1;//aray starts from 0
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
     //   BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int arCount = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] ar = new int[arCount];

        String[] arItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int arItr = 0; arItr < arCount; arItr++) {
            int arItem = Integer.parseInt(arItems[arItr]);
            ar[arItr] = arItem;
        }

        int result = migratoryBirds(arCount, ar);

        System.out.println(String.valueOf(result));
        System.out.println();
       // bufferedWriter.close();

        scanner.close();
    }
}
