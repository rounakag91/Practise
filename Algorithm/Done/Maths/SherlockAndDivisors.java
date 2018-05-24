package Done.Maths;

//https://www.hackerrank.com/challenges/sherlock-and-divisors/problem

import java.io.*;
import java.math.*;
import java.text.*;
import java.util.*;
import java.util.regex.*;

public class SherlockAndDivisors {

    /*
     * Complete the divisors function below.
     */
    static int divisors(int n) {
        /*
        * Write your code here.
        */
   	
   	int count =0;
   	for(int i =1; i<=Math.sqrt(n); i++)
   	{
   		if(n%i == 0)
   			if(i%2==0 && (n/i)==i) {
   				count++;
   		}
   			else {
                   if(i%2==0)
   				    count++;
                   if((n/i)%2==0)
                       count++;
   			}
   			
   	}
   	return count;

   }
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        //BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int t = Integer.parseInt(scanner.nextLine().trim());

        for (int tItr = 0; tItr < t; tItr++) {
            int n = Integer.parseInt(scanner.nextLine().trim());

            int result = divisors(n);

            System.out.println(String.valueOf(result));
            System.out.println();
        }
    }
}
