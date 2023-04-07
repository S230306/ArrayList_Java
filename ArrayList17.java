/*Given an ArrayList of integers, write a Java program to find 
  the frequency of occurrence of each number in the list. */
import java.util.*;
public class ArrayList17 {
    public static void FindFreq(ArrayList<Integer> arr){
        int[]freq = new int[56];
        for(int idx=0;idx<arr.size();idx++){
            freq[arr.get(idx)]++;
        }
       for(int idx=0;idx<freq.length;idx++){
        System.out.println(idx+" "+freq[idx]);
       }
    }
    public static void main(String[]args){
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(12);
        arr.add(22);
        arr.add(12);
        arr.add(32);
        arr.add(11);
        arr.add(32);
        arr.add(22);
        arr.add(35);
        arr.add(55);
        arr.add(54);
        arr.add(30);
        FindFreq(arr); 
    }
}
