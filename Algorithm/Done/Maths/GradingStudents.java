package Done.Maths;

//https://www.hackerrank.com/challenges/grading/problem

import java.io.*;
import java.math.*;
import java.text.*;
import java.util.*;
import java.util.regex.*;

public class GradingStudents {

    /*
     * Complete the gradingStudents function below.
     */
    static int[] gradingStudents(int[] grades) {
        /*
         * Write your code here.
         */
    	int buf[] = new int[grades.length];
    	for(int i=0; i<grades.length; i++)
    	{
    		if(grades[i]>=38 && (grades[i]%5)>=3) {

    				buf[i] = grades[i] + (5-grades[i]%5);
    			}
    		else
    			buf[i] = grades[i];
    	}
    	return buf;

    }

    private static final Scanner scan = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
       // BufferedWriter bw = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = Integer.parseInt(scan.nextLine().trim());

        int[] grades = new int[n];

        for (int gradesItr = 0; gradesItr < n; gradesItr++) {
            int gradesItem = Integer.parseInt(scan.nextLine().trim());
            grades[gradesItr] = gradesItem;
        }

        int[] result = gradingStudents(grades);

        for (int resultItr = 0; resultItr < result.length; resultItr++) {
           System.out.println(String.valueOf(result[resultItr]));

            if (resultItr != result.length - 1) {
               System.out.println("\n");
            }
        }

       // bw.newLine();

     //   bw.close();
    }
}
