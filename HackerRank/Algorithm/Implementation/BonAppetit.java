import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        int K=sc.nextInt();
        int[] prices=new int[N];
        int sumWithoutKth=0;
        for(int i=0;i<N;i++){
            prices[i]=sc.nextInt();
            if(i!=K) sumWithoutKth+=prices[i];
        }
        int priceCharged=sc.nextInt();
        if(priceCharged==sumWithoutKth/2){
            System.out.println("Bon Appetit");
        }
        else{
             System.out.println(prices[K]/2);
        }
    }
}