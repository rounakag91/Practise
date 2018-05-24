//https://www.hackerrank.com/challenges/time-conversion/problem

package Done.Maths;

import java.io.IOException;
import java.util.Scanner;

public class TimeConversion {
	
	
	
    private static final Scanner scan = new Scanner(System.in);

    public static void main(String[] args) throws IOException {

        String s = scan.nextLine();

        String result = timeConversion(s);
        System.out.println(result);

}

	private static String timeConversion(String s) {
		// TODO Auto-generated method stub
		if(s.substring(8).equals("PM") && !s.substring(0,2).equals("12"))
				s = Integer.toString((Integer.parseInt(s.substring(0, 2)))+12)
					+ s.substring(2, 8);
		else if(s.substring(8).equals("AM") && s.substring(0,2).equals("12"))
			s = "00" + s.substring(2, 8);
		else
			s = s.substring(0, 8);
		
		return s;
			
	}
	}
