//Used LinkedhashMap to solve - correct output - timeout exception

package Done.Maths;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class ClimbLeaderBoardMaps {

	static HashMap<Integer, Integer> ranks = new HashMap<Integer, Integer>();
    // Complete the climbingLeaderboard function below.
    static int[] climbingLeaderboard(int[] scores, int[] alice) {
    	
		ranks.put(scores[0], 1);
    	
    	int rank =1;
    	for(int i=1;i<scores.length; i++) {
    		//System.out.println(ranks.containsKey(scores[i]));
    		if(!ranks.containsKey(scores[i])) {
    			ranks.put(scores[i], ++rank);
    		}
    	}
    
    	
    	//for(int k : ranks.keySet())
    	//	System.out.println(ranks.get(k));
    	
    	int[] result = new int[alice.length];
    	for(int i=0; i<alice.length; i++)
    	{
    		if(ranks.containsKey(alice[i])) {
    			result[i] = ranks.get(alice[i]);
    		}
    		else if(alice[i]>scores[0])
    			result[i] =1;
    		else {
    			int key = 0;
    			for(int k : ranks.keySet()) {
    				if(k>=alice[i]) {
    					key = k;
    				}
    			}
    			//System.out.println("Key : "+key);
    			result[i] = ranks.get(key)+1;
    			
    		}
    		//System.out.println(alice[i]+":"+result[i]+"\n");
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
