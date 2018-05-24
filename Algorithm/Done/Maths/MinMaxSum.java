//https://www.hackerrank.com/challenges/mini-max-sum/problem
package Done.Maths;

import java.io.*;
import java.math.*;
import java.text.*;
import java.util.*;
import java.util.regex.*;

public class MinMaxSum {

    /*
     * Complete the miniMaxSum function below.
     */
    static void miniMaxSum(int[] arr) {
        /*
         * Write your code here.
         */
/*    	long sum =0;
    	for(int i=0; i<arr.length; i++)
    		sum += arr[i];
        
    	long max = 0;
    	long min = sum;
        long temp;
    	for(int i=0; i<arr.length; i++)
    	{
    		temp = sum - arr[i];
    		if(temp>max)
    			max = temp;
    		if(temp<min)
    			min=temp;
    	}
    	
    	System.out.println(min+" " +max);*/
    	
    	
    //Or
    	int sum =0;
    	long min = 1000000000;
    	long max = 0;
    	for(int i=0; i<arr.length; i++)
    	{
    		sum += arr[i];
    		if(arr[i]>max)
    			max = arr[i];
    		if(arr[i]<min)
    			min = arr[i];
    	}
    	System.out.println((sum-max)+" " +(sum-min));


    }

    private static final Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        int[] arr = new int[5];

        String[] arrItems = scan.nextLine().split(" ");

        for (int arrItr = 0; arrItr < 5; arrItr++) {
            int arrItem = Integer.parseInt(arrItems[arrItr].trim());
            arr[arrItr] = arrItem;
        }

        miniMaxSum(arr);
    }
}
