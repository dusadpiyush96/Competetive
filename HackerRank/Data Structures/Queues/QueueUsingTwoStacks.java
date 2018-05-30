import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Queue<Integer> q = new LinkedList<Integer>();
        int N = sc.nextInt();
        for(int i=0;i<N;i++){
            int action = sc.nextInt();
            if(action==1){
                int element = sc.nextInt();
                q.add(element);
            }
            if(action==2){
                //int element = sc.nextInt();
                q.remove();
            }
            if(action==3){
                //int element = sc.nextInt();
                System.out.println(q.peek());
            }
        }
    }
}