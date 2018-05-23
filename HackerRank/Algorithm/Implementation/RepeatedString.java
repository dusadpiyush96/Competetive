import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;


public class Solution {

    // Complete the repeatedString function below.
    static long repeatedString(String s, long n) {
        char[] str = s.toCharArray();
        int i,j=0;
        long k=n;
        if(n<=str.length){
            for(i=0;i<str.length;i++){
                if(str[i]=='a') j++;
                if(i==n-1) break;
            }
            return j;
        }
        else{
            for(i=0;i<str.length;i++){
                if(str[i]=='a') j++;
             }
            long q=n/str.length;
            long total=q*j;
            long l=n%str.length;
            for(i=0;i<l;i++){
                if(str[i]=='a') total++;
             }
            return total;
        }
        
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String s = scanner.nextLine();

        long n = scanner.nextLong();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        long result = repeatedString(s, n);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
