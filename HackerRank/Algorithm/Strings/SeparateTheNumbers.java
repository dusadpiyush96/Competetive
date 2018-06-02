import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;
public class Solution {
    static void separateNumbers(String s) {
        for(int i=1;i<=s.length()/2;i++){
            String first = s.substring(0,i);
            long x = Long.parseLong(first);
            long k = x;
            String t = "";
            while(first.length()+t.length()<=s.length()){
                first+=(++k);
                t = Long.toString(k);
            }
            if(first.equals(s)) {
                System.out.println("YES "+x);
                return;
            }
        }
        System.out.println("NO ");
    }
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int q = scanner.nextInt();
        
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        for (int qItr = 0; qItr < q; qItr++) {
            String s = scanner.nextLine();

            separateNumbers(s);
        }

        scanner.close();
    }
}
