import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.next();
        char[] l= str.toCharArray();
        //Arrays.sort(l);
        Stack<Character> st = new Stack<Character>();
        for(int i=0;i<l.length;i++){
            if(st.size()==0) st.push(l[i]);
            else{
                if(st.peek()==l[i]) st.pop();
                else st.push(l[i]);
            }
        }
        if(st.size()==0) System.out.println("Empty String");
        else{
            String s ="";
            while(st.size()!=0){
                s=st.pop()+s;
            }
            System.out.println(s);
        }
    }
}