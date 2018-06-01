import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the caesarCipher function below.
    static String caesarCipher(String s, int k) {
        char[] chars = s.toCharArray();
        //char[] small_case = {'a','b'}
        for(int i=0; i<chars.length;i++){
            int a = (int)chars[i];
            //System.out.println(a);
            k%=26;
            if(a>=97 && a<=122){
                if(a+k>122){
                    chars[i] = (char)(k+a-26);
                }
                else chars[i] = (char)(k+a);
                //System.out.println(chars[i]);
            }
            if(a>=65 && a<=90){
                if(a+k>90 && a>=65){
                    chars[i] = (char)(k+a-26);
                }
                else chars[i] = (char)(k+a);
                //System.out.println(chars[i]);
            }
        }
        return new String(chars);
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        String s = scanner.nextLine();

        int k = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        String result = caesarCipher(s, k);

        bufferedWriter.write(result);
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
