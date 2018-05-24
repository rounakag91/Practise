package Single;

import java.util.Scanner;

public class BitwiseAND {
	
	 private static final Scanner scanner = new Scanner(System.in);

	    public static void main(String[] args) {
	        int t = scanner.nextInt();
	        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

	        for (int tItr = 0; tItr < t; tItr++) {
	            String[] nk = scanner.nextLine().split(" ");

	            int n = Integer.parseInt(nk[0]);

	            int k = Integer.parseInt(nk[1]);
	            if(((k-1)|k) > n && k%2==0){
	                System.out.println(k-2);
	            }else{
	                System.out.println(k-1);               
	            }
	           // System.out.println(bitAnd(n, k));
	        }

	        scanner.close();
	    }
	    
/*	    public static int bitAnd(int n, int k) {
	    	int max =0;
	    	String a, b;
	    	for(int i =1; i<=n;i++) {
	    		for(int j=i+1; j<=n; j++) {
	    			if((i&j)>max && (i&j)<k)
	    				max = i&j;
	    		}
	    	}
	    	return max;
	    }*/
	    
}
