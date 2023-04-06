/*Write a program to find the second largest element
 in an Array. */
 import java.util.*;
 public class ArrayList2{
    public static int SecondMax(int[]arr){
        int largest = Integer.MIN_VALUE;
    int SecondLar = Integer.MIN_VALUE;
    for(int idx=0; idx<arr.length; idx++){
        if(arr[idx]>largest){
            SecondLar = largest;
            largest = arr[idx];
        } else if (arr[idx] > SecondLar && arr[idx] != largest) {
            SecondLar = arr[idx];
        }
    }
    return SecondLar;
}
    public static void main(String[]args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[]arr = new int[n];
        for(int idx=0;idx<arr.length;idx++){
            arr[idx]=scn.nextInt();
        }
        int res = SecondMax(arr);
        System.out.println(res);
   }
 }