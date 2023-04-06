/*Write a program to remove all occurrences of a particular element
 from an ArrayList. */
 import java.util.*;
 public class ArrayList3{
    public static void Remove(int[]arr,int y){
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = list.size() - 1; i >= 0; i--) {
            if (list.get(i) == y) {
                list.remove(i); 
            }
        }
        System.out.println("ArrayList after removing " + y + ": " + list);
    }
    public static void main(String[]args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[]arr = new int[n];
        for(int idx=0;idx<arr.length;idx++){
            arr[idx] = scn.nextInt();
        }
        int removeElem = scn.nextInt();
        Remove(arr,removeElem);
    }
 }