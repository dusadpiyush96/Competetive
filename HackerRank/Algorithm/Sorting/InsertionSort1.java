import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the insertionSort1 function below.
    
    static void print(int[] arr){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println(" ");
    }
    
    static void insertionSort1(int n, int[] arr) {
        int k=0;
        int a=0;
        for(int i=n-2;i>=0;i--){
            a = arr[i];
            for(int j=i-1;j>=0;j--){
                if(arr[j]<a){
                    k = j;
                    //break;
                    for(int b=i-1; b>k;b--){
                        //int t=arr[b+1];
                        arr[b+1]=arr[b];
                        //arr[b+2]=t;
                    }
                    print(arr);
                    break;
                }
            }
            //arr[k]=arr[i];
            
            arr[k]=a;
        }
        
        print(arr);
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] arr = new int[n];

        String[] arrItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int arrItem = Integer.parseInt(arrItems[i]);
            arr[i] = arrItem;
        }

        insertionSort1(n, arr);

        scanner.close();
    }
}
