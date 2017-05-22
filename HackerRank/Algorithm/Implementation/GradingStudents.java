import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        for(int a0 = 0; a0 < n; a0++){
            int grade = in.nextInt();
            // your code goes here
            
            if(grade>=38 && (grade%5==3)){
                System.out.println(grade+2);
                continue;
            }
            if(grade>=38 && (grade%5==4)){
                System.out.println(grade+1);
                continue;
            }
            if(grade<38){
                 System.out.println(grade);
                continue;
            }
            if(grade>=38){
                System.out.println(grade);
            }
        }
    }
}
