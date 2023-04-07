/*Given an ArrayList of integers, write a Java program to find the
  average value of the numbers in the list. */
import java.util.*;
public class ArrayList11 {
    public static int Average(ArrayList<Integer> List,int n){
        int sum = 0;
        for(int x:List){sum+=x;}
        double average = (double) sum / List.size();
        return (int)average;
}
    public static void main(String[]args){
        Scanner scn = new Scanner(System.in);
         int n  = scn.nextInt();
         int[] arr = new int[n];
        for(int idx=0;idx<arr.length;idx++){
         arr[idx] = scn.nextInt();
        }
        ArrayList<Integer> List = new ArrayList<>();
        for(int x:arr){
            List.add(x);
        }
        System.out.println(Average(List,n));
    }
}
