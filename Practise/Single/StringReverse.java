package Single;

import java.util.*;

public class StringReverse {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String B = reverse(A);
        if(A.equals(B))
            System.out.println("Yes");
        else
                        System.out.println("No");
        sc.close();
    }
        
     public static String reverse(String A)   
     {
        String B = "", sub = "";
        /* Enter your code here. Print output to STDOUT. */
        A=A.toLowerCase();
        int n = A.length();
        for(int i=0; i<A.length();i++)
        {
            sub = A.substring(n-i-1, n-i);
           B=B+sub; 
        }
       // System.out.println(B);
        return B;
     }
}
