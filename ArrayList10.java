/*Given an ArrayList of integers, write a Java program to find 
 the median (middle) value in the list. 
 note use the array for inputing the value in arrayList*/

import java.util.*;
public class ArrayList10 {
    public static int Median(ArrayList<Integer>list,int n){
        Collections.sort(list);
        int median = 0;
        if(n%2==0){
            median = ((n/2)+(n/2+1))/2;
        }else{
            median = (n/2+1);
        }
        return median;
    }
    public static void main(String[]args){
        Scanner scn = new Scanner(System.in);
        int n  = scn.nextInt();
        int[]arr = new int[n];
        for(int idx=0;idx<arr.length;idx++){
         arr[idx] = scn.nextInt();
        }
        ArrayList<Integer> list = new ArrayList<>();
        for(int idx=0;idx<arr.length;idx++){
            list.add(arr[idx]);
        }
        System.out.println(Median(list,n));
    }
}
