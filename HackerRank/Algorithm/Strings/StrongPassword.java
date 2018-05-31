import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    static int minimumNumber(int n, String password) {
        boolean lower_case = false;
        boolean upper_case = false;
        boolean number = false;
        boolean special = false;
        String[] s = {"0123456789","abcdefghijklmnopqrstuvwxyz","ABCDEFGHIJKLMNOPQRSTUVWXYZ","!@#$%^&*()-+"};
        for(int i=0;i<n-1;i++){
            if(s[0].contains(password.substring(i,i+1))) number=true;
            if(s[1].contains(password.substring(i,i+1))) lower_case=true;
            if(s[2].contains(password.substring(i,i+1))) upper_case=true;
            if(s[3].contains(password.substring(i,i+1))) special=true;
        }
        if(s[0].contains(password.substring(n-1))) number=true;
        if(s[1].contains(password.substring(n-1))) lower_case=true;
        if(s[2].contains(password.substring(n-1))) upper_case=true;
        if(s[3].contains(password.substring(n-1))) special=true;
        int cond = 0;
        if(number!=true) cond++;
        if(lower_case!=true) cond++;
        if(upper_case!=true) cond++;
        if(special!=true) cond++;
        
        if(n>6){
            if(cond==0) return 0;
            else return cond;
        }
        else{
            if(cond==0) return 6-n;
            else{
                if(n+cond>=6) return cond;
                else return 6-n;
            }
        }

    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        String password = scanner.nextLine();

        int answer = minimumNumber(n, password);

        bufferedWriter.write(String.valueOf(answer));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
