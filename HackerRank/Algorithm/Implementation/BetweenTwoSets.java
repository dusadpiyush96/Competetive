import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        int[] a = new int[n];
        for(int a_i=0; a_i < n; a_i++){
            a[a_i] = in.nextInt();
        }
        int[] b = new int[m];
        for(int b_i=0; b_i < m; b_i++){
            b[b_i] = in.nextInt();
        }
        Arrays.sort(a);
        Arrays.sort(b);
        ArrayList<Integer> list = new ArrayList<Integer>();
        for(int i=a[a.length-1];i<=b[0];i++){
           list.add(i);
        }
        int count=0;
        for(int i : list){
        	if(checkDivisible(i,b) && checkFactors(i,a)){
        		count++;
        	}
        }
        System.out.println(count);
    }
    
    public static boolean checkDivisible(int d,int[] arr){
        for(int i : arr){
            if(i%d!=0){
                return false;
            }
        }
        return true;
    }
    
    public static boolean checkFactors(int d,int[] arr){
    	for(int i : arr){
            if(d%i!=0){
                return false;
            }
        }
        return true;
    }
}

