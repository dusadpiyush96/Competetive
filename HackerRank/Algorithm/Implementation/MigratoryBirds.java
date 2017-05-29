import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

class Solution {

    public static void main(String[] args) {
    	try{
	        Scanner in = new Scanner(System.in);
	        int n = in.nextInt();
	        int[] types = new int[n];
	        int[] freq=new int[5];
	        for(int types_i=0; types_i < n; types_i++){
	            types[types_i] = in.nextInt();
	            switch(types[types_i]){
	                case 1:
	                    freq[0]++;
	                    break;
	                case 2:
	                    freq[1]++;
	                    break;
	                case 3:
	                    freq[2]++;
	                    break;
	                case 4:
	                    freq[3]++;
	                    break;
	                case 5:
	                    freq[4]++;
	                    break;
	                default:
	                    break;
	            }
	            
	        }
	        int arr[]=new int[5];
	        arr=Arrays.copyOf(freq,5);
	        Arrays.sort(arr);
	        int maxFreq=arr[4];
	        for(int i=0;i<5;i++){
	            if(maxFreq==freq[i]){
	                System.out.println(i+1);
                    break;
	            }
	        }
        }// your code goes here
        catch(Exception e){
        	System.out.println(e);
        }
    }
}
