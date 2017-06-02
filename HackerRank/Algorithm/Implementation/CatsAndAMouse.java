import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int q = in.nextInt();
        for(int a0 = 0; a0 < q; a0++){
            double x = in.nextInt();
            double y = in.nextInt();
            double z = in.nextInt();
            if(z==(x+y)/2 || (y==x)){
                System.out.println("Mouse C");
            }
            else if(Math.abs(x-z)>Math.abs(y-z)){
                System.out.println("Cat B");
            }
            else{
                System.out.println("Cat A");
            }
        }
    }
}
