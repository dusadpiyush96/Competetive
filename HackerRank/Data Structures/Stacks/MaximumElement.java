import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        long N = sc.nextLong();
        Stack<Long> st = new Stack<Long>();
        Stack<Long> max_history = new Stack<Long>();
        boolean flag = true;
        long max = 0;
        for(int i=0;i<N;i++){
            long type = sc.nextLong();
            if(type==1) {
                long num = sc.nextLong();
                if(flag){
                    max_history.push(num);
                    max = max_history.peek();
                    flag=false;
                }
                st.push(num);
                if(num > max) {
                    max_history.push(num);
                    max = max_history.peek();
                }
                    
            }
            if(type==2){
                long top = st.peek();
                if(max_history.size()!=0){
                    if(top==max_history.peek()) max_history.pop();
                    try{
                        max = max_history.peek();
                    }
                    catch(Exception e){
                        max = -1;
                    }
                }
                st.pop();
            }
            if(type==3){
                    System.out.println(max);
            }
        }
    }
}