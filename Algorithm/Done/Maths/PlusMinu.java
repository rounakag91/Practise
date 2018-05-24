//https://www.hackerrank.com/challenges/plus-minus/problem
//Format Output to 5 decimal places.
package Done.Maths;

import java.io.*;
import java.math.*;
import java.text.*;
import java.util.*;
import java.util.regex.*;

public class PlusMinu {

    /*
     * Complete the plusMinus function below.
     */
    static void plusMinus(int[] arr) {
        /*
         * Write your code here.
         */
        int neg = 0;
        int pos = 0;
        int zero = 0;
        for (int i : arr)
        {
            if(i==0)
                zero++;
            else if(i>0)
                pos++;
            else
                neg++;
        }
        DecimalFormat df = new DecimalFormat("#.######");
        System.out.println(df.format(pos/(double)arr.length));
        System.out.println(df.format(neg/(double)arr.length));
        System.out.println(df.format(zero/(double)arr.length));


    }

    private static final Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        int n = Integer.parseInt(scan.nextLine().trim());

        int[] arr = new int[n];

        String[] arrItems = scan.nextLine().split(" ");

        for (int arrItr = 0; arrItr < n; arrItr++) {
            int arrItem = Integer.parseInt(arrItems[arrItr].trim());
            arr[arrItr] = arrItem;
        }

        plusMinus(arr);
    }
}
