/*Write a Java program that takes in a list of integers and 
  returns the largest and smallest integers in the list. */
import java.util.*;
public class ArrayList4{
    public static ArrayList<Integer> Maxmin(int[]arr){
        ArrayList<Integer> res = new ArrayList<>(2);
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for(int idx=0;idx<arr.length;idx++){
            if(arr[idx]>max){
                max=arr[idx];
               
            } 
              if(arr[idx]<min){
                min=arr[idx];

            }
        }
        res.add(max);
        res.add(min);
        return res;
    } 
    public static void main(String[]args){
        Scanner scn = new Scanner(System.in);
        int n  =  scn.nextInt();
        int[]arr = new int[n];
        for(int idx=0;idx<arr.length;idx++){
            arr[idx] = scn.nextInt();
        }
        ArrayList<Integer> res = Maxmin(arr);
        for(int i:res){System.out.println("Max "+res.get(0)+" Min "+res.get(1));return;}
    }
}