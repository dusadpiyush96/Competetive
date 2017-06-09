import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] h = new int[26];
        for(int h_i=0; h_i < 26; h_i++){
            h[h_i] = in.nextInt();
        }
        String word = in.next();
        char[] abc=new char[26];
        int fillingabc=97;
        for(int i=0;i<26;i++){
            abc[i]=(char)fillingabc;
            fillingabc++;
        }
        Map<Character,Integer> mappingAllTheCharWithIntegers=new HashMap<Character,Integer>();
        for(int i=0;i<26;i++){
            mappingAllTheCharWithIntegers.put(abc[i],h[i]);
        }
        int arrayContaingAllTheIntegersCorrespondingCharactersOfWord[]=new int[word.length()];
        for(int i=0;i<word.length();i++){
            arrayContaingAllTheIntegersCorrespondingCharactersOfWord[i]=mappingAllTheCharWithIntegers.get(word.charAt(i));
        }
        Arrays.sort(arrayContaingAllTheIntegersCorrespondingCharactersOfWord);
        System.out.println(arrayContaingAllTheIntegersCorrespondingCharactersOfWord[word.length()-1]*word.length());
        //System.out.println(abc[25]);
    }
}