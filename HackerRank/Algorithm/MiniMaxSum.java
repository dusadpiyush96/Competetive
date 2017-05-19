import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        long a = in.nextLong();
        long b = in.nextLong();
        long c = in.nextLong();
        long d = in.nextLong();
        long e = in.nextLong();
        long sum[]=new long[5];
        sum[0]=a+b+c+d;
        sum[1]=e+b+c+d;
        sum[2]=a+e+c+d;        
        sum[3]=a+b+e+d;
        sum[4]=a+b+c+e;
        Arrays.sort(sum);
        System.out.print(sum[0]+" " +sum[4]);
    }
}
