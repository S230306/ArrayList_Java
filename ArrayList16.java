/*Given an ArrayList of strings, write a Java program to reverse 
the order of the strings in the list. */
import java.util.*;
public class ArrayList16 {
    public static void main(String[]args){
        ArrayList<String> list = new ArrayList<>();
        list.add("Shailedra");
        list.add("Anisha");
        list.add("God");
        list.add("hey lord");
        list.add("Anisha Rawat");
        Collections.sort(list);
        System.out.println(list);
        Collections.reverse(list);
        System.out.println(list);
    }
}
