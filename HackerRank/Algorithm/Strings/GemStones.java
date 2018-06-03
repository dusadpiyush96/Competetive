import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the gemstones function below.
    static int gemstones(String[] arr) {
        int n = arr[0].length();
        Set<Character> hs = new HashSet<Character>();
        for(int i=0;i<n;i++){
            System.out.println(arr[0].charAt(i));
            hs.add(arr[0].charAt(i));
        }
        System.out.println("");
        Stack<Character> st = new Stack<Character>();
        for(int i=1;i<arr.length;i++){
            String s = arr[i];
            System.out.println(s);
            try{
                for(char c : hs){
                    if(s.indexOf(c)>=0) continue;
                    else {
                        System.out.println(c);
                        st.push(c);
                    }
                }
            }
            catch(Exception e){}
        }
        while(st.size()>0) hs.remove(st.pop());
        return hs.size();
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        String[] arr = new String[n];

        for (int i = 0; i < n; i++) {
            String arrItem = scanner.nextLine();
            arr[i] = arrItem;
        }

        int result = gemstones(arr);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
