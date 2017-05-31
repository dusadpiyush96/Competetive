import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int counter=0;
        int counterNow = 0;
        int counterPrev = 0;
        int result=0;
        String str = sc.next();
        for(int i=0;i<N;i++){
            char c = str.charAt(i);
            counterPrev=counterNow;
            if(c=='U') counter++;
            else counter--;
            counterNow=counter;
            if(counterPrev==-1 && counterNow==0){
                result++;
            }
        }
        System.out.println(result);
    }
}