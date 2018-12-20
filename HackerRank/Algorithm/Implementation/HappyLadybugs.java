import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the happyLadybugs function below.
    static String happyLadybugs(String b) {
        char[] arr = b.toCharArray();
        HashMap<Character,Integer> hm = new HashMap();
        for(int i=0;i<arr.length;i++){
            if(hm.containsKey(arr[i])) {
                hm.put(arr[i],hm.get(arr[i])+1);
            }
            else hm.put(arr[i],1);
        }
        Set<Character> s = hm.keySet();
        boolean present =false;
        for(char c : s){
            if(c!='_'){
                if(hm.get(c)==1) return "NO";
            }
            else present = true;
        }
        if(!present){
            if(arr.length==1) return "NO";
            if(arr[0]!=arr[1] || arr[arr.length-1]!=arr[arr.length-2]) return "NO";
            for(int i=2;i<arr.length-2;i++){
                if(arr[i+1]!=arr[i] && arr[i-1]!=arr[i]) return "NO";
            }
        }
        return "YES";
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int g = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int gItr = 0; gItr < g; gItr++) {
            int n = scanner.nextInt();
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            String b = scanner.nextLine();

            String result = happyLadybugs(b);

            bufferedWriter.write(result);
            bufferedWriter.newLine();
        }

        bufferedWriter.close();

        scanner.close();
    }
}
