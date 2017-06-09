import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int liking=2;
        int total=2;
        for(int i=0;i<n-1;i++){
            int sent=liking*3;
            liking=sent/2;
            total+=liking;
        }
        System.out.println(total);
    }
}