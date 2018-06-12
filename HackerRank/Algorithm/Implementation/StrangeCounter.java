import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the strangeCounter function below.
    static long strangeCounter(long t) {
        long x= t;
        //int d = x/3;
        long nm = 0;
        long k = 1;
        
        while((t/(6*nm+3))>=1.0){
            System.out.println((6*nm+3));
            //if((x%(6*nm+3))==0) return 1;
            //x/=(6*nm+3);
            nm+=k;
            k*=2;
        }
        if((x%(6*(nm-k/2)+3))==0) return 1;
        long last = 6*nm+3;
        return last-t+1;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        long t = scanner.nextLong();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        long result = strangeCounter(t);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
