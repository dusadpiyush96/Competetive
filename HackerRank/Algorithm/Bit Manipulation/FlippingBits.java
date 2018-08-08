import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the flippingBits function below.
    static long flippingBits(long n) {
        Queue<Integer> st = new LinkedList<Integer>();
        long k = n;
        while(k>=1){
            if(k%2==0){
                st.add(0);
            }
            else{
                st.add(1);
            }
            k/=2;
            //System.out.println(st.size());
        }
        int[] arr = new int[32];
        int j = st.size();
        for(int i=0;i<j;i++){
            arr[i]=st.remove();
        }
        for(int i=0;i<32;i++){
           // System.out.print(arr[i]);
            if(arr[i]==0) arr[i]=1;
            else arr[i]=0;
            //System.out.print(arr[i]);
        }
        long total = 0;
        long pow = 1;
        for(int i=0;i<32;i++){
            total+=pow*arr[i];
            pow*=2;
            System.out.println(i+" "+total);
        }
        return total;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int q = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int qItr = 0; qItr < q; qItr++) {
            long n = scanner.nextLong();
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            long result = flippingBits(n);

            bufferedWriter.write(String.valueOf(result));
            bufferedWriter.newLine();
        }

        bufferedWriter.close();

        scanner.close();
    }
}
