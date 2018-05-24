package Done.Maths;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class DayOfTheProgrammer {

    // Complete the solve function below.
    static String solve(int year) {
    	if((year<=1917 && year%4==0) || ((year)>1918 && (year%400==0) || (year%4==0 && year%100!=0))){
    		return "12.09."+year;
    	}
    	else if(year == 1918) {
    		return "26.09."+year;
    	}
    	else {
    		return "13.09."+year;
    	}
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        //BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int year = scanner.nextInt();
        //scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        String result = solve(year);

       System.out.println(result);
        System.out.println();

       // bufferedWriter.close();

        scanner.close();
    }
}
