//https://www.hackerrank.com/challenges/save-the-prisoner/problem

package Done.Maths;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class SaveThePrisioner {

    // Complete the saveThePrisoner function below.
    static int saveThePrisoner(int n, int m, int s) {
            
    	int count = m%n;
/*    	int ans = count+s-1;
    	if((ans)>n){
             ans = (count+s)%n -1;
         }*/
    	int ans = (count+s-1)%n;
    	if(ans ==0)
    		ans = n;
    	return ans;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
      //  BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int t = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int tItr = 0; tItr < t; tItr++) {
            String[] nms = scanner.nextLine().split(" ");

            int n = Integer.parseInt(nms[0]);

            int m = Integer.parseInt(nms[1]);

            int s = Integer.parseInt(nms[2]);

            int result = saveThePrisoner(n, m, s);

            System.out.println(String.valueOf(result));
           System.out.println();
        }

       // bufferedWriter.close();

        scanner.close();
    }
}
