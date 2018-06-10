import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the acmTeam function below.
    static int[] acmTeam(String[] topic) {
        int n = topic.length;
        Hashtable<Integer,Integer> hm = new Hashtable<Integer,Integer>();
        int max = 0;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                char[] str1 = topic[i].toCharArray();
                char[] str2 = topic[j].toCharArray();
                int count = 0;
                for(int k=0;k<str1.length;k++){
                    if(str1[k]=='1' || str2[k]=='1') count++;
                }
                if(count>max) max=count;
                if(hm.containsKey(count)){
                    int m = hm.get(count);
                    hm.put(count,++m);
                }
                else {
                    hm.put(count,1);
                }
            }
        }
        int[] fin = {max,hm.get(max)};
        return fin;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String[] nm = scanner.nextLine().split(" ");

        int n = Integer.parseInt(nm[0]);

        int m = Integer.parseInt(nm[1]);

        String[] topic = new String[n];

        for (int i = 0; i < n; i++) {
            String topicItem = scanner.nextLine();
            topic[i] = topicItem;
        }

        int[] result = acmTeam(topic);

        for (int i = 0; i < result.length; i++) {
            bufferedWriter.write(String.valueOf(result[i]));

            if (i != result.length - 1) {
                bufferedWriter.write("\n");
            }
        }

        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
