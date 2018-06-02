import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the funnyString function below.
    static String funnyString(String s) {
        int[] diff_fowd = new int[s.length()-1];
        int[] diff_rev = new int[s.length()-1];
        char[] c = s.toCharArray();
        
        for(int i=0;i<c.length-1;i++){
            diff_fowd[i]=Math.abs(c[i+1]-c[i]);
            //System.out.println(diff_fowd[i]);
        }
        int k=0;
        for(int i=c.length-1;i>0;i--){
            diff_rev[k++]=Math.abs(c[i-1]-c[i]);
            //System.out.println(diff_rev[i]);
        }
        if(Arrays.equals(diff_fowd,diff_rev)) return "Funny";
        else return "Not Funny";
        //return "";
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int q = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int qItr = 0; qItr < q; qItr++) {
            String s = scanner.nextLine();

            String result = funnyString(s);

            bufferedWriter.write(result);
            bufferedWriter.newLine();
        }

        bufferedWriter.close();

        scanner.close();
    }
}
