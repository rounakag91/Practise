package Done;
import java.util.Scanner;

public class Java1DPart2 {

 static int count =0;
    public static boolean canWin(int leap, int[] game,int cur) {
        // Return true if you can win the game; otherwise, return false.
    		//System.out.println(cur);
    	  if(cur < 0 || game[cur] == 1)
              return false;
          if(cur+1 >= game.length || cur+leap >= game.length) 
              return true;
          
          game[cur] = 1;
          count++;
          System.out.println(count);
	    	return canWin(leap, game, cur+leap) ||
	    			canWin(leap, game, cur+1) ||
	    			canWin(leap, game, cur-1);
	    	
                 
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

            System.out.println( (canWin(leap, game,0)) ? "YES" : "NO" );
        }
        scan.close();
    }
}