//https://www.hackerrank.com/challenges/java-1d-array/problem



package Done;

import java.util.Scanner;

public class Java1DLeap {

	    public static boolean canWin(int leap, int[] game) {
	        // Return true if you can win the game; otherwise, return false.

	    	return Win(leap, game, 0);
	    }
	    public static int[] status;
	    	
	    	public static boolean Win(int leap, int[] game, int current) {
	    	
	    		int size = game.length-1;
	    		status[current]=1;
	    	if(game[current]!=0)
	    		return false;
	    	if(current+leap>size || current+1>size)
	    		return true;
	    	if(status[current+leap]==0 && game[current+leap]==0)
	    	{
	    		if(Win(leap, game, current+leap))
	    			return true;
	    	}
	    	if(status[current+1]==0 && game[current+1]==0)
	    	{
	    		if(Win(leap, game, current+1))
	    			return true;
	    	}
	    	if(status[current-1]==0 && game[current-1]==0)
	    	{
	    		if(Win(leap, game, current-1))
	    			return true;
	    	}
	    	
	    	/*if(game == null || game.length == 0)
	            return false;
	        if(game.length == 1)
	            return true;
	    	
	    	int size = game.length-1;
	    	boolean result = false;
	    	for(int i =0; i<=size; i++)
	    	{
	    		if(i==size || i+leap>size+1)
	    			result = true;
	    		else if(game[i+leap]==0)
	    			i = i+leap;
	    		else if(game[i+1]==0)
	    			i = i+1;
	    		else if((i-1)>=0 && game[i-1]==0)
	    			i=i-1;
	    	}
	    	return result;
	*/
	    return false;	
	    }
	    public static void main(String[] args) {
	        Scanner scan = new Scanner(System.in);
	        int q = scan.nextInt();
	        while (q-- > 0) {
	            int n = scan.nextInt();
	            int leap = scan.nextInt();
	            
	            int[] game = new int[n];
	            for (int i = 0; i < n; i++) {
	                game[i] = scan.nextInt();
	            }

	            System.out.println( (canWin(leap, game)) ? "YES" : "NO" );
	        }
	        scan.close();
	    }
	}