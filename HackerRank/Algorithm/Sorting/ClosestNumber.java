import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the closestNumbers function below.
    static int[] closestNumbers(int[] arr) {
        Arrays.sort(arr);
        int[] diff = new int[arr.length-1];
        for(int i=1;i<arr.length;i++){
            diff[i-1]=arr[i]-arr[i-1];
        }
        Arrays.sort(diff);
        int min = diff[0];
        int k=1;
        int no_of_pairs = 1;
        while(diff[k]==min){
            no_of_pairs++;
            k++;
        }
        int[] fin = new int[2*no_of_pairs];
        int fin_ind = 0;
        for(int i=1;i<arr.length;i++){
            if(arr[i]-arr[i-1]==min){
                fin[fin_ind++]=arr[i-1];
                fin[fin_ind++]=arr[i];
            }
        }
        return fin;
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

        int[] result = closestNumbers(arr);

        for (int i = 0; i < result.length; i++) {
            bufferedWriter.write(String.valueOf(result[i]));

            if (i != result.length - 1) {
                bufferedWriter.write(" ");
            }
        }

        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
