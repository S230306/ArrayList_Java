/*Given an ArrayList of integers, write a Java program to remove 
  all the even numbers from the list. */
import java.util.*;
public class ArrayList14 {
    public static void main(String[]args){
        ArrayList<Integer> arr = new ArrayList<>();
        for(int idx=0;idx<=10;idx++){
            arr.add(idx);
        }
        Iterator<Integer> iter  = arr.iterator();
        while(iter.hasNext()){
            int x = iter.next();
            if(x%2==0) iter.remove();
        }
        for(int x:arr){
            System.out.print(x+" ");
        }
    }
}
