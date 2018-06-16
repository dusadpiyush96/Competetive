import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the gameOfThrones function below.
    static String gameOfThrones(String s) {
        int[] arr = new int[26];
        if(s.length()%2==0){
            for(int i=0;i<s.length();i++){
                arr[s.charAt(i)-97]++;
            }
            for(int i : arr){
                if(i%2!=0) return "NO";
            }
            return "YES";
        }
        else{
            for(int i=0;i<s.length();i++){
                arr[s.charAt(i)-97]++;
            }
            boolean done = false;
            for(int i : arr){
                if(i%2!=0 && !done){
                    done = true;
                    continue;
                }
                if(i%2!=0) return "NO";
            }
            return "YES";
        }
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String s = scanner.nextLine();

        String result = gameOfThrones(s);

        bufferedWriter.write(result);
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
