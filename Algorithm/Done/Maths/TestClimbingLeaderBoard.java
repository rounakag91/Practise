package Done.Maths;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class TestClimbingLeaderBoard {
	
	static LinkedHashMap<Integer, Integer> ranks = new LinkedHashMap<Integer, Integer>();
	
	public static void main(String args[]) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] scores = new int[n];
		for(int i=0; i<n; i++)
			scores[i] = sc.nextInt();
		sc.close();
		ranks.put(scores[0], 1);
    	
    	int rank =1;
    	for(int i=1;i<scores.length; i++) {
    		//System.out.println(ranks.containsKey(scores[i]));
    		if(!ranks.containsKey(scores[i])) {
    			ranks.put(scores[i], ++rank);
    		}
    			
    	}
    	printMap();
    	System.out.println();

	int[] alice = {5, 25, 50, 120};
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
			System.out.println("Key : "+key);
			result[i] = ranks.get(key)+1;
			
		}
		System.out.println(alice[i]+":"+result[i]+"\n");
	}
	}
	
	static void printMap() {
		for(int k : ranks.keySet()) {
			
    		System.out.println(k+" : "+ranks.get(k));
		}
	}
}

