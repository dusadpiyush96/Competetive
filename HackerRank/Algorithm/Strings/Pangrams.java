import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the pangrams function below.
    static String pangrams(String s) {
        s=s.toLowerCase();
        char[] c = s.toCharArray();
        char[] alphabets= {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
        Arrays.sort(c);
        //System.out.println(c.length);
        if(c.length<26) return "not pangram";
        int k = 0;
        for(int i=0;i<c.length;i++){
            if(k==26) break;
            if(c[i]==alphabets[k]){
                k++;
                //System.out.println(k);
                continue;
            }
        }
        if(k==26) return "pangram";
        else return "not pangram";
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String s = scanner.nextLine();

        String result = pangrams(s);

        bufferedWriter.write(result);
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
