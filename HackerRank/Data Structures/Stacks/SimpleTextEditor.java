import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        Stack<String> st = new Stack<String>();
        for(int i=0;i<k;i++){
            int condn = sc.nextInt();
            if(condn==1){
                String app = sc.next();
                if(st.isEmpty()==false) st.push(st.peek()+app);
                else st.push(app);
            }
            if(condn==2){
                int l = sc.nextInt();
                String s = st.peek();
                st.push(s.substring(0,s.length()-l));
                //sc.nextLine();
            }
            if(condn==3){
                System.out.println(st.peek().charAt(sc.nextInt()-1));
                //sc.nextLine();
            }
            if(condn==4){
                if(st.size()!=0) st.pop();
            }
        }
    }
}