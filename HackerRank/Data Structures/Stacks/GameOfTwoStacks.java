import java.io.*;
import java.math.*;
import java.text.*;
import java.util.*;
import java.util.regex.*;

class Blocks{
    private int height;
    
    public Blocks(int h){
        this.height=h;
    }
    
    public int getHeight(){
        return this.height;
    }
}

class Cylinder{
    
    private Stack<Blocks> coll;
    private int height;
    
    public Cylinder(int[] ht){
        this.coll = new Stack<Blocks>();
        for(int h=ht.length-1;h>=0;h--){
            this.coll.push(new Blocks(ht[h]));
            this.height+=ht[h];
        }
    }
    
    public int getHeight(){
        return this.height;
    }
    
    public Stack<Blocks> getStack(){
        return this.coll;
    }
    
    public int removeFirst(){
        this.height=this.height-this.coll.peek().getHeight();
        return this.coll.pop().getHeight();
    }
}

class HeightComparator implements Comparator<Cylinder> {
    @Override 
    public int compare(Cylinder tv1, Cylinder tv2) {
        int tv1Size = tv1.getHeight();
        int tv2Size = tv2.getHeight();
 
        if (tv1Size > tv2Size) {
            return 1; 
        } else if (tv1Size < tv2Size) {
            return -1; 
        } else { 
            return 0; 
        } 
    } 
} 

public class Solution {

    /*
     * Complete the equalStacks function below.
     */
    static int equalStacks(int[] h1, int[] h2, int[] h3) {
        Cylinder cy1 = new Cylinder(h1);
        Cylinder cy2 = new Cylinder(h2);
        Cylinder cy3 = new Cylinder(h3);
        Cylinder[] arr = {cy1,cy2,cy3};
        int count =0;
        while((cy1.getHeight()!=cy2.getHeight()) || (cy2.getHeight()!=cy3.getHeight()) || (cy3.getHeight()!=cy1.getHeight())){
            Arrays.sort(arr, new HeightComparator());
            System.out.println(cy1.getHeight());
            System.out.println(cy2.getHeight());
            System.out.println(cy3.getHeight());
            while(arr[2].getHeight()>arr[0].getHeight()){
                System.out.println("Removed:"+arr[2].removeFirst());
                count++;
            }
            while(arr[1].getHeight()>arr[0].getHeight()){
                System.out.println("Removed:"+arr[1].removeFirst());
                count++;
            }
            System.out.println("");
            System.out.println(cy1.getHeight());
            System.out.println(cy2.getHeight());
            System.out.println(cy3.getHeight());
            System.out.println("********************");
            //Arrays.sort(arr);
        }
        return cy3.getHeight();
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String[] n1N2N3 = scanner.nextLine().split(" ");

        int n1 = Integer.parseInt(n1N2N3[0].trim());

        int n2 = Integer.parseInt(n1N2N3[1].trim());

        int n3 = Integer.parseInt(n1N2N3[2].trim());

        int[] h1 = new int[n1];

        String[] h1Items = scanner.nextLine().split(" ");

        for (int h1Itr = 0; h1Itr < n1; h1Itr++) {
            int h1Item = Integer.parseInt(h1Items[h1Itr].trim());
            h1[h1Itr] = h1Item;
        }

        int[] h2 = new int[n2];

        String[] h2Items = scanner.nextLine().split(" ");

        for (int h2Itr = 0; h2Itr < n2; h2Itr++) {
            int h2Item = Integer.parseInt(h2Items[h2Itr].trim());
            h2[h2Itr] = h2Item;
        }

        int[] h3 = new int[n3];

        String[] h3Items = scanner.nextLine().split(" ");

        for (int h3Itr = 0; h3Itr < n3; h3Itr++) {
            int h3Item = Integer.parseInt(h3Items[h3Itr].trim());
            h3[h3Itr] = h3Item;
        }

        int result = equalStacks(h1, h2, h3);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();
    }
}
