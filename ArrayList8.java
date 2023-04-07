/*Given an ArrayList of integers, write a Java program to find the sum of all the even numbers in the list. */
import java.util.*;
public class ArrayList8 {
    public static int SumofEven(ArrayList<Integer> list){
        int sum = 0;
        for(int x:list){
            if(x%2==0){
                sum+=x;
            }
        }
        return sum;
    }
    public static void main(String[]args){
        ArrayList<Integer> list = new ArrayList<>();
        for(int idx=1;idx<=10;idx++){
            list.add(idx);
        }
        System.out.println(SumofEven(list)); 
    }
}
