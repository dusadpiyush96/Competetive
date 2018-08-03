import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the gridChallenge function below.
    static String gridChallenge(String[] grid) {
        for(int i=0;i<grid.length;i++){
            char[] k = grid[i].toCharArray();
            Arrays.sort(k);
            String s = new String(k);
            grid[i]=s;
            //System.out.println(s);
        }
        int sum = 0;
        for(int i=0;i<grid.length;i++){
            //char first = grid[i].charAt(0);
            for(int j=1;j<grid.length;j++){
                //System.out.println(grid[j].charAt(i));
                if(grid[j].charAt(i)<grid[j-1].charAt(i)) return "NO";
                //System.out.println(grid[j].charAt(i));
                //System.out.print(grid[j].charAt(i));
                //System.out.println(" "+ grid[j-1].charAt(i));
            }
        }
        return "YES";
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int t = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int tItr = 0; tItr < t; tItr++) {
            int n = scanner.nextInt();
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            String[] grid = new String[n];

            for (int i = 0; i < n; i++) {
                String gridItem = scanner.nextLine();
                grid[i] = gridItem;
            }

            String result = gridChallenge(grid);

            bufferedWriter.write(result);
            bufferedWriter.newLine();
        }

        bufferedWriter.close();

        scanner.close();
    }
}
