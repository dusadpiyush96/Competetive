import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the fairRations function below.
    static int fairRations(int[] B) {
        int count = 0;
        for(int i=0;i<B.length-1;i++){
            if(B[i]%2==1){
                B[i]++;
                B[i+1]++;
                count+=2;
            }
        }
        if(B[B.length-1]%2==1) return -1;
        else return count;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] B = new int[N];
        for (int i = 0; i < N; i++) {
            B[i] = sc.nextInt();
        }
        int result = fairRations(B);
        if(result>=0) System.out.println(result);
        else System.out.println("NO");
    }
}
