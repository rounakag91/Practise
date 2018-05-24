package Done.Maths;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class ArrayCircularRott {

    // Complete the circularArrayRotation function below.
    static int[] circularArrayRotation(int[] a, int[] m, int k) {
    	int[] a1 = new int[a.length];
    	k = k%a.length;
    	int k1=k;
    	int i=0;
    	while(k1!=0) {
			a1[i] = a[a.length-k1];
			k1--;
			i++;
		}
		System.out.println("I is now : "+i);
		for(int j=0; j<a.length-k; j++) {
			a1[i] = a[j];
			i++;
		}
    		
    	for(int z =0; z<m.length; z++) {
    		m[z] = a1[m[z]];
    	}
    	return m;

    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
     //   BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String[] nkq = scanner.nextLine().split(" ");

        int n = Integer.parseInt(nkq[0]);

        int k = Integer.parseInt(nkq[1]);

        int q = Integer.parseInt(nkq[2]);

        int[] a = new int[n];

        String[] aItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int aItem = Integer.parseInt(aItems[i]);
            a[i] = aItem;
        }

        int[] m = new int[q];

        for (int i = 0; i < q; i++) {
            int mItem = scanner.nextInt();
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
            m[i] = mItem;
        }

        int[] result = circularArrayRotation(a, m, k);

        for (int i = 0; i < result.length; i++) {
           System.out.println(String.valueOf(result[i]));

            if (i != result.length - 1) {
                System.out.println();
            }
        }

   //     bufferedWriter.newLine();

     //   bufferedWriter.close();

        scanner.close();
    }
}
