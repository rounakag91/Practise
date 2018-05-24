package Single;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegEx {


    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int N = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        List<String> result = new ArrayList();
        String regEx = ".+@gmail\\.com";
        Pattern p = Pattern.compile(regEx);
        for (int NItr = 0; NItr < N; NItr++) {
            String[] firstNameEmailID = scanner.nextLine().split(" ");

            String firstName = firstNameEmailID[0];

            String emailID = firstNameEmailID[1];
            Matcher m = p.matcher(emailID);
            if(m.find())
                result.add(firstName);
        }
        Collections.sort(result);
        for(String i : result)
            System.out.println(i);

        scanner.close();
    }
}