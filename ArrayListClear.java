/*clear method */
import java.util.*;
public class ArrayListClear{
    public static void main(String[]args){
        //Declare the arrayList
        ArrayList<Integer> arr = new ArrayList<>();
        // perform the add Method
        arr.add(10);
        arr.add(20);
        arr.add(30);
        arr.add(40);
        arr.add(50);
        System.out.println("Number ->"+arr);
        System.out.println();
        // adding the number at index 3.
        arr.add(3,45);
        System.out.println("Number  ->"+arr);
        System.out.println("After clear all the element");
        arr.clear();
        System.out.println(arr);
    }
}