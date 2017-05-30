import java.util.*;

public class Solution {

    static int solve(int n, int p){
        // Complete this function
       if(p<=n/2){
                return p/2;
            }
            else{
                return (n/2-p/2);
            }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int p = in.nextInt();
        int result = solve(n, p);
        System.out.println(result);
    }
}
