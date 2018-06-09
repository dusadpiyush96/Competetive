import java.io.*;
import java.math.*;
import java.text.*;
import java.util.*;
import java.util.regex.*;

public class Solution {
    static String timeConversion(String s) {
        String st = s.substring(0,2);
        String am_pm = s.substring(8);
        System.out.println(am_pm);
        if(am_pm.equals("AM")){
            int k = Integer.parseInt(st);
            if(k==12) return("00"+s.substring(2,8));
            return(s.substring(0,8));
        }
        else{
            int k = Integer.parseInt(st);
            if(k==12) return(s.substring(0,8));
            k+=12;
            return(Integer.toString(k)+s.substring(2,8));
        }
    }

    private static final Scanner scan = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String s = scan.nextLine();

        String result = timeConversion(s);

        bw.write(result);
        bw.newLine();

        bw.close();
    }
}
