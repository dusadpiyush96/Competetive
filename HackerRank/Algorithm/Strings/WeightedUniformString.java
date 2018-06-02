import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the weightedUniformStrings function below.
    static String[] weightedUniformStrings(String s, int[] queries) {
        char[] c = s.toCharArray();
        int n = queries.length;
        Set<Integer> nums = new HashSet<Integer>();
        for(int i=0;i<c.length;i++){
            char x = c[i];
            int score = (int)x - 96;
            int a = 0;
            int list_size = 0;
            String y ="";
            while(x==c[i+a]){
                y+=c[i+a];
                a++;
                //list.add(y);
                list_size++;
                nums.add(score*list_size);
                //System.out.println(y);
                if(i+a>=c.length) break;
            }
            if(a==1) continue;
            i=i+a-1;
        }
        String[] result = new String[n];
        for(int i=0;i<n;i++){
            if(nums.contains(queries[i])) result[i]="Yes";
            else result[i]="No";
        }
        return result;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String s = scanner.nextLine();

        int queriesCount = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] queries = new int[queriesCount];

        for (int i = 0; i < queriesCount; i++) {
            int queriesItem = scanner.nextInt();
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
            queries[i] = queriesItem;
        }

        String[] result = weightedUniformStrings(s, queries);

        for (int i = 0; i < result.length; i++) {
            bufferedWriter.write(result[i]);

            if (i != result.length - 1) {
                bufferedWriter.write("\n");
            }
        }

        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
