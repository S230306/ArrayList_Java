/*Given an ArrayList of strings, write a Java program to sort
 the list in alphabeticorder. */
import java.util.*;
public class ArrayList6{
    public static void main(String[]args){
        ArrayList<String> list = new ArrayList<>();
        list.add("Shailendra");
        list.add("Prashant");
        list.add("Raj Kumar");
        list.add("Komal");
        list.add("Prema");
        System.out.println(list+"");
        Collections.sort(list);
        System.out.println(list);
    }
    
}
