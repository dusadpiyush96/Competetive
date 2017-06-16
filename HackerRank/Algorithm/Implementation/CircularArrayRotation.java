import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        int q = in.nextInt();
        int[] a = new int[n];
        for(int a_i=0; a_i < n; a_i++){
            a[a_i] = in.nextInt();
        }
        int[] a1 = new int[n];
        int start = k%n;
        int curr = start;
        boolean rev= true;
        int t=1;
        for(int i=0;i<n;i++){
            if(curr<n && rev){
                a1[curr] = a[i];
                
                curr++;
            }
            else{
                rev = false;
                if(t==1){
                    curr=0;
                    t=0;
                }
                a1[curr]=a[i];
                curr++;
            }
        }
        for(int a0 = 0; a0 < q; a0++){
            int m = in.nextInt();
            System.out.println(a1[m]);
            
        }
    }
}
