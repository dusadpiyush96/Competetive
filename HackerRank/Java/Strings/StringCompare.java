import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        String g=scan.next();
        int subLength=scan.nextInt();
        List<String> l=new ArrayList<String>();
        for(int i=0;i<g.length()-subLength+1;i++){
            l.add(g.substring(i,i+subLength));
        }
        for(int i=0;i<l.size();i++){
            for(int j=1;j<l.size();j++){
                if(((l.get(j-1)).compareTo(l.get(j)))<0){
                    String k=l.get(j-1);
                    l.set(j-1,l.get(j));
                    l.set(j,k);
                }
            }
        }
        
        System.out.println(l.get(l.size()-1));
        System.out.println(l.get(0));
    }
}