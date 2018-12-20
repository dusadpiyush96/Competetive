import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the stones function below.
    static int[] stones(int n, int a, int b) {
        int[] possibilities = new int[n];
        int N = possibilities.length;
        int k=n-1;
        int l=0;
        for(int i=0;i<n;i++){
            possibilities[i] = a*k+b*l;
            //System.out.println(i+" "+possibilities[i]);
            k--; l++;
        }
        Arrays.sort(possibilities);
        return possibilities;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int TItr = 0; TItr < T; TItr++) {
            int n = sc.nextInt();
            int a = sc.nextInt();
            int b = sc.nextInt();
            int[] result = stones(n, a, b);
            int prev = -1;
            for (int i = 0; i < result.length; i++) {
                //if(result[i]==0) break;
                if(prev!=result[i]) System.out.print(result[i]+" ");
                prev = result[i];
            }
            System.out.println();
        }

    }
}
