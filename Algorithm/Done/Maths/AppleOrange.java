//https://www.hackerrank.com/challenges/apple-and-orange/problem

package Done.Maths;

import java.io.*;
import java.math.*;
import java.text.*;
import java.util.*;
import java.util.regex.*;

public class AppleOrange {

    /*
     * Complete the countApplesAndOranges function below.
     */
    static void countApplesAndOranges(int s, int t, int a, int b,int m, int n, int[] apples, int[] oranges) {
        /*
         * Write your code here.
         */int apple = 0;
        for (int i =0; i<m; i++)
        {
            int dis = a+apples[i];
            if(dis>=s && dis<=t)
                apple++;
        }
        
        int orange = 0;
        for(int i=0; i<n; i++)
        {
            int dis = b+oranges[i];
            if(dis>=s && dis<=t)
                orange++;
        }
        System.out.println(apple);
        System.out.println(orange);

    }

    private static final Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        String[] st = scan.nextLine().split(" ");

        int s = Integer.parseInt(st[0].trim());

        int t = Integer.parseInt(st[1].trim());

        String[] ab = scan.nextLine().split(" ");

        int a = Integer.parseInt(ab[0].trim());

        int b = Integer.parseInt(ab[1].trim());

        String[] mn = scan.nextLine().split(" ");

        int m = Integer.parseInt(mn[0].trim());

        int n = Integer.parseInt(mn[1].trim());

        int[] apple = new int[m];

        String[] appleItems = scan.nextLine().split(" ");

        for (int appleItr = 0; appleItr < m; appleItr++) {
            int appleItem = Integer.parseInt(appleItems[appleItr].trim());
            apple[appleItr] = appleItem;
        }

        int[] orange = new int[n];

        String[] orangeItems = scan.nextLine().split(" ");

        for (int orangeItr = 0; orangeItr < n; orangeItr++) {
            int orangeItem = Integer.parseInt(orangeItems[orangeItr].trim());
            orange[orangeItr] = orangeItem;
        }

        countApplesAndOranges(s, t, a, b,m, n, apple, orange);
    }
}
