package Done.Maths;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class MagicSquare {

    // Complete the formingMagicSquare function below.
    static int formingMagicSquare(int[][] s) {
        int[][] frame1 =
        	{{4, 9, 2},
        	 {3, 5, 7},
        	 {8, 1, 6}};

            int[][] frame11 =
        	{{8, 1, 6},
        	 {3, 5, 7},
        	 {4, 9, 2}};

            int[][] frame2 =
        	{{8, 3, 4},
        	 {1, 5, 9},
        	 {6, 7, 2}};

            int[][] frame12 =
        	{{4, 3, 8},
        	 {9, 5, 1},
        	 {2, 7, 6}};

            int[][] frame3 =
        	{{6, 1, 8},
        	 {7, 5, 3},
        	 {2, 9, 4}};

            int[][] frame13 =
        	{{2, 9, 4},
        	 {7, 5, 3},
        	 {6, 1, 8}};

            int[][] frame4 =
        	{{2, 7, 6},
        	 {9, 5, 1},
        	 {4, 3, 8}};

            int[][] frame14 =
        	{{6, 7, 2},
        	 {1, 5, 9},
        	 {8, 3, 4}};

            int cost1 = diff(s, frame1);
            int cost2 = diff(s, frame2);
            int cost3 = diff(s, frame3);
            int cost4 = diff(s, frame4);

            int cost11 = diff(s, frame11);
            int cost12 = diff(s, frame12);
            int cost13 = diff(s, frame13);
            int cost14 = diff(s, frame14);

            int min = Math.min(cost1, Math.min(cost2, Math.min(cost3, cost4)));
            int min1 = Math.min(cost11, Math.min(cost12, Math.min(cost13, cost14)));
            return (Math.min(min,min1));
            
          }
    
          private static int diff(int[][] numbers, int[][] frame) {
            int cost = 0;
            for (int i = 0; i < 3; i++) {
              for (int j = 0; j < 3; j++) {
        	cost += Math.abs(numbers[i][j] - frame[i][j]);
              }
            }
            return cost;
          }


    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int[][] s = new int[3][3];

        for (int i = 0; i < 3; i++) {
            String[] sRowItems = scanner.nextLine().split(" ");
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            for (int j = 0; j < 3; j++) {
                int sItem = Integer.parseInt(sRowItems[j]);
                s[i][j] = sItem;
            }
        }

        int result = formingMagicSquare(s);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
