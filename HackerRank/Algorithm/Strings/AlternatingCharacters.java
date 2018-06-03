import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=0;i<n;i++){
            String s = sc.next();
            Stack<Character> st = new Stack<Character>();
            char[] c = s.toCharArray();
            int count = 0;
            for(int j=0;j<c.length;j++){
                if(st.isEmpty()){
                    st.push(c[j]);
                    continue;
                }
                else if(st.peek()==c[j]){
                    count++;
                    continue;
                }
                else st.push(c[j]);
            }
            System.out.println(count);
        }
    }
}
