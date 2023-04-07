/*Given an ArrayList of strings, write a Java program to 
 remove all the duplicate strings from the list. */
import java.util.*;
public class ArrayList9 {
    public static void main(String[]args){
        ArrayList<String> arr = new ArrayList<>();
        arr.add("Shailendra");
        arr.add("Anisha");
        arr.add("Purvi");
        arr.add("Ritik");
        arr.add("Purvi");
        arr.add("Shailendra");
        arr.add("Shree Ram");
        arr.add("Anisha");
        // with hashset
        // HashSet<String> set = new HashSet<>();
        // for(String x:arr){
        //    set.add(x);
        // }
        // for(String y:set){
        //     System.out.println(y+" ");
        // }
        // with arrayList
        ArrayList<String> newArr = new ArrayList<>();
        for(String x:arr){
            if(!newArr.contains(x)){
                newArr.add(x);
            }
          }
        for(String y:newArr){System.out.println(y+" ");}
        }
    }
