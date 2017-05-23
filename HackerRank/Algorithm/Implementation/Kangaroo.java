import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int x1 = in.nextInt();
        int v1 = in.nextInt();
        int x2 = in.nextInt();
        int v2 = in.nextInt();
        int x=0;
        if(true){
            if((x1>x2) && (v2>v1) ){
                int diff = v2-v1;
                if((x1-x2)%diff==0){
                    System.out.println("YES");
                    x++;
                }
                else{
                    System.out.println("NO");
                    x++;
                }
            }
            if((x1>x2) && (v2<v1) ){
                System.out.println("NO");
                x++;
            }
            if((x1<x2) && (v2>v1) ){
                System.out.println("NO");
                x++;
            }
            if(((x1<x2) && (v2<v1))   ){
                int diff = v1-v2;
                if((x2-x1)%diff==0){
                    System.out.println("YES");
                    x++;
                }
                else{
                    System.out.println("NO");
                    x++;
                }
            }
            if(x1==x2){
                System.out.println("YES");
                x++;
            }
        }
        if(x==0) System.out.println("NO");
    }
}
