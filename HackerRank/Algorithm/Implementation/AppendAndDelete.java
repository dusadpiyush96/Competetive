import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the appendAndDelete function below.
    static String appendAndDelete(String s, String t, int k) {
        int index = -1;
        boolean big = false;
        for(int i=0;i<t.length();i++){
            if(i==s.length()){
                big = true;
                break;
            }
            if(s.charAt(i)!=t.charAt(i)){
                index = i;
                break;
            }
            
        }
        if(big){
            if(t.length()-s.length()>k) return "No";
            else return "Yes";
        }
        if(index==-1){
            if(s.length()-t.length()>k) return "No";
            else return "Yes";
        }
        else{
            int steps = s.length()+t.length()-2*index;
            if(steps>2*k) return "No";
            else return "Yes";
        }
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String s = scanner.nextLine();

        String t = scanner.nextLine();

        int k = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        String result = appendAndDelete(s, t, k);

        bufferedWriter.write(result);
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
