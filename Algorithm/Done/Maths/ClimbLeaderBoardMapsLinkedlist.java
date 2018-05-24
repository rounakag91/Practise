package Done.Maths;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;
import static java.util.stream.IntStream.of;

public class ClimbLeaderBoardMapsLinkedlist {

	static LinkedList<Integer> ranks = new LinkedList<Integer>();
   
	
	// Complete the climbingLeaderboard function below.
    static int[] climbingLeaderboard(int[] scores, int[] alice) {
    	ranks.add(scores[0]);
    	for(int i=1; i<scores.length; i++) {
    		if(ranks.getLast() != scores[i]) {
    			ranks.add(scores[i]);
    		}
    	}
    	//System.out.println(ranks);

    	int[] result = new int[alice.length];
    	for(int j=0; j<alice.length; j++) {
    		if(!ranks.contains(alice[j])) {
    			for(int i=0; i<ranks.size(); i++) {
    				if(ranks.getLast()>alice[j]) {
    					ranks.add(alice[j]);
    					result[j] = ranks.indexOf(alice[j]) +1;
    					break;
    				}
    				else if(ranks.get(i)<alice[j]) {
    					ranks.add(i, alice[j]);
    					result[j] = i+1; 
    					break;
    				}
    				
    			}
    		}
    		else {
    			result[j] = ranks.indexOf(alice[j]) +1;
    		}
    	}
   // 	System.out.println(ranks);

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
            System.out.print(String.valueOf(result[i])+" ");

        
        }

     //   bufferedWriter.newLine();

     //   bufferedWriter.close();

        scanner.close();
    }
}
