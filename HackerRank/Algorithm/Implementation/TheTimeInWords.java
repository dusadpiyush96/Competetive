import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the timeInWords function below.
    static String timeInWords(int h, int m) {
        String[] words_minutes =                  {"zero","one","two","three","four","five","six","seven","eight","nine","ten","eleven","twelve","thirteen"
                         ,"fourteen","quarter","sixteen","seventeen","eighteen","nineteen","twenty","twenty one","twenty two"
                         ,"twenty three","twenty four","twenty five","twenty six","twenty seven","twenty eight","twenty nine"
                         ,"half"};
        //String[] words_hours = {"zero","one","two","three","four","five","six","seven","eight","nine","ten","eleven","twelve"}
        if(m==0){
            return words_minutes[h]+" o' clock";
        }
        
        if(m<=30){
            if(m==15) return words_minutes[m]+" past "+words_minutes[h];
            if(m==30) return words_minutes[m]+" past "+words_minutes[h];
            if(m==1) return words_minutes[m]+" minute past "+words_minutes[h];
            return words_minutes[m]+" minutes past "+words_minutes[h];
        }
        else{
            m=60-m;
            if(h==12) h=0;
            if(m==15) return words_minutes[m]+" to "+words_minutes[h+1];
            //if(h==12) h=0;
            if(m==1) return words_minutes[m]+" minute to "+words_minutes[h+1];
            return words_minutes[m]+" minutes to "+words_minutes[h+1];
        }
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int h = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int m = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        String result = timeInWords(h, m);

        bufferedWriter.write(result);
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
