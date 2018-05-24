//https://www.hackerrank.com/challenges/30-review-loop/problem - Divide string based on even and odd indexes and print string.
package Single;

import java.util.*;

public class review {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int i=0;i<T; i++)
        {
            String S = sc.next();
            Test obj = new Test(S);
            System.out.println(obj.getEven());
            System.out.println(obj.getOdd());
           
        } 
        sc.close();
    }
}

class Test {
    private String S;
    
    public Test(String S) {
    	this.S=S;
    }
   // char[] temp;
    
    public String getEven()
    {
        String temp = "";
        //this.S = S1;
        //temp = S.toCharArray();
        for (int i=1; i<S.length(); i=i+2)
        {
        	temp += S.charAt(i);
        }
        return temp;
    }
    
    public String getOdd()
    {
        String temp = "";
    	//this.S = S2;
    	for (int i=0; i<S.length(); i=i+2)
        {
        	temp += S.charAt(i);
        }
        return temp;
    }
}