import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str = in.next();
        //System.out.print(s);
        int count=0;
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)>64 && str.charAt(i)<91) count+=1;
        }
        System.out.println(count+1);
    }
}
