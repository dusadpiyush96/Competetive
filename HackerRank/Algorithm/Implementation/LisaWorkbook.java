import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the workbook function below.
    static int workbook(int n, int k, int[] arr) {
        int last_page_of_chap = 0;
        int first_page_of_chap = 1;
        int count = 0;
        int first_ques_on_page = 0;
        int curr_page=0;
        for(int i=0 ; i<n;i++){
            int no_problem_in_chap = arr[i];
            int no_of_pages_in_chap = arr[i]/k;
            if(arr[i]%k!=0) no_of_pages_in_chap++;
            last_page_of_chap+=no_of_pages_in_chap;
            int[] totl_ques_on_each_page = new int[no_of_pages_in_chap];
            int t = no_problem_in_chap;
            //System.out.println(k);
            for(int a=0;a<no_of_pages_in_chap;a++){
                t=t-k;
                if(t>=k) totl_ques_on_each_page[a] = k;
                else totl_ques_on_each_page[a]=t+k;
                //System.out.println(totl_ques_on_each_page[a]);
            }
            for(int j=0;j<no_of_pages_in_chap;j++){
                curr_page = first_page_of_chap+j;
                
                for(int l=0;l<totl_ques_on_each_page[j];l++){
                    if(first_ques_on_page+1+l==curr_page) count++;
                    //System.out.println(first_ques_on_page+1+l);
                }
                first_ques_on_page+=k+1;
                //System.out.println(curr_page);
            }
            
            first_page_of_chap+=no_of_pages_in_chap;
            curr_page=first_page_of_chap;
            first_ques_on_page=1;
            //System.out.println(i);
        }
        return count;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String[] nk = scanner.nextLine().split(" ");

        int n = Integer.parseInt(nk[0]);

        int k = Integer.parseInt(nk[1]);

        int[] arr = new int[n];

        String[] arrItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int arrItem = Integer.parseInt(arrItems[i]);
            arr[i] = arrItem;
        }

        int result = workbook(n, k, arr);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
