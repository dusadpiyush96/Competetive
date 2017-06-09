import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    
    public static boolean isBeautiful(int x,int k){
        ArrayList<Integer> list = new ArrayList<Integer>();
        int num = x;
        while(num!=0){
            list.add(num%10);
            num/=10;
        }
        int fac=1;
        int xRev=0;
        for(int i=list.size()-1;i>=0;i--){
            xRev=xRev+list.get(i)*fac;
            fac*=10;
        }
        if(Math.abs(x-xRev)%k==0) return true;
        else return false;
    }

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        int i=sc.nextInt();
        int j=sc.nextInt();
        int k=sc.nextInt();
        int count=0; 
        for(int a=i;a<=j;a++){
            if(isBeautiful(a,k)) count++;
        }
        System.out.println(count);
    }
}