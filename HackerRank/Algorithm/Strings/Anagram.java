import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the anagram function below.
    static int anagram(String s) {
        char[] c = s.toCharArray();
        ArrayList<Character> hs = new ArrayList<Character>();
        if(c.length%2==1) return -1;
        for(int i=0;i<c.length/2;i++){
            hs.add(c[i]);
            System.out.println(c[i]);
        }
        int count = hs.size();
        for(int i=0;i<count;i++){
            System.out.println(c[c.length-1-i]);
            System.out.println(hs.contains(c[c.length-1-i]));
            hs.remove(c[c.length-1-i]);
            try{
                if(hs.size()!=0 && hs.contains(c[c.length-1-i]) ) hs.remove(c[c.length-1-i]);
            }
            catch(Exception e){ 
                continue;
                              
            }
        }
        if(hs.size()==0) return -1;
        else return hs.size();
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int q = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int qItr = 0; qItr < q; qItr++) {
            String s = scanner.nextLine();

            int result = anagram(s);
            System.out.println("");
            bufferedWriter.write(String.valueOf(result));
            bufferedWriter.newLine();
        }

        bufferedWriter.close();

        scanner.close();
    }
}
