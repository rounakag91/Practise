package Done.Maths;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;
import static java.util.stream.IntStream.of;

public class ClimbLeaderBoard {

	static HashMap<Integer, Integer> ranks = new HashMap<Integer, Integer>();
    // Complete the climbingLeaderboard function below.
    static int[] climbingLeaderboard(int[] scores, int[] alice) {
    	int[] ranks = of(scores).distinct().toArray();
    	/*for(int i=0; i<scores.length; i++) {
    		if(scores[i]!=scores[i-1])
    			ranks++;
    	}*/
    	
    	int i = ranks.length-1;
    	int[] result = new int[alice.length];
    	 for(int j=0; j<alice.length; j++) {
    	        while(i>=0) {
    	            if(alice[j]>=ranks[i]) i--;
    	            else {
    	            	result[j] = (i+2); break;}
    	        }
    	        if(i<0) result[j] = (1);
    	    }
    	
    	return result;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
       // BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int scoresCount = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] scores = new int[scoresCount];

        String[] scoresItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < scoresCount; i++) {
            int scoresItem = Integer.parseInt(scoresItems[i]);
            scores[i] = scoresItem;
        }

        int aliceCount = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] alice = new int[aliceCount];

        String[] aliceItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < aliceCount; i++) {
            int aliceItem = Integer.parseInt(aliceItems[i]);
            alice[i] = aliceItem;
        }

        int[] result = climbingLeaderboard(scores, alice);

        for (int i = 0; i < result.length; i++) {
            System.out.println(String.valueOf(result[i]));

            if (i != result.length - 1) {
                System.out.println();
            }
        }

     //   bufferedWriter.newLine();

     //   bufferedWriter.close();

        scanner.close();
    }
}
