import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {
    
    static char[][] check(int row, int coloumn, char[][] chars){
        try{if((chars[row][coloumn]>chars[row+1][coloumn])  &&  (chars[row][coloumn]>chars[row-1][coloumn])
              &&  (chars[row][coloumn]>chars[row][coloumn+1])  &&  (chars[row][coloumn]>chars[row][coloumn-1])){
            chars[row][coloumn]='X';
        }}
        catch(Exception e){}
        return chars;
    }

    // Complete the cavityMap function below.
    static String[] cavityMap(String[] grid) {
        int N = grid.length;
        /*int[][] nums = new int[N][N];
        for(int i=0;i<N;i++){
            int k = Integer.parseInt(grid[i]);
            for(int j=0;j<N;j++){
                nums[i][j] = k%10;
                k/=10;
                System.out.println(nums[i][j]);
            }
        }*/
        char[][] chars = new char[N][N];
        for(int i=0;i<N;i++){
            String k = grid[i];
            char[] c = k.toCharArray();
            chars[i] = c;
        }
        for(int i=1;i<N-1;i++){
            for(int j=1;j<N-1;j++){
                chars =check(i,j,chars);
                //System.out.println(".");
            }
        }
        String[] s = new String[grid.length];
        for(int i=0;i<N;i++){
            String k = new String(chars[i]);
            s[i]=k;
        }
        return s;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        String[] grid = new String[n];

        for (int i = 0; i < n; i++) {
            String gridItem = scanner.nextLine();
            grid[i] = gridItem;
        }

        String[] result = cavityMap(grid);

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
