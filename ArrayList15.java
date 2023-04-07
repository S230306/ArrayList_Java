/*Given an ArrayList of integers, write a Java program to find the difference between
 the maximum and minimum values in the list. */
import java.util.*;
public class ArrayList15 {
   public static int DifferenceMinMax(ArrayList<Integer>list,int n){
    int max = Integer.MIN_VALUE;
    int min = Integer.MAX_VALUE;
    for(int x:list){
        if(x>max){max=x;}
        if(x<min){min=x;}
     
    }
    int deff = max - min;
    return deff;
   }
   public static void main(String[]args){
    Scanner scn = new Scanner(System.in);
    int n  =  scn.nextInt();
    int[]arr = new int[n];
    for(int idx=0;idx<arr.length;idx++){
        arr[idx] = scn.nextInt();
    }
    ArrayList<Integer> list = new ArrayList<>();
    for(int idx:arr){
        list.add(idx);
     }
     System.out.println(DifferenceMinMax(list,n));
   } 
}
