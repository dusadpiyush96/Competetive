import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the palindromeIndex function below.
    static int palindromeIndex(String s) {
        char[] arr = s.toCharArray();
        if(s.length()==1) return 0;
        for(int i=0;i<s.length()/2;i++){
            if(arr[i]==arr[arr.length-1-i]) continue;
            if(i!=0){
                if(arr[arr.length-1-i]==arr[i+1] && arr[i]== arr[arr.length - 2 - i]) {
                    if (arr[arr.length - 2 - i] == arr[i + 2])
                        return i;
                    else
                        return arr.length - 1 - i;                    
                }
                if(arr[arr.length-1-i]==arr[i+1]) return i;
                else return arr.length-1-i;
            }
            else {
                if(arr[1]==arr[arr.length-1]) return 0;
                else return arr.length-1;
            }
        }
        if(s.length()%2==1) return (s.length()/2)+1;
        return -1;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int q = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int qItr = 0; qItr < q; qItr++) {
            String s = scanner.nextLine();

            int result = palindromeIndex(s);

            bufferedWriter.write(String.valueOf(result));
            bufferedWriter.newLine();
        }

        bufferedWriter.close();

        scanner.close();
    }
}
