import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    static int anagram(String s) {
        char[] c = s.toCharArray();
        List<Character> hs = new ArrayList<Character>();
        if(c.length%2==1) return -1;
        for(int i=0;i<c.length/2;i++){
            hs.add(c[i]);
            System.out.println(c[i]);
        }
        ListIterator<Character> it = hs.listIterator();
        int count = 0;
        while(it.hasNext()){
            char ch = it.next();
            for(int i=c.length/2;i<c.length;i++){
                if(ch==c[i]){
                    c[i]='5';
                    count++;
                    break;
                }
            }
        }
        if(count==hs.size()) return 0;
        else return hs.size()-count;
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
