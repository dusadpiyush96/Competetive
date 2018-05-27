import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the equalizeArray function below.
    static int equalizeArray(int[] arr) {
        int[] freq = new int[100];
        //int searching=0;
        for(int i=0;i<100;i++){
            
            for(int j=0;j<arr.length;j++){
                if(arr[j]==i+1) freq[i]++;
            }
        }
        int max_freq_index,max_freq=0;
        max_freq=freq[0];
        for(int i=1;i<100;i++){
            if(freq[i]>max_freq){
                max_freq_index=i;
                max_freq=freq[i];
            }
        }
        return arr.length-max_freq;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] arr = new int[n];

        String[] arrItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int arrItem = Integer.parseInt(arrItems[i]);
            arr[i] = arrItem;
        }

        int result = equalizeArray(arr);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
