import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the isBalanced function below.
    static String isBalanced(String s) {
        char[] alphabets = s.toCharArray();
        Stack<Character> st_forw = new Stack<Character>();
        int k=0;
        for(int i=0;i<alphabets.length;i++){
            if((int)alphabets[i] == 40 || (int)alphabets[i] == 91 || (int)alphabets[i] == 123) {
                st_forw.push(alphabets[i]);
                k = (int)alphabets[i];
            }
            else{
                if((k==40 && (int)alphabets[i]==41) || (k == 91 && (int)alphabets[i] == 93) || (k == 123 && (int)alphabets[i] == 125)){ 
                if(st_forw.size()!=0) {
                        st_forw.pop();
                        if(st_forw.size()!=0) k = (int)st_forw.peek();
                        else k = -1;
                    }
                    continue;
                }
                else return "NO";
            }
        }
        if(st_forw.size()!=0) return "NO";
        return "YES";
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int t = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int tItr = 0; tItr < t; tItr++) {
            String s = scanner.nextLine();

            String result = isBalanced(s);

            bufferedWriter.write(result);
            bufferedWriter.newLine();
        }

        bufferedWriter.close();

        scanner.close();
    }
}
