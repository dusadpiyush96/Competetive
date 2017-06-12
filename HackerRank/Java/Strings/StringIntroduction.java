import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String B=sc.next();
        System.out.println(A.length()+B.length());
        for(int i=0;i<Math.min(A.length(),B.length());i++){
            if(A.charAt(i)<B.charAt(i)){
                System.out.println("No");
                break;
            }
            else if(A.charAt(i)>B.charAt(i)){
                System.out.println("Yes");
                break;
            }
            else if(i==Math.min(A.length(),B.length())-1){
                System.out.println("No");
            }
            else{
                continue;
            }
        }
        String h=" ";
        String d=A+B+h;
        //System.out.println(A+" "+B);
        for(int j=0;j<(A.length()+B.length()+1);j++){
            if(j==0){
                System.out.print((char)(d.charAt(0)-32));
            }
            else if(j==A.length()){
                System.out.print((char)(d.charAt(j)-32));
            }
            else if(j==A.length()-1){
                System.out.print(d.charAt(j)+" ");
            }
            else{
                System.out.print(d.charAt(j));
            }
        }
    }
}
